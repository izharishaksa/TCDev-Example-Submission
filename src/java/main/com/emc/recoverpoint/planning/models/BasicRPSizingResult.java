/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * This data model represents a basic Recover Point sizing result. It is a Javabean. It has one no-parameter
 * constructor that is empty. Each field of this class has a getter and setter. There is no validation done
 * in the setters. The properties just set and get the values.
 * </p>
 *
 * <p>
 * <strong>Thread Safety:</strong> This class is mutable and not thread safe.
 * </p>
 *
 * @author albertwang, TCSDEVELOPER
 * @version 1.0
 */
public class BasicRPSizingResult implements Serializable {

    /**
     * <p>
     * The serial version UID.
     * </p>
     */
    private static final long serialVersionUID = 22345678912L;
    /**
     * <p>
     * Represents the recommended recover point appliances.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private int recommendedRPAppliances;
    /**
     * <p>
     * Represents the site overview.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private BasicRPSiteOverview siteOverview;
    /**
     * <p>
     * Represents the list of application overviews.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private List<BasicRPApplicationOverview> applicationOverviews;

    /**
     * Creates an instance of BasicRPSizingResult.
     */
    public BasicRPSizingResult() {
        //empty
    }

    /**
     * Gets the recommended recover point appliances.
     *
     * @return the recommended appliances.
     */
    public int getRecommendedRPAppliances() {
        return recommendedRPAppliances;
    }

    /**
     * Sets the recommended appliances.
     *
     * @param recommendedRPAppliances
     *              The recommended appliances to set.
     */
    public void setRecommendedRPAppliances(int recommendedRPAppliances) {
        this.recommendedRPAppliances = recommendedRPAppliances;
    }

    /**
     * Gets the site overview.
     *
     * @return the site overview.
     */
    public BasicRPSiteOverview getSiteOverview() {
        return siteOverview;
    }

    /**
     * Sets the site overview.
     *
     * @param siteOverview
     *              The site overview to set.
     */
    public void setSiteOverview(BasicRPSiteOverview siteOverview) {
        this.siteOverview = siteOverview;
    }

    /**
     * Gets the list of application overviews.
     *
     * @return the list of application overviews.
     */
    public List<BasicRPApplicationOverview> getApplicationOverviews() {
        return applicationOverviews;
    }

    /**
     * Sets the list of application overviews.
     *
     * @param applicationOverviews
     *              The list of application overviews to set.
     */
    public void setApplicationOverviews(List<BasicRPApplicationOverview> applicationOverviews) {
        this.applicationOverviews = applicationOverviews;
    }
}
