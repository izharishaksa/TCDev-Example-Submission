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
 * Unit test for {@link RawDataItemFilter} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class RawDataItemFilterTest extends TestCase {

    /**
     * Represents <code>RawDataItemFilter</code> instance used in tests.
     */
    private RawDataItemFilter instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new RawDataItemFilter();
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
     * <code>RawDataItemFilter</code> should be subclass of <code>BaseFilter</code>.
     */
    @Test
    public void testInheritance() {
        assertTrue("RawDataItemFilter should be a subclass of BaseFilter.",
                RawDataItemFilter.class.getSuperclass() == BaseFilter.class);
    }

    /**
     * Accuracy test for the constructor <code>RawDataItemFilter</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new RawDataItemFilter();

        assertNull("'name' should be correct.", TestHelper.getField(instance, "name"));
        assertNull("'dataType' should be correct.", TestHelper.getField(instance, "dataType"));
        assertNull("'status' should be correct.", TestHelper.getField(instance, "status"));
    }

    /**
     * Accuracy test for method <code>getName()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetName() {
        String value = "the name";
        instance.setName(value);
        assertEquals("'getName' should be correct.", value, instance.getName());
    }

    /**
     * Accuracy test for method <code>setName(String name)</code>. The value should be properly set.
     */
    @Test
    public void testSetName() {
        String value = "the name II";
        instance.setName(value);
        assertEquals("'setName' should be correct.", value, TestHelper.getField(instance, "name"));
    }

    /**
     * Accuracy test for method <code>getDataType()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetDataType() {
        String value = "boolean";
        instance.setDataType(value);
        assertEquals("'getDataType' should be correct.", value, instance.getDataType());
    }

    /**
     * Accuracy test for method <code>setDataType(String dataType)</code>. The value should be properly set.
     */
    @Test
    public void testSetDataType() {
        String value = "double";
        instance.setDataType(value);
        assertEquals("'setDataType' should be correct.", value, TestHelper.getField(instance, "dataType"));
    }

    /**
     * Accuracy test for method <code>getStatus()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetStatus() {
        String value = "the status";
        instance.setStatus(value);
        assertEquals("'getStatus' should be correct.", value, instance.getStatus());
    }

    /**
     * Accuracy test for method <code>setStatus(String status)</code>. The value should be properly set.
     */
    @Test
    public void testSetStatus() {
        String value = "the status II";
        instance.setStatus(value);
        assertEquals("'setStatus' should be correct.", value, TestHelper.getField(instance, "status"));
    }
}
