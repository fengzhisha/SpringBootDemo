package com.jiangfeixiang.mpdemo.springbootmp.controller;

import cn.hutool.core.lang.UUID;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.ImmutableMap;
import com.jiangfeixiang.mpdemo.springbootmp.entity.Student;
import com.jiangfeixiang.mpdemo.springbootmp.service.IStudentService;
import com.jiangfeixiang.mpdemo.springbootmp.util.ExcelUtilPlus;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 学生表 前端控制器
 * </p>
 *
 * @author zhongl
 * @since 2019-06-16
 */
@RestController
@RequestMapping("/springbootmp/student")
public class StudentController {

    @Autowired
    private IStudentService iStudentService;

    /**
     * （逻辑查询）所有的学生信息
     * URL：http://localhost:8888/springbootmp/student/getAllStudent
     *
     * @return 所有的未被逻辑删除的学生信息
     */
    @RequestMapping("/getAllStudent")
    public List<Student> getAllStudent() {
        List<Student> list = iStudentService.list();
        return list;
    }

    /**
     * 分页查询：根据名称模糊匹配
     *
     * @param currentPage 当前页码
     * @param pageCount   当前页显示条目数
     * @param orderBy     排序字段
     * @param isDesc      排序规则（true：降序，false：升序）
     * @return
     */
    @GetMapping(value = "pageAllByNameLike")
    public Map<String, Object> pageAllByNameLike(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
                                                 @RequestParam(value = "pageCount", defaultValue = "10") int pageCount,
                                                 @RequestParam(value = "orderBy") String orderBy,
                                                 @RequestParam(value = "isDesc", defaultValue = "true") boolean isDesc,
                                                 @RequestParam(value = "search", required = false) String search) {
        Page<Student> page = new Page(currentPage, pageCount);
        QueryWrapper<Student> queryWrapper = new QueryWrapper<Student>();
        if (StringUtils.isNotBlank(search)) {
            Student student = JSONUtil.toBean(search, Student.class);
            if (student.getStuId() != null) {
                queryWrapper.eq("stu_id", student.getStuId());
            }
            if (StringUtils.isNotBlank(student.getStuName())) {
                queryWrapper.like("stu_name", student.getStuName());
            }
            if (StringUtils.isNotBlank(student.getStuSex())) {
                queryWrapper.eq("stu_sex", student.getStuSex());
            }
            if (student.getStuAge() != null) {
                queryWrapper.eq("stu_age", student.getStuAge());
            }
        }
        if (isDesc) {
            page.setDesc(orderBy);
        } else {
            page.setAsc(orderBy);
        }
        IPage<Student> iPage = iStudentService.page(page, queryWrapper);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("data", iPage.getRecords());
        result.put("page", ImmutableMap.builder()
                .put("currentPage", iPage.getCurrent())
                .put("pageCount", iPage.getSize())
                .put("orderBy", orderBy)
                .put("isDesc", isDesc)
                .put("totalPage", iPage.getPages())
                .put("totalCount", iPage.getTotal()).build());
        return result;
    }

    /**
     * (逻辑查询)根据学生ID，得到学生信息详情
     * URL：http://localhost:8888/springbootmp/student/getById?id=3
     *
     * @param id 学生ID
     * @return 学生信息
     */
    @GetMapping(value = "/getById")
    public Student getById(@RequestParam(value = "id", defaultValue = "1") int id) {
        return iStudentService.getById(id);
    }

    /**
     * 导出所有学生信息详情
     * URL：http://localhost:8888/springbootmp/student/exportAllStudent
     *
     * @return 是否导出成功
     */
    @GetMapping(value = "/exportAllStudent")
    public String exportAllStudent() {
        try {
            List<Student> students = iStudentService.list();
            Map<String, String> headerMap = ImmutableMap.of("stuId", "学生编号", "stuName", "学生姓名", "stuAge", "学生年龄",
                    "stuSex", "学生性别", "deleted", "数据有效性：0无效，1有效");
            ExcelUtilPlus.beanExport(UUID.fastUUID().toString(), students, headerMap);
            return "导出成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "导出失败";
        }
    }

    /**
     * 逻辑删除
     * 请使用Postman测试：http://localhost:8888/springbootmp/student/deleteById/4
     *
     * @param id 学生ID
     * @return 是否删除成功
     */
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") int id) {
        return iStudentService.removeById(id) ? "删除成功" : "删除失败";
    }

}
