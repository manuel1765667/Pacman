package com.Pacman;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TableroJuego extends JPanel{

	int[][] distribucionBloques = new int[20][10];
	JLabel[][] bloques;
	ImageIcon  iconoBloque1;
	ImageIcon  iconoBloque2;
	JPanel panel;

	public TableroJuego() {

		this.setSize(new Dimension(1200, 600));
		this.setBackground(Color.black);
		this.setPreferredSize(getSize());

		panel = new JPanel();
		panel.setLayout(new GridLayout(10,20));

		int distribucionBloques[][] = {
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				{1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
				{1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1},
				{1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
				{1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1},
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};



		bloques = new JLabel[20][10];
		iconoBloque1 = new ImageIcon(getClass().getResource("images/1.png"));
		iconoBloque2 = new ImageIcon(getClass().getResource("images/2.png"));		

		for(int i = 0; i < bloques.length; i++) {
			for(int j = 0; j < bloques[0].length; j++) {
				    bloques[i][j] = new JLabel(iconoBloque1);
					panel.add(bloques[i][j]);
			}
			}
		

		this.add(panel);



	}
	

}
