package project;

import javax.swing.JOptionPane;

public class CharController {

	public CharController() {

	}

	public static void main(String args[]){
		Char cLibrary = new Char();

		String c = JOptionPane.showInputDialog("Mata in ett tecken");
		
		c = c.toUpperCase();
		int hej = c.length();
		System.out.println(hej);
		int[][] arr = new int[7][7];
		
		for (int i = 0; i < c.length(); i++) {
			char chr = c.charAt(i);
			System.out.println("runda"+i+"   Svar: "+chr);
			
			switch(chr){
			case 'HÄR SKA SYMBOLEN VARA' : arr = cLibrary.charA;	//charA funktionen som symbolen finns på i Char
			break;
			
			case '' : arr = cLibrary.char;
			break;
			
			case '' : arr = cLibrary.char;
			break;
			
			case '' : arr = cLibrary.char;
			break;
			
			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;

			case '' : arr = cLibrary.char;
			break;
			
			}
			
			
			try {
			    Thread.sleep(20);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			CharTester tester = new CharTester(arr);
			if(i == 2){
				System.out.print("HÄR");
			}
		}
	}
}
