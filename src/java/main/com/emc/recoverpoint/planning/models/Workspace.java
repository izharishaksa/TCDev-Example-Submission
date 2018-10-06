/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * This data model represents a workspace. It has one no-parameter constructor that is empty. Each field of this class
 * has a getter and setter. There is no validation done in the setters. The properties just set and get the values.
 * </p>
 *
 * <p>
 * <strong>Thread Safety:</strong> This class is mutable and not thread safe.
 * </p>
 *
 * @author albertwang, TCSDEVELOPER
 * @version 1.0
 */
public class Workspace extends BaseWorkspaceEntity implements Serializable {

    /**
     * <p>
     * The serial version UID.
     * </p>
     */
    private static final long serialVersionUID = 12744119154L;
    /**
     * <p>
     * Represents the last correlated date.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private Date lastCorrelatedDate;

    /**
     * Creates an instance of Workspace.
     */
    public Workspace() {
        //empty
    }

    /**
     * Gets the last correlated date.
     *
     * @return the last correlated date.
     */
    public Date getLastCorrelatedDate() {
        return lastCorrelatedDate;
    }

    /**
     * Sets the last correlated date.
     *
     * @param lastCorrelatedDate
     *              The last correlated date to set.
     */
    public void setLastCorrelatedDate(Date lastCorrelatedDate) {
        this.lastCorrelatedDate = lastCorrelatedDate;
    }
}
