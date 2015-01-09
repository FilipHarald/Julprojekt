package project;

import javax.swing.*;

import project.Char.CharController;

public class RollingTextViewer extends JFrame{
	private ColorDisplay d;
	private JFrame frame;
	public RollingTextViewer() {
		d = new ColorDisplay(1, 4, Color.BLACK, Color.MAGENTA);
		d.updateDisplay();
		frame = new JFrame("Rolling text");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.add(d);
		frame.pack();
		frame.setVisible(true);
		
	}

	public void setBlock(int[][] b, int pos) {
		d.setDisplay(b, 0, pos);
	}
	public void updateViewer() {
		d.updateDisplay();
		d.pause(100);
	}
}
