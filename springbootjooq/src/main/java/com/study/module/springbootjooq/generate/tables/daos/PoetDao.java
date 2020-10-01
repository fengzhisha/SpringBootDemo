/*
 * This file is generated by jOOQ.
 */
package com.study.module.springbootjooq.generate.tables.daos;


import com.study.module.springbootjooq.generate.tables.Poet;
import com.study.module.springbootjooq.generate.tables.records.PoetRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PoetDao extends DAOImpl<PoetRecord, com.study.module.springbootjooq.generate.tables.pojos.Poet, Integer> {

    /**
     * Create a new PoetDao without any configuration
     */
    public PoetDao() {
        super(Poet.POET, com.study.module.springbootjooq.generate.tables.pojos.Poet.class);
    }

    /**
     * Create a new PoetDao with an attached configuration
     */
    public PoetDao(Configuration configuration) {
        super(Poet.POET, com.study.module.springbootjooq.generate.tables.pojos.Poet.class, configuration);
    }

    @Override
    public Integer getId(com.study.module.springbootjooq.generate.tables.pojos.Poet object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.Poet> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Poet.POET.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.Poet> fetchById(Integer... values) {
        return fetch(Poet.POET.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.study.module.springbootjooq.generate.tables.pojos.Poet fetchOneById(Integer value) {
        return fetchOne(Poet.POET.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.Poet> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Poet.POET.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.study.module.springbootjooq.generate.tables.pojos.Poet> fetchByName(String... values) {
        return fetch(Poet.POET.NAME, values);
    }
}