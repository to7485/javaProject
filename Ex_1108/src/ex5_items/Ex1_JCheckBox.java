package ex5_items;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//JCheckBox
//체크 박스 기능을 제공한다.

//JRadioButton
//라디오버튼 기능을 제공한다.
public class Ex1_JCheckBox {
	public static void main(String[] args) {
		
		JCheckBox jcb1,jcb2,jcb3;
		JRadioButton jrb1,jrb2,jrb3,jrb4,jrb5;
		JPanel jp1,jp2,jp3;
		JFrame f = new JFrame("체크박스와 라디오 버튼 만들기");
		
		jp1 = new JPanel();
		jcb1 = new JCheckBox("음악감상",true);
		jcb2 = new JCheckBox("등산",true);
		jcb3 = new JCheckBox("조깅");
		
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		jp2 = new JPanel();
		jrb1 = new JRadioButton("결혼",true);
		jrb2 = new JRadioButton("미혼");
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(jrb1);
		bg1.add(jrb2);
		
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		
		f.add(jp1,"North");
		f.add(jp2,"Center");
		
		jp3 = new JPanel();
		jrb3 = new JRadioButton("자가");
		jrb4 = new JRadioButton("전세");
		jrb5 = new JRadioButton("월세");
		
		ButtonGroup bg2 = new ButtonGroup();
		
		bg2.add(jrb3);
		bg2.add(jrb4);
		bg2.add(jrb5);
		
		jp3.add(jrb3);
		jp3.add(jrb4);
		jp3.add(jrb5);
		
		f.add(jp3,"South");
		
		

		//setSize와 setLocation을 합친 개념
		f.setBounds(300,200,300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		
	}
}
