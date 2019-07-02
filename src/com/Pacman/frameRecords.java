package com.Pacman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class frameRecords extends JFrame {
	JPanel panel;
	JLabel nombre, puntos, titulo;
	
	
	public frameRecords(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(800,600));
		this.setLayout(new BorderLayout());
		
		
		panel = new JPanel();
		panel.setBackground(Color.black);
		nombre = new JLabel("NOMBRE");
		puntos = new JLabel("PUNTOS");
		titulo = new JLabel("TOP 5 DE LOS MEJORES JUGADORES");
		titulo.setBackground(Color.yellow);
		titulo.setForeground(Color.white);
		Font fuente = new Font(null, Font.PLAIN, 20);
		titulo.setFont(fuente);
		
		panel.add(titulo, BorderLayout.PAGE_START);
		
		this.add(panel, BorderLayout.CENTER);
		this.setVisible(false);
		this.pack();
		
	}
}
