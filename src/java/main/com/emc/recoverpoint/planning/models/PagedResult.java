/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * This represents the paged filter result, it holds total pages, total records, current page number and list of items
 * in current page. It is a Javabean. It has one no-parameter constructor that is empty. Each field of this class has
 * a getter and setter. There is no validation done in the setters. The properties just set and get the values.
 * </p>
 *
 * <p>
 * <strong>Thread Safety:</strong> This class is mutable and not thread safe.
 * </p>
 *
 * @author albertwang, TCSDEVELOPER
 * @version 1.0
 *
 * @param <T>
 *              The data type.
 */
public class PagedResult<T> implements Serializable {

    /**
     * <p>
     * The serial version UID.
     * </p>
     */
    private static final long serialVersionUID = 22345678917L;
    /**
     * <p>
     * Represent the total pages.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private int totalPages;
    /**
     * <p>
     * Represents the total count.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private int totalCount;
    /**
     * <p>
     * Represents the current page.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private int currentPage;
    /**
     * <p>
     * Represents the list of items.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private List<T> items;

    /**
     * Creates an instance of PagedResult.
     */
    public PagedResult() {
        //empty
    }

    /**
     * Gets the total pages.
     *
     * @return the total pages.
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the total pages.
     *
     * @param totalPages
     *              The total pages to set.
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Gets the total count.
     *
     * @return the total count.
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the total count.
     *
     * @param totalCount
     *              The total count to set.
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Gets the current page.
     *
     * @return the current page.
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the current page.
     *
     * @param currentPage
     *              The current page to set.
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * Gets the list of items.
     *
     * @return the list of items.
     */
    public List<T> getItems() {
        return items;
    }

    /**
     * Sets the list of items.
     *
     * @param items
     *              The items to set.
     */
    public void setItems(List<T> items) {
        this.items = items;
    }
}
