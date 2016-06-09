package net.praqma.tracey.core;

/**
 *
 * @author Mads
 */
public interface TraceyAggregator {
    public void store(String json);
    public void configure(String config);
}
