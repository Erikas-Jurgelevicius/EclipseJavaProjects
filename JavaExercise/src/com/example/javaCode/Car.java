package com.example.javaCode;

public class Car extends Vechicle{

	Car(String color, int numberOfWheels, int numberOfSeats) {
		super(color, numberOfWheels, numberOfSeats);

	}

	@Override
	public void makeSound() {
		System.out.println("Beep! beep!");
	}

	@Override
	public void accelerateVechicle() {
		System.out.println("Car accelerates");
	}

	@Override
	public void stopVechicle() {
		System.out.println("Car has stoped");
		
	}

}
