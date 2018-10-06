/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import java.io.Serializable;

/**
 * <p>
 * This is a base class for search filters. It holds pagination and sorting options. It is a Javabean. It has
 * one no-parameter constructor that is empty. Each field of this class has a getter and setter. There is no validation
 * done in the setters. The properties just set and get the values.
 * </p>
 *
 * <p>
 * <strong>Thread Safety:</strong> This class is mutable and not thread safe.
 * </p>
 *
 * @author albertwang, TCSDEVELOPER
 * @version 1.0
 */
public abstract class BaseFilter implements Serializable {

    /**
     * <p>
     * Represents the page.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private int page;
    /**
     * <p>
     * Represents the page size.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private int pageSize;
    /**
     * <p>
     * Represents the order by.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private String orderBy;
    /**
     * <p>
     * Represents the ascending sorting options.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private boolean ascending;

    /**
     * Creates an instance of BaseFilter.
     */
    public BaseFilter() {
        //empty
    }

    /**
     * Gets the page.
     *
     * @return the page.
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the page.
     *
     * @param page
     *              The page to set.
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * Gets the page size.
     *
     * @return the page size.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the page size.
     *
     * @param pageSize
     *              The page size to set.
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Gets the order by.
     *
     * @return the order by.
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the order by.
     *
     * @param orderBy
     *              The order by to set.
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * Gets the sorting options value.
     *
     * @return true if it is ascending, false otherwise.
     */
    public boolean isAscending() {
        return ascending;
    }

    /**
     * Sets the sorting options.
     *
     * @param ascending
     *              The sorting options to set. True if it is ascending, false otherwise.
     */
    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }
}