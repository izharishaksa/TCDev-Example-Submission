/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import java.io.Serializable;

/**
 * <p>
 * This data model represents a basic Recover Point application configuration. It is a Javabean.
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
public class BasicRPApplicationConfiguration implements Serializable {

    /**
     * <p>
     * The serial version UID.
     * </p>
     */
    private static final long serialVersionUID = 123456780L;
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
     * Represents the product type.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private String productType;
    /**
     * <p>
     * Represents the application total volumes size.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double applicationTotalVolumesSize;
    /**
     * <p>
     * Represents application average change rate.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double applicationAverageChangeRate;
    /**
     * <p>
     * Represents the required data rollback window.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double requiredDataRollbackWindow;
    /**
     * <p>
     * Represents the storage space for rollback information.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private double storageSpaceForRollbackInformation;

    /**
     * Creates an instance of BasicRPApplicationConfiguration.
     */
    public BasicRPApplicationConfiguration() {
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
     *              The application name to set.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * Gets the product type.
     *
     * @return the product type.
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the product type.
     *
     * @param productType
     *              The product type to set.
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * Gets the application total volumes size.
     *
     * @return the application total volumes size.
     */
    public double getApplicationTotalVolumesSize() {
        return applicationTotalVolumesSize;
    }

    /**
     * Sets the application total volumes size.
     *
     * @param applicationTotalVolumesSize
     *              The application total volumes size to set.
     */
    public void setApplicationTotalVolumesSize(double applicationTotalVolumesSize) {
        this.applicationTotalVolumesSize = applicationTotalVolumesSize;
    }

    /**
     * Gets the application average change rate.
     *
     * @return the application average change rate.
     */
    public double getApplicationAverageChangeRate() {
        return applicationAverageChangeRate;
    }

    /**
     * Sets the application average change rate.
     *
     * @param applicationAverageChangeRate
     *              The application average change rate to set.
     */
    public void setApplicationAverageChangeRate(double applicationAverageChangeRate) {
        this.applicationAverageChangeRate = applicationAverageChangeRate;
    }

    /**
     * Gets the required data rollback window.
     *
     * @return the required data rollback window.
     */
    public double getRequiredDataRollbackWindow() {
        return requiredDataRollbackWindow;
    }

    /**
     * Sets the required data rollback window.
     *
     * @param requiredDataRollbackWindow
     *              The required data rollback window to set.
     */
    public void setRequiredDataRollbackWindow(double requiredDataRollbackWindow) {
        this.requiredDataRollbackWindow = requiredDataRollbackWindow;
    }

    /**
     * Gets the storage space for rollback information.
     *
     * @return the storage space for rollback information.
     */
    public double getStorageSpaceForRollbackInformation() {
        return storageSpaceForRollbackInformation;
    }

    /**
     * Sets the storage space for rollback information.
     *
     * @param storageSpaceForRollbackInformation
     *              The storage space for rollback information to set.
     */
    public void setStorageSpaceForRollbackInformation(double storageSpaceForRollbackInformation) {
        this.storageSpaceForRollbackInformation = storageSpaceForRollbackInformation;
    }
}
