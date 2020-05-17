package com.ymm56.trade.order.center.biz.chain;

public class ConcreteLessTwoHundredThousandHandler extends Handler {

	@Override
	public double handlerRequest(int profit) throws Exception{
		if (profit > 100000 && profit <= 200000) {
            return 100000 * 0.1 + (profit-100000) * 0.075;
        } else {
            return processor.handlerRequest(profit); // 将请求发送给下一位
        }
	}

}
