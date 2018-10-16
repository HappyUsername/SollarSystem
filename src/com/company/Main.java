package com.company;

public class Main {

    public static void main(String[] args) {
	SolarSystem ss = new SolarSystem(500, 500);

	ss.drawSolarObject(0, 0, 15, "Yellow"); // the sun
	ss.drawSolarObject(150, 180, 5, "RED"); // a planet


	ss.finishedDrawing();
    }
}
