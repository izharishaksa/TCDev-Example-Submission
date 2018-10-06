/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import com.emc.recoverpoint.planning.TestHelper;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Unit test for {@link RPFeatureSelections} class.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class RPFeatureSelectionsTest extends TestCase {

    /**
     * Represents <code>RPFeatureSelections</code> instance used in tests.
     */
    private RPFeatureSelections instance;

    /**
     * Setup the unit test.
     *
     * @throws Exception to JUnit.
     */
    @Before
    @Override
    public void setUp() throws Exception {
        instance = new RPFeatureSelections();
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
     * Accuracy test for the constructor <code>RPFeatureSelections</code>. Instance should be created correctly.
     */
    @Test
    public void testCtor() {
        instance = new RPFeatureSelections();

        assertFalse("'distributedConsistencyGroupsSelected' should be correct.",
                (Boolean) TestHelper.getField(instance, "distributedConsistencyGroupsSelected"));
        assertFalse("'dataCompressionSelected' should be correct.",
                (Boolean) TestHelper.getField(instance, "dataCompressionSelected"));
        assertFalse("'deduplicationSelected' should be correct.",
                (Boolean) TestHelper.getField(instance, "deduplicationSelected"));
        assertFalse("'snapshotConsolidationSelected' should be correct.",
                (Boolean) TestHelper.getField(instance, "snapshotConsolidationSelected"));
        assertFalse("'journalCompressionSelected' should be correct.",
                (Boolean) TestHelper.getField(instance, "journalCompressionSelected"));
    }

    /**
     * Accuracy test for method <code>isDistributedConsistencyGroupsSelected()</code>.
     * The value should be properly retrieved.
     */
    @Test
    public void testIsDistributedConsistencyGroupsSelected() {
        boolean value = true;
        instance.setDistributedConsistencyGroupsSelected(value);
        assertEquals("'isDistributedConsistencyGroupsSelected' should be correct.", value,
                instance.isDistributedConsistencyGroupsSelected());
    }

    /**
     * Accuracy test for method <code>setDistributedConsistencyGroupsSelected(boolean
     * distributedConsistencyGroupsSelected)</code>. The value should be properly set.
     */
    @Test
    public void testSetDistributedConsistencyGroupsSelected() {
        boolean value = false;
        instance.setDistributedConsistencyGroupsSelected(value);
        assertEquals("'setDistributedConsistencyGroupsSelected' should be correct.", value,
                TestHelper.getField(instance, "distributedConsistencyGroupsSelected"));
    }

    /**
     * Accuracy test for method <code>isDataCompressionSelected()</code>. The value should be properly retrieved.
     */
    @Test
    public void testIsDataCompressionSelected() {
        boolean value = true;
        instance.setDataCompressionSelected(value);
        assertEquals("'isDataCompressionSelected' should be correct.", value,
                instance.isDataCompressionSelected());
    }

    /**
     * Accuracy test for method <code>setDataCompressionSelected(boolean dataCompressionSelected)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetDataCompressionSelected() {
        boolean value = false;
        instance.setDataCompressionSelected(value);
        assertEquals("'setDataCompressionSelected' should be correct.", value,
                TestHelper.getField(instance, "dataCompressionSelected"));
    }

    /**
     * Accuracy test for method <code>isDeduplicationSelected()</code>. The value should be properly retrieved.
     */
    @Test
    public void testIsDeduplicationSelected() {
        boolean value = true;
        instance.setDeduplicationSelected(value);
        assertEquals("'isDeduplicationSelected' should be correct.", value,
                instance.isDeduplicationSelected());
    }

    /**
     * Accuracy test for method <code>setDeduplicationSelected(boolean deduplicationSelected)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetDeduplicationSelected() {
        boolean value = false;
        instance.setDeduplicationSelected(value);
        assertEquals("'setDeduplicationSelected' should be correct.", value,
                TestHelper.getField(instance, "deduplicationSelected"));
    }

    /**
     * Accuracy test for method <code>isSnapshotConsolidationSelected()</code>. The value should be properly retrieved.
     */
    @Test
    public void testIsSnapshotConsolidationSelected() {
        boolean value = false;
        instance.setSnapshotConsolidationSelected(value);
        assertEquals("'isSnapshotConsolidationSelected' should be correct.", value,
                instance.isSnapshotConsolidationSelected());
    }

    /**
     * Accuracy test for method <code>setSnapshotConsolidationSelected(boolean snapshotConsolidationSelected)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetSnapshotConsolidationSelected() {
        boolean value = true;
        instance.setSnapshotConsolidationSelected(value);
        assertEquals("'setSnapshotConsolidationSelected' should be correct.", value,
                TestHelper.getField(instance, "snapshotConsolidationSelected"));
    }

    /**
     * Accuracy test for method <code>isJournalCompressionSelected()</code>. The value should be properly retrieved.
     */
    @Test
    public void testIsJournalCompressionSelected() {
        boolean value = false;
        instance.setJournalCompressionSelected(value);
        assertEquals("'isJournalCompressionSelected' should be correct.", value,
                instance.isJournalCompressionSelected());
    }

    /**
     * Accuracy test for method <code>setJournalCompressionSelected(boolean journalCompressionSelected)</code>.
     * The value should be properly set.
     */
    @Test
    public void testSetJournalCompressionSelected() {
        boolean value = false;
        instance.setJournalCompressionSelected(value);
        assertEquals("'setJournalCompressionSelected' should be correct.", value,
                TestHelper.getField(instance, "journalCompressionSelected"));
    }
}
