package com.lq.prototype.sample.framework;

public interface Product extends Cloneable {
	public void use(String s);

	public Product createClone();
}
