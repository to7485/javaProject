package ex3_JPanel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex3_JPanel {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setLayout(null);
		JPanel p1 = new JPanel();
		p1.setBackground(Color.yellow);
		p1.setLayout(null);
		
		p1.setBounds(0,0,400,250);
		
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		
		jb1.setBounds(30,30,30,30);
		jb2.setBounds(110,60,70,70);
		jb3.setBounds(190,90,70,70);
		jb4.setBounds(270,120,70,70);
		
		
		p1.add(jb1);
		p1.add(jb2);
		p1.add(jb3);
		p1.add(jb4);
		
		JPanel p2 = new JPanel();
		p2.setBounds(0,250,400,250);
		p2.setBackground(Color.CYAN);

		f.add(p1);
		f.add(p2);
		
		f.setLocation(100, 100);
		f.setSize(400, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
