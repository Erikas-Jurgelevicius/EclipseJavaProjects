package com.example.javaCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Vechicle> transportList = new ArrayList<Vechicle>();

		Car car = new Car("Blue", 3 , 1);
//		vechicle.accelerateVechicle();
//		vechicle.makeSound();
//		vechicle.stopVechicle();
		
		ElectricCar eCar = new ElectricCar("Black", 4 , 4);
//		eCar.startEngine();
//		ElectricCarFeatures.showBatteryUsage();
		
		GasolineCar gCar = new GasolineCar("Red", 4 , 2);
//		gCar.openRoof();
//		GasolineCarFeatures.turboBoost();
		
		Bicycle bike = new Bicycle("White", 2 , 1);
//		bike.makeSound();
//		bike.accelerateVechicle();
//		bike.stopVechicle();
		
		transportList.add(car);
		transportList.add(eCar);
		transportList.add(gCar);
		transportList.add(bike);
		
		for(Vechicle transport : transportList) {			
			
			selectCar(transport);
		}
	}
	
	
	
	public static void selectCar(Vechicle var) {
		
		if(var.getClass() == Car.class) {
			System.out.println("It is a car");
			var.makeSound();
		}
		else if(var.getClass() == ElectricCar.class) {
			System.out.println("It is a electric car");
			var.accelerateVechicle();
		}
		else if(var.getClass() == GasolineCar.class) {
			System.out.println("It is a gasoline car");
			var.stopVechicle();
		}
		else if(var.getClass() == Bicycle.class) {
			System.out.println("It is a bicycle");
			var.makeSound();
		}
	}

}
