package com.lq.sample1;

/**
 * 类适配器模式（继承的适配器）
 * @author liuqiang
 *
 */
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
