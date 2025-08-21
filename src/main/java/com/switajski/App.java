package com.switajski;

import java.util.Objects;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        app.nonNull(null);
        app.derivedNonNull(new Something().getNull());
    }

    public void nonNull(Object value) {
        Objects.requireNonNull(value);
    }
    public void derivedNonNull(Object value) {
        Objects.requireNonNull(value);
    }

    private static class Something {
        String getNull(){
            return null;
        }
    }
}
