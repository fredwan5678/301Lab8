package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JustATest {

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void test() {
        City city  = mockCity();

        assertEquals(city.returnOne(), 1);
    }
}
