package com.study.module.springbootmybatis.controller;

import com.study.module.springbootmybatis.SexEnum;
import com.study.module.springbootmybatis.entity.Teacher;
import com.study.module.springbootmybatis.entity.TeacherDO;
import com.study.module.springbootmybatis.service.TeacherService;
import com.study.module.springbootmybatis.utils.Result;
import com.study.module.springbootmybatis.vo.TeacherVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 教师表(Teacher)表控制层
 *
 * @author makejava
 * @since 2020-11-07 19:04:41
 */
@Api(value = "教师管理", tags = {"教师管理"}, description = "教师管理说明", hidden = false)
@Slf4j
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    /**
     * 服务对象
     */
    @Autowired
    private TeacherService teacherService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    @ApiIgnore(value = "忽略此接口提供给前端调用")
    public Teacher selectOne(Long id) {
        return this.teacherService.queryById(id);
    }

    /**
     * REST ful 接口，查看教师详情
     *
     * @param id 教师唯一标识 ID
     * @return 教师详情信息
     */
    @GetMapping(value = "/getById/{id}")
    @ApiOperation(value = "获取教师详情", notes = "teacher details", httpMethod = "GET",
            nickname = "Teacher-Details")
    public Result<?> getById(@PathVariable(value = "id") Long id) {
        try {
            return Result.ok(this.teacherService.queryById(id));
        } catch (Exception e) {
            e.printStackTrace();
            log.error("server error,", e);
            return Result.error("server error.");
        }
    }

    /**
     * REST ful 接口，查看教师详情
     *
     * @param id     教师唯一标识 ID
     * @param delTag 逻辑删除标识
     * @return 教师详情信息
     */
    @GetMapping(value = "/getByIdLogic")
    @ApiOperation(value = "获取教师详情", notes = "get logic exist teacher details.", httpMethod = "GET",
            nickname = "Teacher-Details")
    public Result<?> getByIdLogic(@RequestParam(value = "id") Long id,
                                  @RequestParam(value = "delTag", required = false, defaultValue = "0") Integer delTag) {
        try {

            TeacherDO teacherDO = this.teacherService.getById(id, delTag);
            if (ObjectUtils.isEmpty(teacherDO)) {
                return Result.error("不存在相关数据");
            }
            TeacherVO teacherVO = new TeacherVO();
            // 处理类型转换
            teacherVO.setSex(teacherDO.getSex().getName());
            BeanUtils.copyProperties(teacherDO, teacherVO);
            return Result.ok(teacherVO);
        } catch (Exception e) {
            log.error("错误信息：{}", e);
            return Result.error("服务器异常");
        }
    }

    /**
     * 单一新增：教师信息
     *
     * @param teacherVO 教师vo
     * @return 添加到数据库的最终教师信息
     */
    @Transactional(rollbackFor = {Exception.class})
    @ApiOperation(value = "新增教师", notes = "add new one teacher.", httpMethod = "POST",
            nickname = "Add-Teacher")
    @PostMapping(value = "/save")
    public TeacherVO saveTeacher(@Valid TeacherVO teacherVO) {
        try {
            Teacher teacher = new Teacher();
            // 对象拷贝
            BeanUtils.copyProperties(teacherVO, teacher);
            teacher.setSex(SexEnum.getEnumById(Integer.parseInt(teacherVO.getSex())).getId());
            teacher.setDelTag(0);
            teacher.setRevision(0);
            teacher = this.teacherService.insert(teacher);

            BeanUtils.copyProperties(teacher, teacherVO);
            teacherVO.setSex(SexEnum.getEnumById(Integer.parseInt(teacherVO.getSex())).getName());
            return teacherVO;
        } catch (Exception e) {
            e.printStackTrace();
            // Spring事务手动回滚，一般写在service层。
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error("添加教师发生异常! 异常信息为：{}", e);
            return null;
        }
    }

}

