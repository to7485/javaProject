package ex6_image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex1_Image {
	public static void main(String[] args) {
		JFrame f = new JFrame("이미지");
		
		ImageIcon back = new ImageIcon("src/images/img1.png");
		JLabel jl_back = new JLabel(back);
		jl_back.setBounds(0,0,500,500);
		
		JButton btn1 = new JButton("변경");
		btn1.setBounds(20,40,106,106);
		
		ImageIcon back2 = new ImageIcon("src/images/img2.png");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jl_back.getIcon() == back) {
					jl_back.setIcon(back2);
				} else if(jl_back.getIcon() == back2) {
					jl_back.setIcon(back);
				}
				
			}
		});
		
		f.add(jl_back);
		f.add(btn1);
		
		
		
		
		
		
		
		
		
		f.setBounds(500,300,500,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
