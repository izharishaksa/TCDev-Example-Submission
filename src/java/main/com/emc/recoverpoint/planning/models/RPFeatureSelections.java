/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import java.io.Serializable;

/**
 * <p>
 * This data model represents Recover Point features selected for a sizing request. It is a Javabean.
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
public class RPFeatureSelections implements Serializable {

    /**
     * <p>
     * The serial version UID.
     * </p>
     */
    private static final long serialVersionUID = 22344539917L;
    /**
     * <p>
     * Represents the distributed consistency groups feature.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private boolean distributedConsistencyGroupsSelected;
    /**
     * <p>
     * Represents the data compression feature.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private boolean dataCompressionSelected;
    /**
     * <p>
     * Represents the deduplication feature.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private boolean deduplicationSelected;
    /**
     * <p>
     * Represents the snapshot consolidation feature.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private boolean snapshotConsolidationSelected;
    /**
     * <p>
     * Represents the journal compression feature.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private boolean journalCompressionSelected;

    /**
     * Creates an instance of RPFeatureSelections.
     */
    public RPFeatureSelections() {
        //empty
    }

    /**
     * Gets the value of distributed consistency groups feature.
     *
     * @return true if distributed consistency groups is selected, false otherwise.
     */
    public boolean isDistributedConsistencyGroupsSelected() {
        return distributedConsistencyGroupsSelected;
    }

    /**
     * Sets the value of distributed consistency groups feature.
     *
     * @param distributedConsistencyGroupsSelected
     *              The distributed consistency groups feature to set. True if it is selected, false otherwise.
     */
    public void setDistributedConsistencyGroupsSelected(boolean distributedConsistencyGroupsSelected) {
        this.distributedConsistencyGroupsSelected = distributedConsistencyGroupsSelected;
    }

    /**
     * Gets the value of data compression feature.
     *
     * @return true if data compression is selected, false otherwise.
     */
    public boolean isDataCompressionSelected() {
        return dataCompressionSelected;
    }

    /**
     * Sets the value of data compression feature.
     *
     * @param dataCompressionSelected
     *              The data compression feature to set. True if it is selected, false otherwise.
     */
    public void setDataCompressionSelected(boolean dataCompressionSelected) {
        this.dataCompressionSelected = dataCompressionSelected;
    }

    /**
     * Gets the value of deduplication feature.
     *
     * @return true if deduplication is selected, false otherwise.
     */
    public boolean isDeduplicationSelected() {
        return deduplicationSelected;
    }

    /**
     * Sets the value of deduplication feature.
     *
     * @param deduplicationSelected
     *              The deduplication feature to set. True if it is selected, false otherwise.
     */
    public void setDeduplicationSelected(boolean deduplicationSelected) {
        this.deduplicationSelected = deduplicationSelected;
    }

    /**
     * Gets the value of snapshot consolidation feature.
     *
     * @return true if snapshot consolidation is selected, false otherwise.
     */
    public boolean isSnapshotConsolidationSelected() {
        return snapshotConsolidationSelected;
    }

    /**
     * Sets the value of snapshot consolidation feature.
     *
     * @param snapshotConsolidationSelected
     *              The snapshot consolidation feature to set. True if it is selected, false otherwise.
     */
    public void setSnapshotConsolidationSelected(boolean snapshotConsolidationSelected) {
        this.snapshotConsolidationSelected = snapshotConsolidationSelected;
    }

    /**
     * Gets the value of journal compression feature.
     *
     * @return true if the journal compression is selected, false otherwise.
     */
    public boolean isJournalCompressionSelected() {
        return journalCompressionSelected;
    }

    /**
     * Sets the value of journal compression feature.
     *
     * @param journalCompressionSelected
     *              The journal compression feature to set. True if it is selected, false otherwise.
     */
    public void setJournalCompressionSelected(boolean journalCompressionSelected) {
        this.journalCompressionSelected = journalCompressionSelected;
    }
}
