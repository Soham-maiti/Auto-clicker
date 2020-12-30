package main;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManeger implements KeyListener {
	
	private static Auto_Clicker ac = new Auto_Clicker();

	//@Override
	public void keyPressed(KeyEvent event) {
		if (event.getKeyCode() == KeyEvent.VK_Q) {
			for (int i = 0; i < 100; i++) {
				ac.ClickMouse(InputEvent.BUTTON1_DOWN_MASK);
			}
		} else {
			event.consume();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

}
