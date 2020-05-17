package com.ymm56.trade.order.center.biz.chain;

public class ConcreteLessSixHundredThousandHandler extends Handler {

	@Override
	public double handlerRequest(int profit) throws Exception {
		if (profit > 400000 && profit <= 600000) {
            return 100000 * 0.1 + 100000 * 0.075  + 200000 * 0.05  + (profit - 400000) * 0.03;
        } else {
            return processor.handlerRequest(profit); // 将请求发送给下一位
        }
	}

}
