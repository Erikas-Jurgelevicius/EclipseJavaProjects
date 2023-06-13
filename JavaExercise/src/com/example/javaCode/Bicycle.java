package com.example.javaCode;

public class Bicycle extends Vechicle{

	Bicycle(String color, int numberOfWheels, int numberOfSeats) {
		super(color, numberOfWheels, numberOfSeats);
	}

	@Override
	public void makeSound() {
		System.out.println("Honk honk!");
	}

	@Override
	public void accelerateVechicle() {
		System.out.println("Bicycle accelerates");
	}

	@Override
	public void stopVechicle() {
		System.out.println("Bicycle stoped moving");
	}

}
