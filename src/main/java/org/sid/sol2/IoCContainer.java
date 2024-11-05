package org.sid.sol2;

import java.util.HashMap;
import java.util.Map;

public class IoCContainer {
    private Map<Class<?>, Object> services = new HashMap<>();

    public <T> void registerService(Class<T> clazz, T service) {
        services.put(clazz, service);
    }

    public <T> T getService(Class<T> clazz) {
        return clazz.cast(services.get(clazz));
    }
}
