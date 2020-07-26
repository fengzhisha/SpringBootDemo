# 逻辑删除测试
1. 配置好MP的逻辑删除，在实体类中对应上表名（@TableName、@TableField、@TableId、@TableLogic的相关字段）
2. 测试截图：

    ![测试图](mpdemo/src/main/resources/images/postman-test-deleteMapping.jpg)

# 模糊分页查询
1. pageAllByNameLike 中的search 对应的实体类的需要将key值参数未数据库对应的字段名，才可以查询到。例如：
    ```text
    正确写法：
    search:  {"stu_id":2}
    错误写法：
    search:  {"stuId":2}
    ```
2. 可能是由于实现了那个 `IService` 相关的接口，导致的，所以，尽量借鉴兄弟项目`SpringBootDemo/mybatisplus`的相关操作