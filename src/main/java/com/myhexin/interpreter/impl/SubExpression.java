package com.myhexin.interpreter.impl;

import com.myhexin.interpreter.Expression;
import com.myhexin.interpreter.SymbolExpression;

import java.util.Map;

public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left , Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) - right.interpreter(var);
    }
}
