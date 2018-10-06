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
 * Unit test for {@link BasicRPApplicationConfiguration} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class BasicRPApplicationConfigurationTest extends TestCase {

    /**
     * Represents <code>BasicRPApplicationConfiguration</code> instance used in tests.
     */
    private BasicRPApplicationConfiguration instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new BasicRPApplicationConfiguration();
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
     * Accuracy test for the constructor <code>BasicRPApplicationConfiguration</code>.
     * Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new BasicRPApplicationConfiguration();

        assertNull("'applicationName' should be correct.",
                TestHelper.getField(instance, "applicationName"));
        assertNull("'productType' should be correct.",
                TestHelper.getField(instance, "productType"));
        assertEquals("'applicationTotalVolumesSize' should be correct.", new Double(0),
                TestHelper.getField(instance, "applicationTotalVolumesSize"));
        assertEquals("'applicationAverageChangeRate' should be correct.", new Double(0),
                TestHelper.getField(instance, "applicationAverageChangeRate"));
        assertEquals("'requiredDataRollbackWindow' should be correct.", new Double(0),
                TestHelper.getField(instance, "requiredDataRollbackWindow"));
        assertEquals("'storageSpaceForRollbackInformation' should be correct.", new Double(0),
                TestHelper.getField(instance, "storageSpaceForRollbackInformation"));
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
     * Accuracy test for method <code>getProductType()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetProductType() {
        String value = "product type";
        instance.setProductType(value);
        assertEquals("'getProductType' should be correct.", value, instance.getProductType());
    }

    /**
     * Accuracy test for method <code>setProductType(String productType)</code>. The value should be properly set.
     */
    @Test
    public void testSetProductType() {
        String value = "product type 2";
        instance.setProductType(value);
        assertEquals("'setProductType' should be correct.", value, TestHelper.getField(instance, "productType"));
    }

    /**
     * Accuracy test for method <code>getTotalApplicationTotalVolumesSize()</code>.
     * The value should be properly retrieved.
     */
    @Test
    public void testGetApplicationTotalVolumesSize() {
        double value = 9.0;
        instance.setApplicationTotalVolumesSize(value);
        assertEquals("'getApplicationTotalVolumesSize' should be correct.", value,
                instance.getApplicationTotalVolumesSize());
    }

    /**
     * Accuracy test for method <code>setApplicationTotalVolumesSize(double applicationTotalVolumesSize)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetApplicationTotalVolumesSize() {
        double value = 7.534;
        instance.setApplicationTotalVolumesSize(value);
        assertEquals("'setApplicationTotalVolumesSize' should be correct.", value,
                TestHelper.getField(instance, "applicationTotalVolumesSize"));
    }

    /**
     * Accuracy test for method <code>getApplicationAverageChangeRate()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetApplicationAverageChangeRate() {
        double value = 19.0;
        instance.setApplicationAverageChangeRate(value);
        assertEquals("'getApplicationAverageChangeRate' should be correct.", value,
                instance.getApplicationAverageChangeRate());
    }

    /**
     * Accuracy test for method <code>setApplicationAverageChangeRate(double applicationAverageChangeRate)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetApplicationAverageChangeRate() {
        double value = 1.234;
        instance.setApplicationAverageChangeRate(value);
        assertEquals("'setApplicationAverageChangeRate' should be correct.", value,
                TestHelper.getField(instance, "applicationAverageChangeRate"));
    }

    /**
     * Accuracy test for method <code>getRequiredDataRollbackWindow()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetRequiredDataRollbackWindow() {
        double value = 11119.0;
        instance.setRequiredDataRollbackWindow(value);
        assertEquals("'getRequiredDataRollbackWindow' should be correct.", value,
                instance.getRequiredDataRollbackWindow());
    }

    /**
     * Accuracy test for method <code>setRequiredDataRollbackWindow(double requiredDataRollbackWindow)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetRequiredDataRollbackWindow() {
        double value = 0.1234;
        instance.setRequiredDataRollbackWindow(value);
        assertEquals("'settRequiredDataRollbackWindow' should be correct.", value,
                TestHelper.getField(instance, "requiredDataRollbackWindow"));
    }

    /**
     * Accuracy test for method <code>getStorageSpaceForRollbackInformation()</code>.
     * The value should be properly retrieved.
     */
    @Test
    public void testGetStorageSpaceForRollbackInformation() {
        double value = 56.7;
        instance.setStorageSpaceForRollbackInformation(value);
        assertEquals("'getStorageSpaceForRollbackInformation' should be correct.", value,
                instance.getStorageSpaceForRollbackInformation());
    }

    /**
     * Accuracy test for method <code>setStorageSpaceForRollbackInformation(double storageSpaceForRollbackInformation)
     * </code>. The value should be properly set.
     */
    @Test
    public void testSetStorageSpaceForRollbackInformation() {
        double value = 56.790098;
        instance.setStorageSpaceForRollbackInformation(value);
        assertEquals("'setStorageSpaceForRollbackInformation' should be correct.", value,
                TestHelper.getField(instance, "storageSpaceForRollbackInformation"));
    }
}