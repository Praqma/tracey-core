package net.praqma.tracey.core;

public interface TraceyMessaging {
    public String send(String event, String payload, String destination);
    public void recieve(String source);
    public void configure(String config);
}
