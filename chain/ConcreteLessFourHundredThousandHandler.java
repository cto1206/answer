package com.ymm56.trade.order.center.biz.chain;

public class ConcreteLessFourHundredThousandHandler extends Handler {

	@Override
	public double handlerRequest(int profit) throws Exception {
		if (profit > 200000 && profit <= 400000) {
            return 100000 * 0.1 + 100000 * 0.075  + (profit - 200000) * 0.05 ;
        } else {
            return processor.handlerRequest(profit); // 将请求发送给下一位
        }
	}

}
