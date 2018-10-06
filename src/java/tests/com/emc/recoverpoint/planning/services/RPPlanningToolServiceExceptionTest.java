/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.services;

import com.emc.recoverpoint.planning.RPPlanningToolServiceException;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * <p>
 * Unit test of {@link RPPlanningToolServiceException} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class RPPlanningToolServiceExceptionTest extends TestCase {

    /**
     * Represents a detail message.
     */
    private static final String DETAIL_MESSAGE = "detail message.";
    /**
     * Represents the error cause.
     */
    private static final Throwable CAUSE = new Exception("UnitTests");

    /**
     * <code>RPPlanningToolServiceException</code> should be a subclass of <code>Exception</code>.
     */
    @Test
    public void testInheritance() {
        assertTrue("RPPlanningToolServiceException should be a subclass of Exception.",
                RPPlanningToolServiceException.class.getSuperclass() == Exception.class);
    }

    /**
     * Tests accuracy of <code>RPPlanningToolServiceException(String)</code> constructor.
     * Instance should be correctly created.
     */
    @Test
    public void testCtor1() {
        RPPlanningToolServiceException exception = new RPPlanningToolServiceException(DETAIL_MESSAGE);

        // Verify the detail error message
        assertEquals("Detailed error message should be correct.", DETAIL_MESSAGE, exception.getMessage());
        // Verify the error cause
        assertNull("Error cause should be null.", exception.getCause());
    }

    /**
     * Tests accuracy of <code>RPPlanningToolServiceException(String, Throwable)</code> constructor.
     * Instance should be correctly created.
     */
    @Test
    public void testCtor2() {
        RPPlanningToolServiceException exception = new RPPlanningToolServiceException(DETAIL_MESSAGE, CAUSE);

        // Verify the detail error message
        assertEquals("Detailed error message should be correct.", DETAIL_MESSAGE, exception.getMessage());
        // Verify the error cause
        assertSame("Error cause should be correct.", CAUSE, exception.getCause());
    }
}
