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
 * Unit test for {@link BasicRPApplicationOverview} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class BasicRPApplicationOverviewTest extends TestCase {

    /**
     * Represents <code>BasicRPApplicationOverview</code> instance used in tests.
     */
    private BasicRPApplicationOverview instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new BasicRPApplicationOverview();
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
     * Accuracy test for the constructor <code>BasicRPApplicationOverview</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new BasicRPApplicationOverview();

        assertNull("'applicationName' should be correct.",
                TestHelper.getField(instance, "applicationName"));
        assertEquals("'requiredProtectionWindow' should be correct.", new Double(0),
                TestHelper.getField(instance, "requiredProtectionWindow"));
        assertEquals("'availableProtectionWindow' should be correct.", new Double(0),
                TestHelper.getField(instance, "availableProtectionWindow"));
        assertEquals("'requiredStorageSpaceForRollback' should be correct.", new Double(0),
                TestHelper.getField(instance, "requiredStorageSpaceForRollback"));
        assertEquals("'availableStorageSpaceForRollback' should be correct.", new Double(0),
                TestHelper.getField(instance, "availableStorageSpaceForRollback"));
        assertEquals("'requiredBandwidth' should be correct.", new Double(0),
                TestHelper.getField(instance, "requiredBandwidth"));
    }

    /**
     * Accuracy test for method <code>getApplicationName()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetApplicationName() {
        String value = "application name";
        instance.setApplicationName(value);
        assertEquals("'getApplicationName' should be correct.", value, instance.getApplicationName());
    }

    /**
     * Accuracy test for method <code>setApplicationName(String applicationName)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetApplicationName() {
        String value = "application name 2";
        instance.setApplicationName(value);
        assertEquals("'setApplicationName' should be correct.", value, TestHelper.getField(instance,
                "applicationName"));
    }

    /**
     * Accuracy test for method <code>getRequiredProtectionWindow()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetRequiredProtectionWindow() {
        double value = 9.0;
        instance.setRequiredProtectionWindow(value);
        assertEquals("'getRequiredProtectionWindow' should be correct.", value,
                instance.getRequiredProtectionWindow());
    }

    /**
     * Accuracy test for method <code>setRequiredProtectionWindow(double requiredProtectionWindow)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetRequiredProtectionWindow() {
        double value = 91.0;
        instance.setRequiredProtectionWindow(value);
        assertEquals("'setRequiredProtectionWindow' should be correct.", value,
                TestHelper.getField(instance, "requiredProtectionWindow"));
    }

    /**
     * Accuracy test for method <code>getAvailableProtectionWindow()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetAvailableProtectionWindow() {
        double value = 8.1;
        instance.setAvailableProtectionWindow(value);
        assertEquals("'getAvailableProtectionWindow' should be correct.", value,
                instance.getAvailableProtectionWindow());
    }

    /**
     * Accuracy test for method <code>setAvailableProtectionWindow(double availableProtectionWindow)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetAvailableProtectionWindow() {
        double value = 8.1;
        instance.setAvailableProtectionWindow(value);
        assertEquals("'setAvailableProtectionWindow' should be correct.", value,
                TestHelper.getField(instance, "availableProtectionWindow"));
    }

    /**
     * Accuracy test for method <code>getRequiredStorageSpaceForRollback()</code>.
     * The value should be properly retrieved.
     */
    @Test
    public void testGetRequiredStorageSpaceForRollback() {
        double value = 123.1;
        instance.setRequiredStorageSpaceForRollback(value);
        assertEquals("'getRequiredStorageSpaceForRollback' should be correct.", value,
                instance.getRequiredStorageSpaceForRollback());
    }

    /**
     * Accuracy test for method <code>setRequiredStorageSpaceForRollback(double requiredStorageSpaceForRollback)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetRequiredStorageSpaceForRollback() {
        double value = 123.187878;
        instance.setRequiredStorageSpaceForRollback(value);
        assertEquals("'setRequiredStorageSpaceForRollback' should be correct.", value,
                TestHelper.getField(instance, "requiredStorageSpaceForRollback"));
    }

    /**
     * Accuracy test for method <code>getAvailableStorageSpaceForRollback()</code>.
     * The value should be properly retrieved.
     */
    @Test
    public void testGetAvailableStorageSpaceForRollback() {
        double value = 123.1;
        instance.setAvailableStorageSpaceForRollback(value);
        assertEquals("'getAvailableStorageSpaceForRollback' should be correct.", value,
                instance.getAvailableStorageSpaceForRollback());
    }

    /**
     * Accuracy test for method <code>setAvailableStorageSpaceForRollback(double availableStorageSpaceForRollback)
     * </code>. The value should be properly set.
     */
    @Test
    public void testSetAvailableStorageSpaceForRollback() {
        double value = 0.1;
        instance.setAvailableStorageSpaceForRollback(value);
        assertEquals("'setAvailableStorageSpaceForRollback' should be correct.", value,
                TestHelper.getField(instance, "availableStorageSpaceForRollback"));
    }

    /**
     * Accuracy test for method <code>getRequiredBandwidth()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetRequiredBandwidth() {
        double value = 123.1;
        instance.setRequiredBandwidth(value);
        assertEquals("'getRequiredBandwidth' should be correct.", value, instance.getRequiredBandwidth());
    }

    /**
     * Accuracy test for method <code>setRequiredBandwidth(double requiredBandwidth)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetRequiredBandwidth() {
        double value = 123.19;
        instance.setRequiredBandwidth(value);
        assertEquals("'setRequiredBandwidth' should be correct.", value,
                TestHelper.getField(instance, "requiredBandwidth"));
    }
}
