/*
 * This file is generated by jOOQ.
 */
package com.study.module.jooq.tables.records;


import com.study.module.jooq.tables.User;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record5<Long, String, Integer, String, Integer> {

    private static final long serialVersionUID = -1187250045;

    /**
     * Setter for <code>zero.user.id</code>. 主键ID
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>zero.user.id</code>. 主键ID
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>zero.user.name</code>. 姓名
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>zero.user.name</code>. 姓名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>zero.user.age</code>. 年龄
     */
    public void setAge(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>zero.user.age</code>. 年龄
     */
    public Integer getAge() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>zero.user.email</code>. 邮箱
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>zero.user.email</code>. 邮箱
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>zero.user.remove_tag</code>. 逻辑删除字段（0：有效数据，可以被查询到，1：无效数据，表示已被删除）
     */
    public void setRemoveTag(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>zero.user.remove_tag</code>. 逻辑删除字段（0：有效数据，可以被查询到，1：无效数据，表示已被删除）
     */
    public Integer getRemoveTag() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, Integer, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, Integer, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return User.USER.ID;
    }

    @Override
    public Field<String> field2() {
        return User.USER.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return User.USER.AGE;
    }

    @Override
    public Field<String> field4() {
        return User.USER.EMAIL;
    }

    @Override
    public Field<Integer> field5() {
        return User.USER.REMOVE_TAG;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getAge();
    }

    @Override
    public String component4() {
        return getEmail();
    }

    @Override
    public Integer component5() {
        return getRemoveTag();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getAge();
    }

    @Override
    public String value4() {
        return getEmail();
    }

    @Override
    public Integer value5() {
        return getRemoveTag();
    }

    @Override
    public UserRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public UserRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public UserRecord value3(Integer value) {
        setAge(value);
        return this;
    }

    @Override
    public UserRecord value4(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UserRecord value5(Integer value) {
        setRemoveTag(value);
        return this;
    }

    @Override
    public UserRecord values(Long value1, String value2, Integer value3, String value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Long id, String name, Integer age, String email, Integer removeTag) {
        super(User.USER);

        set(0, id);
        set(1, name);
        set(2, age);
        set(3, email);
        set(4, removeTag);
    }
}