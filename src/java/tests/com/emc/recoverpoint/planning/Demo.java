/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning;

import com.emc.recoverpoint.planning.models.BasicRPApplicationOverview;
import com.emc.recoverpoint.planning.models.BasicRPSiteOverview;
import com.emc.recoverpoint.planning.models.BasicRPSizingResult;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * <p>
 * Shows the usage of the component.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class Demo extends TestCase {

    /**
     * Demonstrates the usage of this component.
     *
     * @throws Exception to JUnit.
     */
    @Test
    public void testDemo() throws Exception {
        //Create entities
        BasicRPSizingResult sizingResult = new BasicRPSizingResult();
        BasicRPApplicationOverview applicationOverview = new BasicRPApplicationOverview();
        BasicRPSiteOverview siteOverview = new BasicRPSiteOverview();

        List<BasicRPApplicationOverview> applicationOverviews = new ArrayList<BasicRPApplicationOverview>();
        applicationOverviews.add(applicationOverview);

        //Set properties
        sizingResult.setApplicationOverviews(applicationOverviews);
        sizingResult.setRecommendedRPAppliances(17);
        sizingResult.setSiteOverview(siteOverview);

        //Get properties
        List<BasicRPApplicationOverview> list = sizingResult.getApplicationOverviews();
        int recommendedRPAppliances = sizingResult.getRecommendedRPAppliances();
        BasicRPSiteOverview siteOverviewCopy = sizingResult.getSiteOverview();

        //Create exception
        RPPlanningToolConfigurationException confException = new RPPlanningToolConfigurationException("message");
        RPPlanningToolServiceException serviceException = new RPPlanningToolServiceException("message");

        //Usage of other entities and properties is very trivial and similar
    }
}
