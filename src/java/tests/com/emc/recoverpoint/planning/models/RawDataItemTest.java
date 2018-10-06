/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import com.emc.recoverpoint.planning.TestHelper;
import java.util.Arrays;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Unit test for {@link RawDataItem} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class RawDataItemTest extends TestCase {

    /**
     * Represents <code>RawDataItem</code> instance used in tests.
     */
    private RawDataItem instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new RawDataItem();
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
     * <code>RawDataItem</code> should be subclass of <code>BaseWorkspaceEntity</code>.
     */
    @Test
    public void testInheritance() {
        assertTrue("RawDataItem should be a subclass of BaseWorkspaceEntity.",
                RawDataItem.class.getSuperclass() == BaseWorkspaceEntity.class);
    }

    /**
     * Accuracy test for the constructor <code>RawDataItem</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new RawDataItem();

        assertNull("'workspaceId' should be correct.", TestHelper.getField(instance, "workspaceId"));
        assertNull("'dataType' should be correct.", TestHelper.getField(instance, "dataType"));
        assertNull("'content' should be correct.", TestHelper.getField(instance, "content"));
    }

    /**
     * Accuracy test for method <code>getWorkspaceId()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetWorkspaceId() {
        String value = "workspace id";
        instance.setWorkspaceId(value);
        assertEquals("'getWorkspaceId' should be correct.", value, instance.getWorkspaceId());
    }

    /**
     * Accuracy test for method <code>setWorkspaceId(String workspaceId)</code>. The value should be properly set.
     */
    @Test
    public void testSetWorkspaceId() {
        String value = "workspace id 2";
        instance.setWorkspaceId(value);
        assertEquals("'setWorkspaceId' should be correct.", value, TestHelper.getField(instance, "workspaceId"));
    }

    /**
     * Accuracy test for method <code>getDataType()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetDataType() {
        String value = "integer";
        instance.setDataType(value);
        assertEquals("'getDataType' should be correct.", value, instance.getDataType());
    }

    /**
     * Accuracy test for method <code>setDataType(String dataType)</code>. The value should be properly set.
     */
    @Test
    public void testSetDataType() {
        String value = "long";
        instance.setDataType(value);
        assertEquals("'setDataType' should be correct.", value, TestHelper.getField(instance, "dataType"));
    }

    /**
     * Accuracy test for method <code>getContent()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetContent() {
        byte[] value = new byte[10];
        Arrays.fill(value, (byte) 7);
        instance.setContent(value);
        assertEquals("'getContent' should be correct.", value, instance.getContent());
    }

    /**
     * Accuracy test for method <code>setContent(byte[] content)</code>. The value should be properly set.
     */
    @Test
    public void testSetContent() {
        byte[] value = new byte[10];
        Arrays.fill(value, (byte) 7);
        instance.setContent(value);
        assertEquals("'getContent' should be correct.", value, TestHelper.getField(instance, "content"));
    }
}
