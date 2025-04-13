package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplierTest {

    @Test
    @DisplayName("正の数同士の掛け算が正しく計算される")
    void testPositiveMultiplication() {
        Multiplier m = new Multiplier();
        assertEquals(12, m.multiply(3, 4), "3 × 4 は 12 のはず");
    }

    @Test
    @DisplayName("負の数との掛け算が正しく計算される")
    void testNegativeMultiplication() {
        Multiplier m = new Multiplier();
        assertEquals(-6, m.multiply(2, -3), "2 × (-3) は -6 のはず");
    }

    @Test
    @DisplayName("ゼロとの掛け算はゼロになる")
    void testZeroMultiplication() {
        Multiplier m = new Multiplier();
        assertEquals(0, m.multiply(10, 0), "10 × 0 は 0 のはず");
    }
}
