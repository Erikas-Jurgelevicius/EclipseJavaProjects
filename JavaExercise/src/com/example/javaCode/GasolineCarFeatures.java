package com.example.javaCode;

public interface GasolineCarFeatures {

	public static void turboBoost() {
		System.out.println("Turbo boost is activated");
	};
	
	public default void openRoof() {
		System.out.println("Vechicle roof is now open");
	}
}
