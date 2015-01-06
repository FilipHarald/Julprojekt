package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TestArrayViewer extends JPanel implements ActionListener {
	private JPanel inputRowPanel;
	private JPanel inputColPanel;
	private JPanel commandPanel;
	private JPanel arrayPanel;
	private JPanel southPanel;
	
	private JButton readRow, writeRow, inputRowNbr, readCol, writeCol,
			inputColNbr;

	private JTextField[] arrCol;
	private JTextField[] arrRow;
	
	private Controller controller;

	public TestArrayViewer(Controller c) {
		controller = c;
		

		arrCol = new JTextField[7];
		arrRow = new JTextField[7];
		
		southPanel = new JPanel();
		inputRowPanel = new JPanel();
		southPanel.add(inputRowPanel, BorderLayout.CENTER);
		inputColPanel = new JPanel();
		commandPanel = new JPanel();
		arrayPanel = new JPanel();
		

		readRow = new JButton("Läs rad");
		writeRow = new JButton("Skriv rad");
		inputRowNbr = new JButton("Input rad nr");
		readCol = new JButton("Läs kol");
		writeCol = new JButton("Skriv kol");
		inputColNbr = new JButton("Input kol nr");

		JFrame frame = new JFrame("Testning");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		commandPanel.setLayout(new GridLayout(6, 1));
		inputRowPanel.setLayout(new GridLayout(1, 7));
		inputColPanel.setLayout(new GridLayout(7, 1));
		arrayPanel.setLayout(new GridLayout(7, 7));

		frame.add(southPanel, BorderLayout.SOUTH);
		frame.add(inputColPanel, BorderLayout.WEST);
		frame.add(commandPanel, BorderLayout.EAST);
		frame.add(arrayPanel, BorderLayout.CENTER);

		// fylla inputRowPanel
		for (int i = 0; i < 7; i++) {
			arrRow[i] = new JTextField();
			inputRowPanel.add(arrRow[i]);
		}
		// fylla inputColPanel
		for (int i = 0; i < 7; i++) {
			arrCol[i] = new JTextField();
			inputColPanel.add(arrCol[i]);
		}
		// fylla arrayPanel
		JTextArea temp;
//		for (int i = 0; i < 7; i++) {
//			for(int k = 0; k < 7; k++){
//				temp = new JTextArea("" + arr7x7.getElement(i, k));
//				arrayPanel.add(temp);			
//			}
//		}
		
		commandPanel.add(readRow);
		commandPanel.add(writeRow);
		commandPanel.add(inputRowNbr);
		commandPanel.add(readCol);
		commandPanel.add(writeCol);
		commandPanel.add(inputColNbr);
		
		readRow.addActionListener( this );
		writeRow.addActionListener(this);
		inputRowNbr.addActionListener(this);
		readCol.addActionListener(this);
		writeCol.addActionListener(this);
		inputColNbr.addActionListener(this);
		
		commandPanel.setPreferredSize(new Dimension(70, 200));
		inputRowPanel.setPreferredSize(new Dimension(490, 70));
		inputColPanel.setPreferredSize(new Dimension(70, 200));
		arrayPanel.setPreferredSize(new Dimension(500, 500));
		frame.pack();
		frame.setVisible(true);
	}
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == readRow){
				int temp[] = new int[7];
				for(int i=0; i < 7; i++){
					temp[i] = Integer.parseInt(arrRow[i].getText());
				}
				controller.setRow(temp);
			}
			if(e.getSource() == writeRow){
				
			}
			if(e.getSource() == inputRowNbr){
				
			}
			if(e.getSource() == readCol){
				int temp[] = new int[7];
				for(int i=0; i < 7; i++){
					temp[i] = Integer.parseInt(arrCol[i].getText());
				}
				controller.setCol(temp);
			}
			if(e.getSource() == writeCol){
				
			}
			if(e.getSource() == inputColNbr){
				
			}
			
		
		
	}

//	public static void main(String[] args) {
//		TestArrayViewer lol = new TestArrayViewer();
//		 int[][] array = new int[][]{
//		 { 0, 0, 0, 0, 0, 1, 0 },
//		 { 0, 0, 0, 0, 0, 0, 0 },
//		 { 0, 1, 0, 0, 0, 1, 0 },
//		 { 0, 0, 1, 0, 0, 1, 0 },
//		 { 0, 1, 1, 0, 1, 1, 1 },
//		 { 0, 0, 1, 0, 1, 0, 0 },
//		 { 1, 0, 1, 0, 0, 1, 0 }
//		 };
//	
//
//		
//	}
}
