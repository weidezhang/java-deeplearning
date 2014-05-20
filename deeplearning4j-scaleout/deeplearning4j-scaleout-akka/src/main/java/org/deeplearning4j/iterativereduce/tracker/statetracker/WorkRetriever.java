package org.deeplearning4j.iterativereduce.tracker.statetracker;

import org.deeplearning4j.datasets.DataSet;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * A WorkerRetriever handles saving and loading
 * work for a given worker.
 *
 * This allows for scalable data access patterns
 * @author Adam Gibson
 */
public interface WorkRetriever extends Serializable {


    /**
     * The collection of workers that are saved
     * @return the collection of workers that have data saved
     */
    Collection<String> workers();

    /**
     * Loads the data set
     * @param worker the worker to load for
     * @return the data for the given worker or null
     */
    DataSet load(String worker);

    /**
     * Saves the data set for a given worker
     * @param worker the worker to save data for
     * @param data the data to save
     */
    void save(String worker,DataSet data);


}