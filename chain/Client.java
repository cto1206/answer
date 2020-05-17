package com.ymm56.trade.order.center.biz.chain;

public class Client {
	
	public static void main(String[] args) throws Exception {
        Handler h1 = new ConcreteLessHundredThousandHandler();
        Handler h2 = new ConcreteLessTwoHundredThousandHandler();
        Handler h4 = new ConcreteLessFourHundredThousandHandler();
        Handler h6 = new ConcreteLessSixHundredThousandHandler();
        Handler h100 = new ConcreteLessOneMillionHandler();
        h1.setProcessor(h2);
        h2.setProcessor(h4);
        h4.setProcessor(h6);
        h6.setProcessor(h100);
        System.out.println(h1.handlerRequest(1000000));
	}

}
