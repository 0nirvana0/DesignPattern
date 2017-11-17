package com.lq.factorymethod.sample;

import com.lq.factorymethod.sample.framework.Factory;
import com.lq.factorymethod.sample.framework.Product;
import com.lq.factorymethod.sample.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {

		Factory factory = new IDCardFactory();
		Product card1 = factory.create("小明");
		// Product card2 = factory.create("小红");
		// Product card3 = factory.create("小刚");
		card1.use();
		// card2.use();
		// card3.use();
	}
}
