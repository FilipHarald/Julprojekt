package project.Arrays;

public class Array7 {
	private int[] arr7;

	/**
	 * Skapar en tom vektor
	 */

	public Array7() {
		arr7 = new int[7];
	}

	/**
	 * Sätter elementet i vektorn arr7 till värdet value på position pos
	 * 
	 * @param pos
	 * @param value
	 */

	public void setElement(int pos, int value) {
		arr7[pos] = value;
	}

	/**
	 * @param pos
	 * @return elementet på position pos
	 */

	public int getElement(int pos) {
		return arr7[pos];
	}

	/**
	 * Sätter hela vektorn arr7 till anArray
	 * 
	 * @param anArray
	 */

	public void setArray(int[] anArray) {
		for (int i = 0; i < 7; i++) {
			setElement(i, anArray[i]);
		}
	}

	/**
	 * @return hela vektorn arr7
	 */

	public int[] getArray() {
		return arr7;
	}

}
