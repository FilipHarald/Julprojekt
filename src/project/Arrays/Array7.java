package project.Arrays;

public class Array7 {
	private int [] arr7;
	
	public Array7(){
		arr7 = new int[7];
		
	}
	
	public void setElement(int pos, int value){
		arr7[pos] = value;
	}
	
	public int getElement(int row){
		return arr7[row];
	}
	
	public void setArray(int[] anArray){
		for(int i = 0; i < 7; i++){
			setElement(i, anArray[i]);
		}
	}
	
	public int[] getArray(){
		return arr7;
	}

}
