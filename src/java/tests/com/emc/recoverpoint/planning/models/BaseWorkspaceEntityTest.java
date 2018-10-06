/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import com.emc.recoverpoint.planning.TestHelper;
import java.util.Date;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Unit test for {@link BaseWorkspaceEntity} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class BaseWorkspaceEntityTest extends TestCase {

    /**
     * Represents <code>BaseWorkspaceEntity</code> instance used in tests.
     */
    private BaseWorkspaceEntity instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new MockBaseWorkspaceEntity();
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
     * Accuracy test for the constructor <code>BaseWorkspaceEntity</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new MockBaseWorkspaceEntity();

        assertNull("'id' should be correct.", TestHelper.getField(instance, "id"));
        assertNull("'name' should be correct.", TestHelper.getField(instance, "name"));
        assertNull("'status' should be correct.", TestHelper.getField(instance, "status"));
        assertNull("'lastModifiedDate' should be correct.", TestHelper.getField(instance, "lastModifiedDate"));
    }

    /**
     * Accuracy test for method <code>getId()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetId() {
        String value = "id12345";
        instance.setId(value);
        assertEquals("'getId' should be correct.", value, instance.getId());
    }

    /**
     * Accuracy test for method <code>setId(String id)</code>. The value should be properly set.
     */
    @Test
    public void testSetId() {
        String value = "id9088";
        instance.setId(value);
        assertEquals("'setId' should be correct.", value, TestHelper.getField(instance, "id"));
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
        String value = "the name 2";
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
        String value = "status 2";
        instance.setStatus(value);
        assertEquals("'setStatus' should be correct.", value, TestHelper.getField(instance, "status"));
    }

    /**
     * Accuracy test for method <code>getLastModifiedDate()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetLastModifiedDate() {
        Date value = new Date();
        instance.setLastModifiedDate(value);
        assertEquals("'getLastModifiedDate' should be correct.", value, instance.getLastModifiedDate());
    }

    /**
     * Accuracy test for method <code>setLastModifiedDate(Date lastModifiedDate)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetLastModifiedDate() {
        Date value = new Date();
        instance.setLastModifiedDate(value);
        assertEquals("'setLastModifiedDate' should be correct.", value,
                TestHelper.getField(instance, "lastModifiedDate"));
    }
}
