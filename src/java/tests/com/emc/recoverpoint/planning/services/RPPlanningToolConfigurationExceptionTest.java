/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.services;

import com.emc.recoverpoint.planning.RPPlanningToolConfigurationException;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * <p>
 * Unit test for {@link RPPlanningToolConfigurationException} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class RPPlanningToolConfigurationExceptionTest extends TestCase {

    /**
     * Represents a detail message.
     */
    private static final String DETAIL_MESSAGE = "detail message.";
    /**
     * Represents the error cause.
     */
    private static final Throwable CAUSE = new Exception("UnitTests");

    /**
     * <code>RPPlanningToolConfigurationException</code> should be a subclass of <code>RuntimeException</code>.
     */
    @Test
    public void testInheritance() {
        assertTrue("RPPlanningToolConfigurationException should be a subclass of RuntimeException.",
                RPPlanningToolConfigurationException.class.getSuperclass() == RuntimeException.class);
    }

    /**
     * Tests accuracy of <code>RPPlanningToolConfigurationException(String)</code> constructor.
     * Instance should be correctly created.
     */
    @Test
    public void testCtor1() {
        RPPlanningToolConfigurationException exception = new RPPlanningToolConfigurationException(DETAIL_MESSAGE);

        // Verify the detail error message
        assertEquals("Detailed error message should be correct.", DETAIL_MESSAGE, exception.getMessage());
        // Verify the error cause
        assertNull("Error cause should be null.", exception.getCause());
    }

    /**
     * Tests accuracy of <code>RPPlanningToolConfigurationException(String, Throwable)</code> constructor.
     * Instance should be correctly created.
     */
    @Test
    public void testCtor2() {
        RPPlanningToolConfigurationException exception = new RPPlanningToolConfigurationException(DETAIL_MESSAGE,
                CAUSE);

        // Verify the detail error message
        assertEquals("Detailed error message should be correct.", DETAIL_MESSAGE, exception.getMessage());
        // Verify the error cause
        assertSame("Error cause should be correct.", CAUSE, exception.getCause());
    }
}
