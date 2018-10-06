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
 * Unit test for {@link BasicRPSizingRequest} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class BasicRPSizingRequestTest extends TestCase {

    /**
     * Represents <code>BasicRPSizingRequest</code> instance used in tests.
     */
    private BasicRPSizingRequest instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new BasicRPSizingRequest();
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
     * Accuracy test for the constructor <code>BasicRPSizingRequest</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new BasicRPSizingRequest();

        assertNull("'requestID' should be correct.",
                TestHelper.getField(instance, "requestID"));
        assertNull("'applicationConfigurations' should be correct.",
                TestHelper.getField(instance, "applicationConfigurations"));
        assertEquals("'interSiteLinkBandwidth' should be correct.", new Double(0),
                TestHelper.getField(instance, "interSiteLinkBandwidth"));
        assertNull("'rpFeatureSelections' should be correct.",
                TestHelper.getField(instance, "rpFeatureSelections"));
    }

    /**
     * Accuracy test for method <code>getRequestID()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetRequestID() {
        String value = "abcd123";
        instance.setRequestID(value);
        assertEquals("'getRequestID' should be correct.", value, instance.getRequestID());
    }

    /**
     * Accuracy test for method <code>setRequestID(String requestID)</code>. The value should be properly set.
     */
    @Test
    public void testSetRequestID() {
        String value = "abcd123";
        instance.setRequestID(value);
        assertEquals("'setRequestID' should be correct.", value, TestHelper.getField(instance, "requestID"));
    }

    /**
     * Accuracy test for method <code>getApplicationConfigurations()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetApplicationConfigurations() {
        List<BasicRPApplicationConfiguration> value = new ArrayList<BasicRPApplicationConfiguration>();
        instance.setApplicationConfigurations(value);
        assertEquals("'getApplicationConfiguration' should be correct.", value,
                instance.getApplicationConfigurations());
    }

    /**
     * Accuracy test for method <code>setApplicationConfigurations(List<BasicRPApplicationConfiguration>
     * applicationConfigurations)</code>. The value should be properly set.
     */
    @Test
    public void testSetApplicationConfigurations() {
        List<BasicRPApplicationConfiguration> value = new ArrayList<BasicRPApplicationConfiguration>();
        instance.setApplicationConfigurations(value);
        assertEquals("'setApplicationConfiguration' should be correct.", value,
                TestHelper.getField(instance, "applicationConfigurations"));
    }

    /**
     * Accuracy test for method <code>getInterSiteLinkBandwidth()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetInterSiteLinkBandwidth() {
        double value = 1234.63454;
        instance.setInterSiteLinkBandwidth(value);
        assertEquals("'getInterSiteLinkBandwidth' should be correct.", value, instance.getInterSiteLinkBandwidth());
    }

    /**
     * Accuracy test for method <code>setInterSiteLinkBandwidth(double interSiteLinkBandwidth)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetInterSiteLinkBandwidth() {
        double value = 1234.63454;
        instance.setInterSiteLinkBandwidth(value);
        assertEquals("'setInterSiteLinkBandwidth' should be correct.", value,
                TestHelper.getField(instance, "interSiteLinkBandwidth"));
    }

    /**
     * Accuracy test for method <code>getRpFeatureSelections()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetRpFeatureSelections() {
        RPFeatureSelections value = new RPFeatureSelections();
        instance.setRpFeatureSelections(value);
        assertEquals("'getRpFeatureSelections' should be correct.", value, instance.getRpFeatureSelections());
    }

    /**
     * Accuracy test for method <code>setRpFeatureSelections(RPFeatureSelections rpFeatureSelections)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetRpFeatureSelections() {
        RPFeatureSelections value = new RPFeatureSelections();
        instance.setRpFeatureSelections(value);
        assertEquals("'getRpFeatureSelections' should be correct.", value,
                TestHelper.getField(instance, "rpFeatureSelections"));
    }
}
