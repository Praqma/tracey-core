package net.praqma.tracey.core;

import groovy.util.ConfigObject;
import groovy.util.ConfigSlurper;
import java.io.File;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TraceyDefaultParserImpl implements TraceyConfigParser<ConfigObject> {

    ConfigSlurper slurper = new ConfigSlurper();

    @Override
    public ConfigObject parse(File file) {
        try {
            return slurper.parse(file.toURI().toURL());
        } catch (MalformedURLException ex) {
            Logger.getLogger(TraceyDefaultParserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ConfigObject parse(String config) {
        return slurper.parse(config);
    }
}