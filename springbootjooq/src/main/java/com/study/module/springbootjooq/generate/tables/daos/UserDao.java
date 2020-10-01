/*
 * This file is generated by jOOQ.
 */
package com.study.module.springbootjooq.generate.tables.daos;


import com.study.module.springbootjooq.generate.tables.User;
import com.study.module.springbootjooq.generate.tables.records.UserRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 用户表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDao extends DAOImpl<UserRecord, com.study.module.springbootjooq.generate.tables.pojos.User, Long> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, com.study.module.springbootjooq.generate.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    public UserDao(Configuration configuration) {
        super(User.USER, com.study.module.springbootjooq.generate.tables.pojos.User.class, configuration);
    }

    @Override
    public Long getId(com.study.module.springbootjooq.generate.tables.pojos.User object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.User> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(User.USER.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.User> fetchById(Long... values) {
        return fetch(User.USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.study.module.springbootjooq.generate.tables.pojos.User fetchOneById(Long value) {
        return fetchOne(User.USER.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.User> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.User> fetchByName(String... values) {
        return fetch(User.USER.NAME, values);
    }

    /**
     * Fetch records that have <code>age BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.User> fetchRangeOfAge(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(User.USER.AGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>age IN (values)</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.User> fetchByAge(Integer... values) {
        return fetch(User.USER.AGE, values);
    }

    /**
     * Fetch records that have <code>email BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.User> fetchRangeOfEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.User> fetchByEmail(String... values) {
        return fetch(User.USER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>remove_tag BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.User> fetchRangeOfRemoveTag(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(User.USER.REMOVE_TAG, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>remove_tag IN (values)</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.User> fetchByRemoveTag(Integer... values) {
        return fetch(User.USER.REMOVE_TAG, values);
    }
}