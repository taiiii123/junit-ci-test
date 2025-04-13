package com.example;

public class Divider {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("0で割ることはできません");
        }
        return a / b;
    }
}
