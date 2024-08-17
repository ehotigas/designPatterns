package injecaodependencia;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {
    private Map<String, Object> tokenInstances = new HashMap<>();

    // Register a class with a specific token
    public void register(String token, Class<?> clazz) throws Exception {
        if (clazz.isAnnotationPresent(Injectable.class)) {
            Object instance = clazz.getDeclaredConstructor().newInstance();
            tokenInstances.put(token, instance);
            injectDependencies(instance);
        } else {
            throw new RuntimeException("Class " + clazz.getName() + " is not marked as @Injectable");
        }
    }

    // Inject dependencies into the instance
    private void injectDependencies(Object instance) throws Exception {
        Field[] fields = instance.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                Inject inject = field.getAnnotation(Inject.class);
                String token = inject.token();
                Object dependency = tokenInstances.get(token);
                if (dependency == null) {
                    throw new RuntimeException("No instance found for token: " + token);
                }
                field.setAccessible(true);
                field.set(instance, dependency);
            }
        }
    }

    // Retrieve an instance by token
    public <T> T getInstance(String token, Class<T> clazz) {
        return clazz.cast(tokenInstances.get(token));
    }
}
