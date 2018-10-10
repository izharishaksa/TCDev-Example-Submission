/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning;

import com.emc.recoverpoint.planning.models.BaseFilterTest;
import com.emc.recoverpoint.planning.models.BaseWorkspaceEntityTest;
import com.emc.recoverpoint.planning.models.BasicRPApplicationConfigurationTest;
import com.emc.recoverpoint.planning.models.BasicRPApplicationOverviewTest;
import com.emc.recoverpoint.planning.models.BasicRPSiteOverviewTest;
import com.emc.recoverpoint.planning.models.BasicRPSizingRequestTest;
import com.emc.recoverpoint.planning.models.BasicRPSizingResultTest;
import com.emc.recoverpoint.planning.models.PagedResultTest;
import com.emc.recoverpoint.planning.models.RPFeatureSelectionsTest;
import com.emc.recoverpoint.planning.models.RawDataItemFilterTest;
import com.emc.recoverpoint.planning.models.RawDataItemTest;
import com.emc.recoverpoint.planning.models.WorkspaceFilterTest;
import com.emc.recoverpoint.planning.models.WorkspaceTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * <p>
 * This test case aggregates all Unit test cases.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class UnitTests extends TestCase {

    /**
     * All unit test cases.
     *
     * @return The test suite.
     */
    public static Test suite() {
        final TestSuite suite = new TestSuite();

        suite.addTestSuite(BaseFilterTest.class);
        suite.addTestSuite(BaseWorkspaceEntityTest.class);
        suite.addTestSuite(BasicRPApplicationConfigurationTest.class);
        suite.addTestSuite(BasicRPApplicationOverviewTest.class);
        suite.addTestSuite(BasicRPSiteOverviewTest.class);
        suite.addTestSuite(BasicRPSizingRequestTest.class);
        suite.addTestSuite(BasicRPSizingResultTest.class);
        suite.addTestSuite(PagedResultTest.class);
        suite.addTestSuite(RPFeatureSelectionsTest.class);
        suite.addTestSuite(RawDataItemTest.class);
        suite.addTestSuite(RawDataItemFilterTest.class);
        suite.addTestSuite(WorkspaceTest.class);
        suite.addTestSuite(WorkspaceFilterTest.class);

        suite.addTestSuite(RPPlanningToolConfigurationExceptionTest.class);
        suite.addTestSuite(RPPlanningToolServiceExceptionTest.class);

        suite.addTestSuite(Demo.class);

        return suite;
    }
}
