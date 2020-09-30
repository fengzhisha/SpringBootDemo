/*
 * This file is generated by jOOQ.
 */
package com.study.module.jooq.tables.daos;


import com.study.module.jooq.tables.Poetry;
import com.study.module.jooq.tables.records.PoetryRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PoetryDao extends DAOImpl<PoetryRecord, com.study.module.jooq.tables.pojos.Poetry, Integer> {

    /**
     * Create a new PoetryDao without any configuration
     */
    public PoetryDao() {
        super(Poetry.POETRY, com.study.module.jooq.tables.pojos.Poetry.class);
    }

    /**
     * Create a new PoetryDao with an attached configuration
     */
    public PoetryDao(Configuration configuration) {
        super(Poetry.POETRY, com.study.module.jooq.tables.pojos.Poetry.class, configuration);
    }

    @Override
    public Integer getId(com.study.module.jooq.tables.pojos.Poetry object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.study.module.jooq.tables.pojos.Poetry> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Poetry.POETRY.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.study.module.jooq.tables.pojos.Poetry> fetchById(Integer... values) {
        return fetch(Poetry.POETRY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.study.module.jooq.tables.pojos.Poetry fetchOneById(Integer value) {
        return fetchOne(Poetry.POETRY.ID, value);
    }

    /**
     * Fetch records that have <code>poet_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.study.module.jooq.tables.pojos.Poetry> fetchRangeOfPoetId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Poetry.POETRY.POET_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>poet_id IN (values)</code>
     */
    public List<com.study.module.jooq.tables.pojos.Poetry> fetchByPoetId(Integer... values) {
        return fetch(Poetry.POETRY.POET_ID, values);
    }

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.study.module.jooq.tables.pojos.Poetry> fetchRangeOfTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(Poetry.POETRY.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.study.module.jooq.tables.pojos.Poetry> fetchByTitle(String... values) {
        return fetch(Poetry.POETRY.TITLE, values);
    }

    /**
     * Fetch records that have <code>content BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.study.module.jooq.tables.pojos.Poetry> fetchRangeOfContent(String lowerInclusive, String upperInclusive) {
        return fetchRange(Poetry.POETRY.CONTENT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<com.study.module.jooq.tables.pojos.Poetry> fetchByContent(String... values) {
        return fetch(Poetry.POETRY.CONTENT, values);
    }
}
