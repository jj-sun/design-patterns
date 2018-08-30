package com.myhexin.interpreter;

import java.util.Map;

/**
 * 解释器模式，项目中使用较少
 */
public abstract class Expression {
    public abstract int interpreter(Map<String, Integer> var);
}
