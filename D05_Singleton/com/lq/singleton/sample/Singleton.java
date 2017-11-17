package com.lq.singleton.sample;

public class Singleton {
	private static Singleton singleton = new Singleton();

	public Singleton() {
		System.out.println("生成了一个实例");
	}

	/**
	 * 获取实例
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		return singleton;
	}

}
