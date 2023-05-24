package com.khadri.dp.composite;

import com.khadri.dp.composite.component.User;
import com.khadri.dp.composite.leaf.Byke;
import com.khadri.dp.composite.leaf.Car;

public class CompositeVehicleMilage extends User {

	private Byke byke;
	private Car car;

	public CompositeVehicleMilage(Byke byke, Car car) {
		this.byke = byke;
		this.car = car;
	}

	@Override
	public Integer getMilage() {
		return byke.getMilage() + car.getMilage();
	}

}
