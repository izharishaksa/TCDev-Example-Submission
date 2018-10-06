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
 * Unit test for {@link BasicRPSizingResult} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class BasicRPSizingResultTest extends TestCase {

    /**
     * Represents <code>BasicRPSizingResult</code> instance used in tests.
     */
    private BasicRPSizingResult instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new BasicRPSizingResult();
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
     * Accuracy test for the constructor <code>BasicRPSizingResult</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new BasicRPSizingResult();

        assertEquals("'recommendedRPAppliances' should be correct.", new Integer(0),
                TestHelper.getField(instance, "recommendedRPAppliances"));
        assertNull("'siteOverview' should be correct.", TestHelper.getField(instance, "siteOverview"));
        assertNull("'applicationOverviews' should be correct.", TestHelper.getField(instance, "applicationOverviews"));
    }

    /**
     * Accuracy test for method <code>getRecommendedRPAppliances()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetRecommendedRPAppliances() {
        int value = 17;
        instance.setRecommendedRPAppliances(value);
        assertEquals("'getRecommendedRPAppliances' should be correct.", value, instance.getRecommendedRPAppliances());
    }

    /**
     * Accuracy test for method <code>setRecommendedRPAppliances(int recommendedRPAppliances)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetRecommendedRPAppliances() {
        int value = 17;
        instance.setRecommendedRPAppliances(value);
        assertEquals("'setRecommendedRPAppliances' should be correct.", value,
                TestHelper.getField(instance, "recommendedRPAppliances"));
    }

    /**
     * Accuracy test for method <code>getSiteOverview()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetSiteOverview() {
        BasicRPSiteOverview value = new BasicRPSiteOverview();
        instance.setSiteOverview(value);
        assertEquals("'getSiteOverview' should be correct.", value, instance.getSiteOverview());
    }

    /**
     * Accuracy test for method <code>setSiteOverview(BasicRPSiteOverview siteOverview)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetSiteOverview() {
        BasicRPSiteOverview value = new BasicRPSiteOverview();
        instance.setSiteOverview(value);
        assertEquals("'setSiteOverview' should be correct.", value, TestHelper.getField(instance, "siteOverview"));
    }

    /**
     * Accuracy test for method <code>getApplicationOverviews()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetApplicationOverviews() {
        List<BasicRPApplicationOverview> value = new ArrayList<BasicRPApplicationOverview>();
        instance.setApplicationOverviews(value);
        assertEquals("'getApplicationOverviews' should be correct.", value, instance.getApplicationOverviews());
    }

    /**
     * Accuracy test for method <code>setApplicationOverviews(List<BasicRPApplicationOverview> applicationOverviews)
     * </code>. The value should be properly set.
     */
    @Test
    public void testSetApplicationOverviews() {
        List<BasicRPApplicationOverview> value = new ArrayList<BasicRPApplicationOverview>();
        instance.setApplicationOverviews(value);
        assertEquals("'setApplicationOverviews' should be correct.", value,
                TestHelper.getField(instance, "applicationOverviews"));
    }
}
