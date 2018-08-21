package com.myhexin.strategy.enumstrategy;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("加法运算结果: " + Calculator.ADD.exec(1,1));
        System.out.println("减法运算结果: " + Calculator.SUB.exec(5,2));
    }
}
