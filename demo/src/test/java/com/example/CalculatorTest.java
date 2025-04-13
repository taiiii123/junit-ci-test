package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

class CalculatorTest {

    @Test
    @DisplayName("2 と 3 の加算は 5 になる")
    void test1() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3), "2 + 3 は 5 のはず");
    }

    @Test
    @DisplayName("2 と -3 の加算は -1 になる")
    void test2() {
        Calculator calc = new Calculator();
        assertEquals(-1, calc.add(2, -3), "2 + (-3) は -1 のはず");
    }

    @Test
    @DisplayName("2 と 0 の加算は 2 になる")
    void test3() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.add(2, 0), "2 + 0 は 2 のはず");
    }
}
