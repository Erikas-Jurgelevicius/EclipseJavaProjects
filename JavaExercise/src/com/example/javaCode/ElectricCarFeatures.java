package com.example.javaCode;

public interface ElectricCarFeatures {

	public static void showBatteryUsage() {
		System.out.println("Battery usage is normal");
	};
	
	public default void startEngine() {
		System.out.println("Engine has started");
	}
}
