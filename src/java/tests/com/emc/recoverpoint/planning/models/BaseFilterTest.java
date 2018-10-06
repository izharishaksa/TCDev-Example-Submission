/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import com.emc.recoverpoint.planning.TestHelper;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Unit test for {@link BaseFilter} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class BaseFilterTest extends TestCase {

    /**
     * Represents <code>BaseFilter</code> instance used in tests.
     */
    private BaseFilter instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new MockBaseFilter();
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
     * Accuracy test for the constructor <code>BaseFilter</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new MockBaseFilter();

        assertEquals("'page' should be correct.", new Integer(0), TestHelper.getField(instance, "page"));
        assertEquals("'pageSize' should be correct.", new Integer(0), TestHelper.getField(instance, "pageSize"));
        assertNull("'orderBy' should be correct.", TestHelper.getField(instance, "orderBy"));
        assertEquals("'ascending' should be correct.", false, TestHelper.getField(instance, "ascending"));
    }

    /**
     * Accuracy test for method <code>getPage()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetPage() {
        int value = 10;
        instance.setPage(value);
        assertEquals("'getPage' should be correct.", value, instance.getPage());
    }

    /**
     * Accuracy test for method <code>setPage(int page)</code>. The value should be properly set.
     */
    @Test
    public void testSetPage() {
        int value = 20;
        instance.setPage(value);
        assertEquals("'setPage' should be correct.", value, TestHelper.getField(instance, "page"));
    }

    /**
     * Accuracy test for method <code>getPageSize()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetPageSize() {
        int value = 19;
        instance.setPageSize(value);
        assertEquals("'getPageSize' should be correct.", value, instance.getPageSize());
    }

    /**
     * Accuracy test for method <code>setPageSize(int pageSize)</code>. The value should properly set.
     */
    @Test
    public void testSetPageSize() {
        int value = 19;
        instance.setPageSize(value);
        assertEquals("'setPageSize' should be correct.", value, TestHelper.getField(instance, "pageSize"));
    }

    /**
     * Accuracy test for method <code>getOrderBy()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetOrderBy() {
        String value = "page";
        instance.setOrderBy(value);
        assertEquals("'getOrderBy' should be correct.", value, instance.getOrderBy());
    }

    /**
     * Accuracy test for method <code>setOrderBy(String orderBy)</code>. The value should properly set.
     */
    @Test
    public void testSetOrderBy() {
        String value = "page";
        instance.setOrderBy(value);
        assertEquals("'setOrderBy' should be correct.", value, TestHelper.getField(instance, "orderBy"));
    }

    /**
     * Accuracy test for method <code>isAscending()</code>. The value should be properly retrieved.
     */
    @Test
    public void testIsAscending() {
        boolean value = true;
        instance.setAscending(value);
        assertEquals("'isAscending' should be correct.", value, instance.isAscending());
    }

    /**
     * Accuracy test for method <code>setAscending(boolean ascending)</code>. The value should properly set.
     */
    @Test
    public void testSetAscending() {
        boolean value = false;
        instance.setAscending(value);
        assertEquals("'setAscending' should be correct.", value, TestHelper.getField(instance, "ascending"));
    }
}
