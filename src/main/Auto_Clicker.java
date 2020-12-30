package main;

import java.awt.Robot;

public class Auto_Clicker {
	
	private static Robot robot;
	private int delay;

	public Auto_Clicker() {
		try {
			robot = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Default value
		delay = 10;
	}

	public void ClickMouse(int button) {
		try {
			robot.mousePress(button);
			robot.delay(delay);
			robot.mouseRelease(button);
			robot.delay(delay);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}