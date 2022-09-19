package com.daria;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {

    @Test
    void exampleTest0() {
        Assertions.assertFalse(2 <= 1);
    }

    @Test
    void exampleTest1() {
        Assertions.assertTrue(3 >= 2);
    }
    @Test
    void exampleTest2() {
        Assertions.assertTrue(10 > 8);
    }
}
