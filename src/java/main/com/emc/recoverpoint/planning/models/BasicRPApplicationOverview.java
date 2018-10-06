/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import java.io.Serializable;

/**
 * <p>
 * This data model represents an application overview of a basic Recover Point sizing result.
 * It is a Javabean. It has one no-parameter constructor that is empty. Each field of this class has a getter and
 * setter. There is no validation done in the setters. The properties just set and get the values.
 * </p>
 *
 * <p>
 * <strong>Thread Safety:</strong> This class is mutable and not thread safe.
 * </p>
 *
 * @author albertwang, TCSDEVELOPER
 * @version 1.0
 */
public class BasicRPApplicationOverview implements Serializable {

    /**
     * <p>
     * The serial version UID.
     * </p>
     */
    private static final long serialVersionUID = 123456781L;
    /**
     * <p>
     * Represents the application name.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Represents the required protection window.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double requiredProtectionWindow;
    /**
     * <p>
     * Represents the available protection window.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double availableProtectionWindow;
    /**
     * <p>
     * Represents the required storage space for rollback.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double requiredStorageSpaceForRollback;
    /**
     * <p>
     * Represents the available storage space for rollback.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double availableStorageSpaceForRollback;
    /**
     * <p>
     * Represents the required bandwidth.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double requiredBandwidth;

    /**
     * Creates an instance of BasicRPApplicationOverview.
     */
    public BasicRPApplicationOverview() {
        //empty
    }

    /**
     * Gets the application name.
     *
     * @return the application name.
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the application name.
     *
     * @param applicationName
     *             The application name to set.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * Gets the required protection window.
     *
     * @return the required protection window.
     */
    public double getRequiredProtectionWindow() {
        return requiredProtectionWindow;
    }

    /**
     * Sets the required protection window.
     *
     * @param requiredProtectionWindow
     *              The required protection window to set.
     */
    public void setRequiredProtectionWindow(double requiredProtectionWindow) {
        this.requiredProtectionWindow = requiredProtectionWindow;
    }

    /**
     * Gets the available protection window.
     *
     * @return the available protection window.
     */
    public double getAvailableProtectionWindow() {
        return availableProtectionWindow;
    }

    /**
     * Sets the available protection window.
     *
     * @param availableProtectionWindow
     *              The available protection window to set.
     */
    public void setAvailableProtectionWindow(double availableProtectionWindow) {
        this.availableProtectionWindow = availableProtectionWindow;
    }

    /**
     * Gets the required storage space for rollback.
     *
     * @return the required storage space for rollback.
     */
    public double getRequiredStorageSpaceForRollback() {
        return requiredStorageSpaceForRollback;
    }

    /**
     * Sets the required storage space for rollback.
     *
     * @param requiredStorageSpaceForRollback
     *              The required storage space for rollback to set.
     */
    public void setRequiredStorageSpaceForRollback(double requiredStorageSpaceForRollback) {
        this.requiredStorageSpaceForRollback = requiredStorageSpaceForRollback;
    }

    /**
     * Gets the available storage space for rollback.
     *
     * @return the available storage space for rollback.
     */
    public double getAvailableStorageSpaceForRollback() {
        return availableStorageSpaceForRollback;
    }

    /**
     * Sets the available storage space for rollback.
     *
     * @param availableStorageSpaceForRollback
     *              The available storage space for rollback to set.
     */
    public void setAvailableStorageSpaceForRollback(double availableStorageSpaceForRollback) {
        this.availableStorageSpaceForRollback = availableStorageSpaceForRollback;
    }

    /**
     * Gets the required bandwidth.
     *
     * @return the required bandwidth.
     */
    public double getRequiredBandwidth() {
        return requiredBandwidth;
    }

    /**
     * Sets the required bandwidth.
     *
     * @param requiredBandwidth
     *              The required bandwidth to set.
     */
    public void setRequiredBandwidth(double requiredBandwidth) {
        this.requiredBandwidth = requiredBandwidth;
    }
}
