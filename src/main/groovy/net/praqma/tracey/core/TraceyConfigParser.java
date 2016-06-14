package net.praqma.tracey.core;

import java.io.File;

/**
 *
 * @author Mads
 */
public interface TraceyConfigParser<T> {
    public T parse(File file);
    public T parse(String config);
}
