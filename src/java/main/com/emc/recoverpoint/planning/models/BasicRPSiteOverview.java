/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import java.io.Serializable;

/**
 * <p>
 * This data model represents the site overview of a basic Recover Point sizing result. It is a Javabean.
 * It has one no-parameter constructor that is empty. Each field of this class has a getter and setter.
 * There is no validation done in the setters. The properties just set and get the values.
 * </p>
 *
 * <p>
 * <strong>Thread Safety:</strong> This class is mutable and not thread safe.
 * </p>
 *
 * @author albertwang, TCSDEVELOPER
 * @version 1.0
 */
public class BasicRPSiteOverview implements Serializable {

    /**
     * <p>
     * The serial version UID.
     * </p>
     */
    private static final long serialVersionUID = 123456782L;
    /**
     * <p>
     * Represents the total required bandwidth per site.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double totalRequiredBandwidthPerSite;
    /**
     * <p>
     * Represents the total required storage space.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double totalRequiredStorageSpace;
    /**
     * <p>
     * Represents the total replicated data.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double totalReplicatedData;
    /**
     * <p>
     * Represents the total applications generated data.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double totalApplicationsGeneratedData;
    /**
     * <p>
     * Represents the first time site synchronized.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double firstTimeSiteSync;

    /**
     * Creates an instance of BasicRPSiteOverview.
     */
    public BasicRPSiteOverview() {
        //empty
    }

    /**
     * Gets the total required bandwidth per site.
     *
     * @return the total required bandwidth per site.
     */
    public double getTotalRequiredBandwidthPerSite() {
        return totalRequiredBandwidthPerSite;
    }

    /**
     * Sets the total required bandwidth per site.
     *
     * @param totalRequiredBandwidthPerSite
     *              The total required bandwidth per site to set.
     */
    public void setTotalRequiredBandwidthPerSite(double totalRequiredBandwidthPerSite) {
        this.totalRequiredBandwidthPerSite = totalRequiredBandwidthPerSite;
    }

    /**
     * Gets the total required storage space.
     *
     * @return the total required storage space.
     */
    public double getTotalRequiredStorageSpace() {
        return totalRequiredStorageSpace;
    }

    /**
     * Sets the total required storage space.
     *
     * @param totalRequiredStorageSpace
     *              The total required storage space to set.
     */
    public void setTotalRequiredStorageSpace(double totalRequiredStorageSpace) {
        this.totalRequiredStorageSpace = totalRequiredStorageSpace;
    }

    /**
     * Gets the total replicated data.
     *
     * @return the total replicated data.
     */
    public double getTotalReplicatedData() {
        return totalReplicatedData;
    }

    /**
     * Sets the total replicated data.
     *
     * @param totalReplicatedData
     *              The total replicated data to set.
     */
    public void setTotalReplicatedData(double totalReplicatedData) {
        this.totalReplicatedData = totalReplicatedData;
    }

    /**
     * Gets the total applications generated data.
     *
     * @return the total applications generated data.
     */
    public double getTotalApplicationsGeneratedData() {
        return totalApplicationsGeneratedData;
    }

    /**
     * Sets the total applications generated data.
     *
     * @param totalApplicationsGeneratedData
     *              The total applications generated data to set.
     */
    public void setTotalApplicationsGeneratedData(double totalApplicationsGeneratedData) {
        this.totalApplicationsGeneratedData = totalApplicationsGeneratedData;
    }

    /**
     * Gets the first time site synchronized.
     *
     * @return the first time site synchronized.
     */
    public double getFirstTimeSiteSync() {
        return firstTimeSiteSync;
    }

    /**
     * Sets the first time site synchronized.
     *
     * @param firstTimeSiteSync
     *              The first time site synchronized.
     */
    public void setFirstTimeSiteSync(double firstTimeSiteSync) {
        this.firstTimeSiteSync = firstTimeSiteSync;
    }
}
