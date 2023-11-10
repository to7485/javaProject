package ex2_button;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//JButton은 클릭 기능을 제공한다.
//JButton클래스는 문자열 또는 아이콘을 사용하여 버튼을 생성할 수 있으며
//AbstractButton클래스로부터 상속받는다.
public class Ex1_JButton {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JButton jbtn1,jbtn2,jbtn3;
		
		jbtn1 = new JButton("1");
		jbtn2 = new JButton("2");
		jbtn3 = new JButton("3");
		
		f.setLayout(new FlowLayout());
		f.add(jbtn1);
		f.add(jbtn2);
		f.add(jbtn3);
		
		
		f.setLocation(100,200);
		f.setSize(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
