/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.praqma.tracey.core;

import groovy.util.ConfigObject;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Mads
 */
public class TraceyConfigParserTest {

    @Test
    public void testConfigParsing() {
        TraceyDefaultParserImpl parserimpl = new TraceyDefaultParserImpl();
        ConfigObject obj = parserimpl.parse("broker { rabbitmq { host = 'localhost:4000'\n user = 'myuser' } }");
        Map m = ((Map)obj.get("broker"));
        Map m2 = (Map)m.get("rabbitmq");
        String h = (String)m2.get("host");
        String u = (String)m2.get("user");
        assertEquals(h, "localhost:4000");
        assertEquals(u, "myuser");
    }
}
