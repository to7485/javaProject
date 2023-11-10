package ex3_JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex2_JPanel {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(null);
		JPanel p1 = new JPanel();
		p1.setBackground(Color.yellow);
		
		JButton jb1 = new JButton("위");
		jb1.setSize(70,70);
		p1.setLayout(new BorderLayout());
		p1.add("North",jb1);
		p1.add("West",new JButton("왼쪽"));
		p1.add("Center",new JButton("가운데"));
		p1.add("East",new JButton("오른쪽"));
		p1.add("South",new JButton("아래"));
		p1.setLocation(100,100);
		p1.setSize(100,300);
		
		
		f.add(p1);
		
		
		
		f.setLocation(100,100);
		f.setSize(400,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
