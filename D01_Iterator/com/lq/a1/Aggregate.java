package com.lq.a1;

public interface Aggregate {
	/*
	 * 定义了非抽象方法，它默认也是抽象的方法， 实现类必须重写，你只是省略的关键字abstract， 实际上接口会自动给你加上的
	 */
	public abstract Iterator iterator();
}
