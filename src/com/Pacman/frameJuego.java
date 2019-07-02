package com.Pacman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class frameJuego extends JFrame {
	JPanel panel1, panel2;
	JButton b1, b2, b3;
	JLabel score, vidas1, vidas2, vidas3, bloque;
	Icon imgVidas;
	int puntos = 0;
	TableroJuego table = new TableroJuego();;

	
	public frameJuego(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		imgVidas = new ImageIcon(getClass().getResource("images/pac.png"));
		vidas1 = new JLabel();
		vidas1.setIcon(imgVidas);
		
		vidas2 = new JLabel();
		vidas2.setIcon(imgVidas);
		
		vidas3 = new JLabel();
		vidas3.setIcon(imgVidas);
		
		score = new JLabel("Score " + puntos);
		Font fuente = new Font(null, Font.PLAIN, 20);
		score.setForeground(Color.white);
		score.setFont(fuente);
		
		
		b1 = new JButton("Volver al menu");
		b2 = new JButton("Puasar juego");
		b3 = new JButton("Quitar vida");
		

		
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.setBackground(Color.black);
		
		panel2.add(vidas1);
		panel2.add(vidas2);
		panel2.add(vidas3);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(score);
		
		this.getContentPane().add(table, BorderLayout.CENTER);
		this.getContentPane().add(panel2, BorderLayout.SOUTH);
		this.pack();
		this.setVisible(false);
		
	}
				
		
	}
				

