package com.myhexin.strategy.enumstrategy;

public enum Calculator {
    /**
     * 这里，每一个枚举实例都是  public static final 类型的,扩展性受到了一定的约束。
     *
     */
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };
    private String value;

    /**
     * 枚举类的构造方法是private的，只能是private的
     * @param value
     */
    Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public abstract int exec(int a, int b);
}
