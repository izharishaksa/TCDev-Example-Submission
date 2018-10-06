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
 * Unit test for {@link BasicRPSiteOverview} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class BasicRPSiteOverviewTest extends TestCase {

    /**
     * Represents <code>BasicRPSiteOverview</code> instance used in test.
     */
    private BasicRPSiteOverview instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new BasicRPSiteOverview();
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
     * Accuracy test for the constructor <code>BasicRPSiteOverview</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new BasicRPSiteOverview();

        assertEquals("'totalRequiredBandwidthPerSite' should be correct.", new Double(0),
                TestHelper.getField(instance, "totalRequiredBandwidthPerSite"));
        assertEquals("'totalRequiredStorageSpace' should be correct.", new Double(0),
                TestHelper.getField(instance, "totalRequiredStorageSpace"));
        assertEquals("'totalReplicatedData' should be correct.", new Double(0),
                TestHelper.getField(instance, "totalReplicatedData"));
        assertEquals("'totalApplicationsGeneratedData' should be correct.", new Double(0),
                TestHelper.getField(instance, "totalApplicationsGeneratedData"));
        assertEquals("'firstTimeSiteSync' should be correct.", new Double(0),
                TestHelper.getField(instance, "firstTimeSiteSync"));
    }

    /**
     * Accuracy test for method <code>getTotalRequiredBandwidthPerSite()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetTotalRequiredBandwidthPerSite() {
        double value = 9.0;
        instance.setTotalRequiredBandwidthPerSite(value);
        assertEquals("'getTotalRequiredBandwidthPerSite' should be correct.", value,
                instance.getTotalRequiredBandwidthPerSite());
    }

    /**
     * Accuracy test for method <code>setTotalRequiredBandwidthPerSite(double totalRequiredBandwidthPerSite)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetTotalRequiredBandwidthPerSite() {
        double value = 9.0;
        instance.setTotalRequiredBandwidthPerSite(value);
        assertEquals("'setTotalRequiredBandwidthPerSite' should be correct.", value,
                TestHelper.getField(instance, "totalRequiredBandwidthPerSite"));
    }

    /**
     * Accuracy test for method <code>getTotalRequiredStorageSpace()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetTotalRequiredStorageSpace() {
        double value = 1.0;
        instance.setTotalRequiredStorageSpace(value);
        assertEquals("'getTotalRequiredStorageSpace' should be correct.", value,
                instance.getTotalRequiredStorageSpace());
    }

    /**
     * Accuracy test for method <code>setTotalRequiredStorageSpace(double totalRequiredStorageSpace)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetTotalRequiredStorageSpace() {
        double value = 2.0;
        instance.setTotalRequiredStorageSpace(value);
        assertEquals("'setTotalRequiredStorageSpace' should be correct.", value,
                TestHelper.getField(instance, "totalRequiredStorageSpace"));
    }

    /**
     * Accuracy test for method <code>getTotalReplicatedData()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetTotalReplicatedData() {
        double value = 3.0;
        instance.setTotalReplicatedData(value);
        assertEquals("'getTotalReplicatedData' should be correct.", value,
                instance.getTotalReplicatedData());
    }

    /**
     * Accuracy test for method <code>setTotalReplicatedData(double totalReplicatedData)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetTotalReplicatedData() {
        double value = 3.0;
        instance.setTotalReplicatedData(value);
        assertEquals("'setTotalReplicatedData' should be correct.", value,
                TestHelper.getField(instance, "totalReplicatedData"));
    }

    /**
     * Accuracy test for method <code>getTotalApplicationGeneratedData()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetTotalApplicationsGeneratedData() {
        double value = 5.0;
        instance.setTotalApplicationsGeneratedData(value);
        assertEquals("'getTotalApplicationsGeneratedData' should be correct.", value,
                instance.getTotalApplicationsGeneratedData());
    }

    /**
     * Accuracy test for method <code>setTotalApplicationsGeneratedData(double totalApplicationsGeneratedData)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetTotalApplicationsGeneratedData() {
        double value = 6.0;
        instance.setTotalApplicationsGeneratedData(value);
        assertEquals("'setTotalApplicationsGeneratedData' should be correct.", value,
                TestHelper.getField(instance, "totalApplicationsGeneratedData"));
    }

    /**
     * Accuracy test for method <code>getFirstTimeSiteSync()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetFirstTimeSiteSync() {
        double value = 19.0;
        instance.setFirstTimeSiteSync(value);
        assertEquals("'getFirstTimeSiteSync' should be correct.", value,
                instance.getFirstTimeSiteSync());
    }

    /**
     * Accuracy test for method <code>setFirstTimeSiteSync(double firstTimeSiteSync)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetFirstTimeSiteSync() {
        double value = 19.0;
        instance.setFirstTimeSiteSync(value);
        assertEquals("'setFirstTimeSiteSync' should be correct.", value,
                TestHelper.getField(instance, "firstTimeSiteSync"));
    }
}
