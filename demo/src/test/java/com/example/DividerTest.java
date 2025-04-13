package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DividerTest {

    @Test
    void 正の数同士の割り算が正しく計算される() {
        Divider d = new Divider();
        assertEquals(5, d.divide(10, 2), "10 ÷ 2 は 5 のはず");
    }

    @Test
    void 負の数との割り算が正しく計算される() {
        Divider d = new Divider();
        assertEquals(-3, d.divide(9, -3), "9 ÷ (-3) は -3 のはず");
    }

    @Test
    void ゼロで割ろうとすると例外が発生する() {
        Divider d = new Divider();
        assertThrows(ArithmeticException.class, () -> d.divide(10, 0), "0で割ることはできません");
    }

    @Test
    void ゼロで割られた場合も正しく処理される() {
        Divider d = new Divider();
        assertEquals(0, d.divide(0, 5), "0 ÷ 5 は 0 のはず");
    }
}
