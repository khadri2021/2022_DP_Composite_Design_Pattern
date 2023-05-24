package com.khadri.dp.composite.main;

import com.khadri.dp.composite.CompositeVehicleMilage;
import com.khadri.dp.composite.leaf.Byke;
import com.khadri.dp.composite.leaf.Car;

public class TestCompisteMain {

	public static void main(String[] args) {

		Byke byke = new Byke(60);
		System.out.println("Byke Millage " + byke.getMilage());

		Car car = new Car(20);
		System.out.println("Car Millage " + car.getMilage());

		CompositeVehicleMilage composite = new CompositeVehicleMilage(byke, car);
		System.out.println("Vehicle Composition of Millage " + composite.getMilage());

	}
}
