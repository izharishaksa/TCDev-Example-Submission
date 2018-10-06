/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning;

/**
 * <p>
 * This is custom exception that will be thrown by business services and frontend controllers if any
 * configuration is invalid.
 * </p>
 *
 * <p>
 * <strong>Thread Safety:</strong> Exception class is not thread safety.
 * </p>
 *
 * @author albertwang, TCSDEVELOPER
 * @version 1.0
 */
public class RPPlanningToolConfigurationException extends RuntimeException {

    /**
     * The serial version UID.
     */
    private static final long serialVersionUID = 321567897654L;

    /**
     * Creates the exception with the provided message.
     *
     * @param message The error message.
     */
    public RPPlanningToolConfigurationException(String message) {
        super(message);
    }

    /**
     * Creates the exception with the provided message and cause.
     *
     * @param message The error message.
     * @param cause The error cause.
     */
    public RPPlanningToolConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
