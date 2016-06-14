package net.praqma.tracey.core

import groovy.util.ConfigSlurper;

public class TraceyDefaultParserImpl implements TraceyConfigParser<ConfigObject> {

    def slurper = new ConfigSlurper();

    public ConfigObject parse(File file) {
        slurper.parse(file.toURL());
    }

    public ConfigObject parse(String config) {
        slurper.parse(config);
    }
}