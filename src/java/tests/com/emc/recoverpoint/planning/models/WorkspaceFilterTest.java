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
 * Unit test for {@link WorkspaceFilter} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class WorkspaceFilterTest extends TestCase {

    /**
     * Represents <code>WorkspaceFilter</code> instance used in tests.
     */
    private WorkspaceFilter instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new WorkspaceFilter();
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
     * <code>WorkspaceFilter</code> should be subclass of <code>BaseFilter</code>.
     */
    @Test
    public void testInheritance() {
        assertTrue("WorkspaceFilter should be a subclass of BaseFilter.",
                WorkspaceFilter.class.getSuperclass() == BaseFilter.class);
    }

    /**
     * Accuracy test for the constructor <code>WorkspaceFilter</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new WorkspaceFilter();

        assertNull("'name' should be correct.", TestHelper.getField(instance, "name"));
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
     * Accuracy test for method <code>getStatus()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetStatus() {
        String value = "status";
        instance.setStatus(value);
        assertEquals("'getStatus' should be correct.", value, instance.getStatus());
    }

    /**
     * Accuracy test for method <code>setStatus(String status)</code>. The value should be properly set.
     */
    @Test
    public void testSetStatus() {
        String value = "status II";
        instance.setStatus(value);
        assertEquals("'setStatus' should be correct.", value, TestHelper.getField(instance, "status"));
    }
}
