/*
 * This file is generated by jOOQ.
 */
package edu.study.module.springbootjooq.generate.tables.daos;


import edu.study.module.springbootjooq.generate.tables.records.StudentRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentDao extends DAOImpl<StudentRecord, edu.study.module.springbootjooq.generate.tables.pojos.Student, Integer> {

    /**
     * Create a new StudentDao without any configuration
     */
    public StudentDao() {
        super(edu.study.module.springbootjooq.generate.tables.Student.STUDENT, edu.study.module.springbootjooq.generate.tables.pojos.Student.class);
    }

    /**
     * Create a new StudentDao with an attached configuration
     */
    public StudentDao(Configuration configuration) {
        super(edu.study.module.springbootjooq.generate.tables.Student.STUDENT, edu.study.module.springbootjooq.generate.tables.pojos.Student.class, configuration);
    }

    @Override
    public Integer getId(edu.study.module.springbootjooq.generate.tables.pojos.Student object) {
        return object.getStuId();
    }

    /**
     * Fetch records that have <code>stu_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.Student> fetchRangeOfStuId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(edu.study.module.springbootjooq.generate.tables.Student.STUDENT.STU_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stu_id IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.Student> fetchByStuId(Integer... values) {
        return fetch(edu.study.module.springbootjooq.generate.tables.Student.STUDENT.STU_ID, values);
    }

    /**
     * Fetch a unique record that has <code>stu_id = value</code>
     */
    public edu.study.module.springbootjooq.generate.tables.pojos.Student fetchOneByStuId(Integer value) {
        return fetchOne(edu.study.module.springbootjooq.generate.tables.Student.STUDENT.STU_ID, value);
    }

    /**
     * Fetch records that have <code>stu_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.Student> fetchRangeOfStuName(String lowerInclusive, String upperInclusive) {
        return fetchRange(edu.study.module.springbootjooq.generate.tables.Student.STUDENT.STU_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stu_name IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.Student> fetchByStuName(String... values) {
        return fetch(edu.study.module.springbootjooq.generate.tables.Student.STUDENT.STU_NAME, values);
    }

    /**
     * Fetch records that have <code>stu_age BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.Student> fetchRangeOfStuAge(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(edu.study.module.springbootjooq.generate.tables.Student.STUDENT.STU_AGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stu_age IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.Student> fetchByStuAge(Integer... values) {
        return fetch(edu.study.module.springbootjooq.generate.tables.Student.STUDENT.STU_AGE, values);
    }

    /**
     * Fetch records that have <code>stu_sex BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.Student> fetchRangeOfStuSex(String lowerInclusive, String upperInclusive) {
        return fetchRange(edu.study.module.springbootjooq.generate.tables.Student.STUDENT.STU_SEX, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stu_sex IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.Student> fetchByStuSex(String... values) {
        return fetch(edu.study.module.springbootjooq.generate.tables.Student.STUDENT.STU_SEX, values);
    }

    /**
     * Fetch records that have <code>deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.Student> fetchRangeOfDeleted(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(edu.study.module.springbootjooq.generate.tables.Student.STUDENT.DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.Student> fetchByDeleted(Integer... values) {
        return fetch(edu.study.module.springbootjooq.generate.tables.Student.STUDENT.DELETED, values);
    }
}
