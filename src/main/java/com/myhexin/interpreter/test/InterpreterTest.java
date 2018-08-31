package com.myhexin.interpreter.test;

import com.myhexin.interpreter.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class InterpreterTest {
    public static void main(String[] args) throws Exception {
        String expStr = getExpStr();
        Map<String,Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果为: " + expStr + "=" + calculator.run(var));
    }

    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式:");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
    public static Map<String,Integer> getValue(String expStr) throws IOException {
        Map<String,Integer> map = new HashMap<>();
        for(char ch : expStr.toCharArray()) {
            if(ch != '+'&& ch != '-') {
                if(!map.containsKey(String.valueOf(ch))) {
                    System.out.println("请输入" + ch + "的值:");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch),Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}
