package ex5_items;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ex3_JComboBox {
	public static void main(String[] args) {
		JFrame f = new JFrame("콤보박스 만들기");
		f.setLayout(null);
		String[] title = {"C", "비주얼베이직","JAVA","자료구조","이산수학"};
		JComboBox<String> jcb1 = new JComboBox<>(title);
		
		jcb1.setBounds(50,50,100,30);
		f.add(jcb1);
		
		jcb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb =(JComboBox<String>)e.getSource();
				System.out.println(cb.getSelectedItem());
				
			}
		});
		
		
		
		f.setBounds(300,200,300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
