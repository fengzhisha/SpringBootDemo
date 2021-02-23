/*
 * This file is generated by jOOQ.
 */
package edu.study.module.springbootjooq.generate.tables.daos;


import edu.study.module.springbootjooq.generate.tables.TSalary;
import edu.study.module.springbootjooq.generate.tables.records.TSalaryRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 薪资表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TSalaryDao extends DAOImpl<TSalaryRecord, edu.study.module.springbootjooq.generate.tables.pojos.TSalary, Integer> {

    /**
     * Create a new TSalaryDao without any configuration
     */
    public TSalaryDao() {
        super(TSalary.T_SALARY, edu.study.module.springbootjooq.generate.tables.pojos.TSalary.class);
    }

    /**
     * Create a new TSalaryDao with an attached configuration
     */
    public TSalaryDao(Configuration configuration) {
        super(TSalary.T_SALARY, edu.study.module.springbootjooq.generate.tables.pojos.TSalary.class, configuration);
    }

    @Override
    public Integer getId(edu.study.module.springbootjooq.generate.tables.pojos.TSalary object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TSalary.T_SALARY.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchById(Integer... values) {
        return fetch(TSalary.T_SALARY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public edu.study.module.springbootjooq.generate.tables.pojos.TSalary fetchOneById(Integer value) {
        return fetchOne(TSalary.T_SALARY.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(TSalary.T_SALARY.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchByName(String... values) {
        return fetch(TSalary.T_SALARY.NAME, values);
    }

    /**
     * Fetch records that have <code>position BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchRangeOfPosition(String lowerInclusive, String upperInclusive) {
        return fetchRange(TSalary.T_SALARY.POSITION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>position IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchByPosition(String... values) {
        return fetch(TSalary.T_SALARY.POSITION, values);
    }

    /**
     * Fetch records that have <code>office BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchRangeOfOffice(String lowerInclusive, String upperInclusive) {
        return fetchRange(TSalary.T_SALARY.OFFICE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>office IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchByOffice(String... values) {
        return fetch(TSalary.T_SALARY.OFFICE, values);
    }

    /**
     * Fetch records that have <code>age BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchRangeOfAge(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TSalary.T_SALARY.AGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>age IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchByAge(Integer... values) {
        return fetch(TSalary.T_SALARY.AGE, values);
    }

    /**
     * Fetch records that have <code>start_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchRangeOfStartDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(TSalary.T_SALARY.START_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>start_date IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchByStartDate(LocalDateTime... values) {
        return fetch(TSalary.T_SALARY.START_DATE, values);
    }

    /**
     * Fetch records that have <code>salary BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchRangeOfSalary(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TSalary.T_SALARY.SALARY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>salary IN (values)</code>
     */
    public List<edu.study.module.springbootjooq.generate.tables.pojos.TSalary> fetchBySalary(Integer... values) {
        return fetch(TSalary.T_SALARY.SALARY, values);
    }
}