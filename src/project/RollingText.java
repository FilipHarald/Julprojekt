package project;

import javax.swing.*;


public class RollingText{

	public RollingText() {
		ColorDisplay cd = new ColorDisplay(1, 4, Color.BLACK, Color.RED);
		JOptionPane.showMessageDialog(null,cd);
	}
	
	public static void main(String[] args) {
		RollingText lol = new RollingText();
	}
}
