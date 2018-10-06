/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import java.io.Serializable;

/**
 * <p>
 * This data model represents a raw data item. It is a Javabean. It has one no-parameter constructor that is empty.
 * Each field of this class has a getter and setter. There is no validation done in the setters. The properties just set
 * and get the values.
 * </p>
 *
 * <p>
 * <strong>Thread Safety:</strong> This class is mutable and not thread safe.
 * </p>
 *
 * @author albertwang, TCSDEVELOPER
 * @version 1.0
 */
public class RawDataItem extends BaseWorkspaceEntity implements Serializable {

    /**
     * <p>
     * The serial version UID.
     * </p>
     */
    private static final long serialVersionUID = 223445399154L;
    /**
     * <p>
     * Represents workspace id.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * Represents data type.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * Represents content.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private byte[] content;

    /**
     * Creates an instance of RawDataItem.
     */
    public RawDataItem() {
        //empty
    }

    /**
     * Gets the workspace id.
     *
     * @return the workspace id.
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    /**
     * Sets the workspace id.
     *
     * @param workspaceId
     *              The workspace id to set.
     */
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * Gets the data type.
     *
     * @return the data type.
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the data type.
     *
     * @param dataType
     *              The data type to set.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Gets the content.
     *
     * @return the content.
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the content.
     *
     * @param content
     *              The content to set.
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}
