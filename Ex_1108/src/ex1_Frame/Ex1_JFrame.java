package ex1_Frame;

import javax.swing.JFrame;

public class Ex1_JFrame extends JFrame {

	public Ex1_JFrame() {
		super("제목"); //->부모클래스의 생성자.
		setLocation(300,300);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex1_JFrame f = new Ex1_JFrame();
	}
}
