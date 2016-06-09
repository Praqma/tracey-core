## tracey-core

Core module for tracey. Used for configuring the basics of Tracey, including which broker to use, and shared options for all broker types.

Broker implmentations are stored in [tracey-broker](https://github.com/Praqma/tracey-broker)

### Exposed interfaces (Suggested)

```
public interface TraceyMessaging {
    public String send(String event, String payload, String destination);
    public void recieve(String source);
    public void configure(String config);
}

public interface TraceyAggregator {
    public void store(String json);
    public void configure(String config);
}
```

For now all inputs are primitive types. We can argue how up we want the Eiffel, and protocol abstractions to go.



