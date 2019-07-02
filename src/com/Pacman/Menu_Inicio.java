package com.Pacman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu_Inicio extends JFrame {
	
	JPanel panel1, panel2;
	JButton b1, b2, b3, b4;
	JLabel titulo;
	JLabel img;
	Icon   fondo;
	frameJuego juego = new frameJuego("Pacman");
	frameRecords records = new frameRecords("RANKING");
	
	
	public Menu_Inicio(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		
		
		//EL PANEL 1 VA A CONTENER UNA ETIQUETA QUE TIENE COMO REFERENCIA UNA IMAGEN
		
		panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(800, 600));
		fondo = new ImageIcon(getClass().getResource("images/Menu inicio.gif"));
		img = new JLabel();
		img.setIcon(fondo);
		
		//EL PANEL 2 CONTIENE LOS BOTONES
		panel2 = new JPanel();
		panel2.setBackground(Color.black);
		b1 = new JButton("Iniciar Juego");
		b1.setBackground(Color.yellow);
		b2 = new JButton("Records");
		b2.setBackground(Color.red);
		b3 = new JButton("Multijugador");
		b3.setBackground(Color.cyan);
		b4 = new JButton("Salir del juego");
		b4.setBackground(Color.magenta);
		//SE AGREGAN LOS ELEMENTOS AL PANEL
		panel1.add(img);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		
		//SE CREA EL MANEJADOR DE EVENTOS PARA LOS BOTONES
		
		botonesHandler handler = new botonesHandler();
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		
		this.getContentPane().add(panel1, BorderLayout.CENTER);
		this.getContentPane().add(panel2, BorderLayout.SOUTH);
		
		
		this.setVisible(true);
		this.pack();
		
	}
	
	public class botonesHandler implements ActionListener{

		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(b1)) {
				juego.setVisible(true);
			}
			
			if(e.getSource().equals(b2)) {
				records.setVisible(true);
			}
			
		}
		
	}
}