package com.lq.factorymethod.sample.idcard;

import java.util.ArrayList;
import java.util.List;

import com.lq.factorymethod.sample.framework.Factory;
import com.lq.factorymethod.sample.framework.Product;

public class IDCardFactory extends Factory {
	private List<String> owners = new ArrayList<String>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard) product).getOwner());
	}

	public List<String> getOwners() {
		return owners;
	}
}
