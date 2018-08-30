package com.myhexin.interpreter;

import com.myhexin.interpreter.impl.AddExpression;
import com.myhexin.interpreter.impl.SubExpression;
import com.myhexin.interpreter.impl.VarExpression;

import java.util.Map;
import java.util.Stack;

public class Calculator {
    private Expression expression;
    public Calculator(String str) {
        Stack<Expression> stack = new Stack<>();
        char[] array = str.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < array.length; i++) {

            switch (array[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(array[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(array[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(array[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }
    public int run(Map<String,Integer> var) {
        return this.expression.interpreter(var);
    }

}
