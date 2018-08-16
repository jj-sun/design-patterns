package com.myhexin.liability;

/**
 * 责任链模式
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_QEQUEST = 1;
    public final static int HUSBAND_LEVEL_QEQUEST = 2;
    public final static int SON_LEVEL_QEQUEST = 3;

    private int level = 0;

    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public final void HandleMessage(IWomen women) {
        if(women.getType() == this.level) {
            this.response(women);
        }else {
            if(this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            }else {
                System.out.println("不同意请求");
            }

        }
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }
    protected abstract void response(IWomen women);
}
