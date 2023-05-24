package com.khadri.dp.composite.leaf;

import com.khadri.dp.composite.component.User;

public class Car extends User {

	private int millage;

	public Car(int millage) {
		this.millage = millage;
	}

	@Override
	public Integer getMilage() {
		return this.millage;
	}

}
