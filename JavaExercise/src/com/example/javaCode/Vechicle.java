package com.example.javaCode;

public abstract class Vechicle {
	
	private String color;
	private int numberOfWheels;
	private int numberOfSeats;
	
	Vechicle(){
	}
	
	Vechicle(String color, int numberOfWheels, int numberOfSeats){
		this.color = color;
		this.numberOfWheels = numberOfWheels;
		this.numberOfSeats = numberOfSeats;
	}
	
	public abstract void makeSound();
	public abstract void accelerateVechicle();
	public abstract void stopVechicle();

}
