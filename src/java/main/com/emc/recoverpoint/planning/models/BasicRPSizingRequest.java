/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * This data model represents a basic Recover Point sizing request. It is a Javabean. It has one no-parameter
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
public class BasicRPSizingRequest implements Serializable {

    /**
     * <p>
     * The Serial Version UID.
     * </p>
     */
    private static final long serialVersionUID = 12345678911L;
    /**
     * <p>
     * Represents the request ID.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private String requestID;
    /**
     * <p>
     * Represents the list of application configurations.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private List<BasicRPApplicationConfiguration> applicationConfigurations;
    /**
     * <p>
     * Represents the inter site link bandwidth.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double interSiteLinkBandwidth;
    /**
     * <p>
     * Represents the recover point feature selections.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private RPFeatureSelections rpFeatureSelections;

    /**
     * Creates instance of BasicRPSizingRequest.
     */
    public BasicRPSizingRequest() {
        //empty
    }

    /**
     * Gets the request ID.
     *
     * @return the request ID.
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the request ID.
     *
     * @param requestID
     *              The request ID to set.
     */
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    /**
     * Gets the list of application configurations.
     *
     * @return the list of application configurations.
     */
    public List<BasicRPApplicationConfiguration> getApplicationConfigurations() {
        return applicationConfigurations;
    }

    /**
     * Sets the list of application configurations.
     *
     * @param applicationConfigurations
     *              The application configurations to set.
     */
    public void setApplicationConfigurations(List<BasicRPApplicationConfiguration> applicationConfigurations) {
        this.applicationConfigurations = applicationConfigurations;
    }

    /**
     * Gets the inter site link bandwidth.
     *
     * @return the inter site link bandwidth.
     */
    public double getInterSiteLinkBandwidth() {
        return interSiteLinkBandwidth;
    }

    /**
     * Sets the inter site link bandwidth.
     *
     * @param interSiteLinkBandwidth
     *              The inter site link bandwidth to set.
     */
    public void setInterSiteLinkBandwidth(double interSiteLinkBandwidth) {
        this.interSiteLinkBandwidth = interSiteLinkBandwidth;
    }

    /**
     * Gets the feature selections.
     *
     * @return the feature selections.
     */
    public RPFeatureSelections getRpFeatureSelections() {
        return rpFeatureSelections;
    }

    /**
     * Sets the feature selections.
     *
     * @param rpFeatureSelections
     *              The feature selections to set.
     */
    public void setRpFeatureSelections(RPFeatureSelections rpFeatureSelections) {
        this.rpFeatureSelections = rpFeatureSelections;
    }
}