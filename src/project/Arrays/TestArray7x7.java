package project.Arrays;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.*;

public class TestArray7x7 extends JPanel implements ActionListener{
	
	private JFrame frame;
	private JPanel colLeftPanel, colRightPanel, arrayPanel, commandPanel;
	private JButton moveLeftButton, moveRightButton;
	private JTextField[] colLeft, colRight, visualArray;
	
	private Array7x7 arr7x7;
	
	public TestArray7x7(){
		
		arr7x7 = new Array7x7();
		
		colLeftPanel = new JPanel();
		colRightPanel = new JPanel();
		arrayPanel = new JPanel();
		commandPanel = new JPanel();
		
		moveLeftButton = new JButton("moveLeft");
		moveRightButton = new JButton("moveRight");
		
		colLeft = new JTextField[7];
		colRight = new JTextField[7];
		visualArray = new JTextField[49];

		
		frame = new JFrame("Testning");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		colLeftPanel.setLayout(new GridLayout(7, 1));
		colRightPanel.setLayout(new GridLayout(7, 1));
		arrayPanel.setLayout(new GridLayout(7, 7));
		
		frame.add(colLeftPanel, BorderLayout.WEST);
		frame.add(colRightPanel, BorderLayout.EAST);
		frame.add(arrayPanel, BorderLayout.CENTER);
		frame.add(commandPanel, BorderLayout.SOUTH);
		
		// fylla colLeftPanel
		for (int i = 0; i < 7; i++) {
			colLeft[i] = new JTextField();
			colLeft[i].setBackground(Color.RED);
			colLeftPanel.add(colLeft[i]);
		}
		// fylla colRightPanel
		for (int i = 0; i < 7; i++) {
			colRight[i] = new JTextField();
			colRight[i].setBackground(Color.RED);
			colRightPanel.add(colRight[i]);
		}

		// fylla arrayPanel
		int counter = 0;
		for(int i = 0; i < 7; i++){
			for(int k = 0; k < 7; k++){
				visualArray[counter] = new JTextField();
				arrayPanel.add(visualArray[counter]);
			visualArray[counter].setText("" + arr7x7.getElement(i, k));
			counter++; 
			}
		}
		
		commandPanel.add(moveRightButton);
		commandPanel.add(moveLeftButton);
		
		moveLeftButton.addActionListener(this);
		moveRightButton.addActionListener(this);
		
		
		colLeftPanel.setPreferredSize(new Dimension(70, 70));
		colRightPanel.setPreferredSize(new Dimension(70, 70));
		arrayPanel.setPreferredSize(new Dimension(200, 200));
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == moveLeftButton){
			//läser in från höger
			Array7 temp = new Array7();
			for(int i = 0; i < 7; i++){
				temp.setElement(i, Integer.parseInt(colRight[i].getText()));
			}
			//flyttar vänster, out ska skrivas i vänster col
			Array7 out = arr7x7.moveLeft(temp);
			
			//skriver på vänster col
			for(int i = 0; i < 7; i++){
				colLeft[i].setText("" + out.getElement(i));
			}
			
			//skriver på Arrayen
			int counter = 0;
			for(int i = 0; i < 7; i++){
				for(int k = 0; k < 7; k++){
					visualArray[counter].setText("" + arr7x7.getElement(i, k));
					counter++;
				}
			}
			frame.repaint();
			
			
		}
		
		if(e.getSource() == moveRightButton){
			Array7 temp = new Array7();
			//läser in från vänster col
			for(int i = 0; i < 7; i++){
				temp.setElement(i, Integer.parseInt(colLeft[i].getText()));
			}
			
			//flyttar höger, out ska skrivas i höger col
			Array7 out = arr7x7.moveRight(temp);
			
			//skriver på höger col
			for(int i = 0; i < 7; i++){
				colRight[i].setText("" + out.getElement(i));
			}
			
			//skriver på Arrayen
			int counter = 0;
			for(int i = 0; i < 7; i++){
				for(int k = 0; k < 7; k++){
				visualArray[counter].setText("" + arr7x7.getElement(i, k));
				counter++; 
				}
			}
			frame.repaint();
		}
		
		
	}
	
	public static void main(String[] args) {
		TestArray7x7 lol = new TestArray7x7();
	}
	

}
