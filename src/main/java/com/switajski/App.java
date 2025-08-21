package com.switajski;

import lombok.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        app.derivedNonNull(new Something().getNull());
        app.derivedNonNullWithLombokNonNull(new Something().getNull());
    }

    public void derivedNonNull(Object value) {
        Objects.requireNonNull(value);
    }

    public void derivedNonNullWithLombokNonNull(@NonNull Object value) {
        Objects.requireNonNull(value);
    }

    private static class Something {

        String getNull(){
            return System.getProperty("nonexistent");
        }
    }
}
