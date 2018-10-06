/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import com.emc.recoverpoint.planning.TestHelper;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Unit test for {@link PagedResult} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class PagedResultTest extends TestCase {

    /**
     * Represents <code>Pagedresult</code> instance used in tests.
     */
    private PagedResult<Object> instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new PagedResult<Object>();
    }

    /**
     * Tear down the unit test.
     *
     * @throws Exception to JUnit.
     */
    @After
    @Override
    public void tearDown() throws Exception {
        instance = null;
    }

    /**
     * Accuracy test for the constructor <code>PagedResult</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new PagedResult<Object>();

        assertEquals("'totalPages' should be correct.", new Integer(0), TestHelper.getField(instance, "totalPages"));
        assertEquals("'totalCount' should be correct.", new Integer(0), TestHelper.getField(instance, "totalCount"));
        assertEquals("'currentPage' should be correct.", new Integer(0), TestHelper.getField(instance, "currentPage"));
        assertNull("'items' should be correct.", TestHelper.getField(instance, "items"));
    }

    /**
     * Accuracy test for method <code>getTotalPages()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetTotalPages() {
        int value = 17;
        instance.setTotalPages(value);
        assertEquals("'getTotalPages' should be correct.", value, instance.getTotalPages());
    }

    /**
     * Accuracy test for method <code>setTotalPages(int totalPages)</code>. The value should be properly set.
     */
    @Test
    public void testSetTotalPages() {
        int value = 17;
        instance.setTotalPages(value);
        assertEquals("'setTotalPages' should be correct.", value, TestHelper.getField(instance, "totalPages"));
    }

    /**
     * Accuracy test for method <code>getTotalCount()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetTotalCount() {
        int value = 19;
        instance.setTotalCount(value);
        assertEquals("'getTotalCount' should be correct.", value, instance.getTotalCount());
    }

    /**
     * Accuracy test for method <code>setTotalCount(int totalCount)</code>. The value should be properly set.
     */
    @Test
    public void testSetTotalCount() {
        int value = 20;
        instance.setTotalCount(value);
        assertEquals("'setTotalCount' should be correct.", value, TestHelper.getField(instance, "totalCount"));
    }

    /**
     * Accuracy test for method <code>getCurrentPage()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetCurrentPage() {
        int value = 1;
        instance.setCurrentPage(value);
        assertEquals("'getCurrentPage' should be correct.", value, instance.getCurrentPage());
    }

    /**
     * Accuracy test for method <code>setCurrentpage(int currentPage)</code>. The value should be properly set.
     */
    @Test
    public void testSetCurrentPage() {
        int value = 1;
        instance.setCurrentPage(value);
        assertEquals("'setCurrentPage' should be correct.", value, TestHelper.getField(instance, "currentPage"));
    }

    /**
     * Accuracy test for method <code>getItems()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetItems() {
        List<Object> value = new ArrayList<Object>();
        instance.setItems(value);
        assertEquals("'getItems' should be correct.", value, instance.getItems());
    }

    /**
     * Accuracy test for method <code>setItems(List<T> items)</code>. The value should be properly set.
     */
    @Test
    public void testSetItems() {
        List<Object> value = new ArrayList<Object>();
        instance.setItems(value);
        assertEquals("'setItems' should be correct.", value, TestHelper.getField(instance, "items"));
    }
}
