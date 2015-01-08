package project;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CharTester extends JFrame {
//	private Char cLibrary;
	private int[][] chrArray;

	public CharTester(int[][] chrArray) {
		this.chrArray = chrArray;

		setTitle("CharTester");
		setSize(360, 380);
		setBackground(java.awt.Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {

		for (int y = 0; y < 7; y++) {
			for (int x = 0; x < 7; x++) {
				if (this.chrArray[y][x] == 1) {
					g.setColor(Color.BLACK);
				} else {
					g.setColor(Color.LIGHT_GRAY);
				}
				g.fillRect((x * 50 + 10), (y * 50 + 30), 40, 40);
			}
		}
	}

	public static void main(String args[]) {
		Char cLibrary = new Char();  
		String c = JOptionPane.showInputDialog("Mata in ett tecken");
		c = c.toUpperCase();
		char chr = c.charAt(0);

		
		int[][] arr = new int[7][7];

		if (chr == 'A') {
			arr = cLibrary.charA; 
		}
		if (chr == 'B') {
			arr = cLibrary.charB;
		}
		if (chr == 'C') {
			arr = cLibrary.charC;
		}
		if (chr == 'D') {
			arr = cLibrary.charD;
		}
		if (chr == 'E') {
			arr = cLibrary.charE;
		}
		if (chr == 'F') {
			arr = cLibrary.charF;
		}

		CharTester tester = new CharTester(arr);
	}
}
