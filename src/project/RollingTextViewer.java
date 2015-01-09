package project;

import javax.swing.*;

import project.Char.CharController;

public class RollingTextViewer {
	private ColorDisplay d;

	public RollingTextViewer() {
		d = new ColorDisplay(1, 4, Color.BLACK, Color.GREEN);
		d.updateDisplay();
		JOptionPane.showMessageDialog(null, d);
	}

	public void setBlock(int[][] b, int pos) {
		d.setDisplay(b, 0, pos);
	}
	public void updateViewer() {

		d.updateDisplay();
	}
}
