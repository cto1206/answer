package com.ymm56.trade.order.center.biz.chain;

public class ConcreteLessOneMillionHandler extends Handler {

	@Override
	public double handlerRequest(int profit) {
		if (profit > 600000 && profit <= 1000000) {
            return 100000 * 0.1 + 100000 * 0.075  + 200000 * 0.05  + 200000 * 0.03
            		+ (profit - 600000) * 0.015;
        } else {
            return 100000 * 0.1 + 100000 * 0.075  + 200000 * 0.05  + 200000 * 0.03
            		+ 400000 * 0.015 + (profit-1000000) * 0.01;
        }
	}

}
