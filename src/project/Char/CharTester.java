package project.Char;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CharTester extends JFrame {
	// private Char cLibrary;
	private int[][] chrArray;

	public CharTester(int[][] chrArray) {
		this.chrArray = chrArray;

		setTitle("CharTester");
		setSize(360, 380);
		setBackground(java.awt.Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
//		repaint();
	}

	public void paint(Graphics g) {
		for (int y = 0; y < 7; y++) {
			for (int x = 0; x < 7; x++) {
				if (this.chrArray[y][x] == -16711936) {
					g.setColor(Color.GREEN);
				} else {
					g.setColor(Color.LIGHT_GRAY);
				}
				g.fillRect((x * 50 + 10), (y * 50 + 30), 40, 40);
			}
		}

	}
}
