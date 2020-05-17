package com.ymm56.trade.order.center.biz.chain;

public abstract class Handler {

    protected Handler processor;

    public void setProcessor(Handler processor) { // 设置下一个处理者
        this.processor = processor;
    }

    public abstract double handlerRequest(int profit) throws Exception; // 请求处理逻辑

}
