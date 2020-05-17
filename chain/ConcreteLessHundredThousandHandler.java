package com.ymm56.trade.order.center.biz.chain;

public class ConcreteLessHundredThousandHandler extends Handler {

	@Override
	public double handlerRequest(int profit) throws Exception {
		if(profit < 0) {
			throw new Exception("输入不正确");
		} else if (profit >= 0 && profit <= 100000) {
            return profit * 0.1;
        } else {
            return processor.handlerRequest(profit); // 将请求发送给下一位
        }
	}
}
