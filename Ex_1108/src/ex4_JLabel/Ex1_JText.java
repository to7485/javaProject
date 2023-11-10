package ex4_JLabel;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

//JLabel
//정보 또는 텍스트를 위한 라벨
//문자열이나 아니콘을 사용하여 객체를 생성한다.

//JTextField
//한 줄의 문자열을 입력할 수 있는 컴포넌트입니다.

//JTextArea
//여러줄의 문자열을 입력할 수 있는 컴포넌트
//창의 크기보다 많은 문자열을 입력하더라도 자동으로 스크롤바가 생기지 않는다.
//따라서 스크롤바 기능을 사용하기 위해서는 JScrollPane클래스를 사용해야 한다.

//JPasswordField
//비밀번호와 같이 입력받은 글자를 보여주지 않아야 할 때 사용하는 컴포넌트이다.
public class Ex1_JText {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		JLabel lb1 = new JLabel("이름");
		JLabel lb2 = new JLabel("나이");
		JLabel lb3 = new JLabel("비밀번호");
		
		JTextField tf = new JTextField(20);
		JTextArea ta = new JTextArea(7,20);
		JPasswordField pf = new JPasswordField(20);
		ta.setBorder(new LineBorder(Color.BLACK));
		f.add(lb1);
		f.add(tf);
		f.add(lb2);
		f.add(ta);
		f.add(lb3);
		f.add(pf);
		
		f.setBounds(400,400,300,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}







