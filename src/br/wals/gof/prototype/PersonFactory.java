package br.wals.gof.prototype;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {
    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("harry", new Harry());
    }

    public static Person getPerson(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException e) {
            System.out.println("Prototype with name: " + type + ", doesn't exist.");
            return null;
        }
    }
}
