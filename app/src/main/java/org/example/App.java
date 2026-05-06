package org.example;

import com.google.common.collect.ImmutableSet;
import org.example.model.Data;

public class App {
    public String getGreeting() {
        return "Hello World!!";
    }

    static void main(String[] args) {
        System.out.println(new App().getGreeting());

        ImmutableSet<String> names = Data.COLOR_NAMES;
        for (String name : names) {
            System.out.println(name);
        }
    }
}
