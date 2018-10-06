/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import com.emc.recoverpoint.planning.TestHelper;
import java.util.Date;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Unit test for {@link Workspace} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class WorkspaceTest extends TestCase {

    /**
     * Represents <code>Workspace</code> instance used in tests.
     */
    private Workspace instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new Workspace();
    }

    /**
     * Tear down the unit test.
     *
     * @throws Exception to JUnit.
     */
    @After
    @Override
    public void tearDown() throws Exception {
        instance = null;
    }

    /**
     * <code>Workspace</code> should be subclass of <code>BaseWorkspaceEntity</code>.
     */
    @Test
    public void testInheritance() {
        assertTrue("Workspace should be a subclass of BaseWorkspaceEntity.",
                Workspace.class.getSuperclass() == BaseWorkspaceEntity.class);
    }

    /**
     * Accuracy test for the constructor <code>Workspace</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new Workspace();

        assertNull("'lastCorrelatedDate' should be correct.", TestHelper.getField(instance, "lastCorrelatedDate"));
    }

    /**
     * Accuracy test for method <code>getLastCorrelatedDate()</code>. The value should be properly retrieved.
     */
    @Test
    public void testGetLastCorrelatedDate() {
        Date value = new Date(123456789L);
        instance.setLastCorrelatedDate(value);
        assertEquals("'getLastCorrelatedDate' should be correct.", value, instance.getLastCorrelatedDate());
    }

    /**
     * Accuracy test for method <code>setLastCorrelatedDate(Date lastCorrelatedDate)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetLastCorrelatedDate() {
        Date value = new Date(1234567891234L);
        instance.setLastCorrelatedDate(value);
        assertEquals("'setLastCorrelatedDate' should be correct.", value,
                TestHelper.getField(instance, "lastCorrelatedDate"));
    }
}
