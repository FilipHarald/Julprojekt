package project;

import javax.swing.JOptionPane;

import project.Arrays.Array7;
import project.Arrays.Array7x7;
import project.Char.Char;
import project.Char.CharController;

public class RollingTextApplication {

	public static void main(String args[]) {

		String s = JOptionPane
				.showInputDialog("Vilken text vill du ska rulla?");
		CharController c = new CharController(s);
		Array7x7[] characterArray = c.getCharacterArray();

		RollingTextViewer theWindow = new RollingTextViewer();

		Array7x7[] theBlocks = new Array7x7[4];

		for (int i = 0; i < 4; i++) {
			theBlocks[i] = new Array7x7(new int[][]{
				{Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK},
				{Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK},
				{Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK},
				{Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK},
				{Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK},
				{Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK},
				{Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK}});
		}

		while(true) {
			for (int i = 0; i < characterArray.length; i++) {
				for (int k = 0; k < 7; k++) {

					Array7 nextArr7 = characterArray[i].getCol(k);

					theBlocks[0].moveLeft(theBlocks[1].moveLeft(theBlocks[2]
							.moveLeft(theBlocks[3].moveLeft(nextArr7))));

					for (int blockNbr = 0; blockNbr < 4; blockNbr++) {
						theWindow.setBlock(theBlocks[blockNbr].getArray(),
								blockNbr);
					}
					theWindow.updateViewer();

				}

			}

		}

	}
}
