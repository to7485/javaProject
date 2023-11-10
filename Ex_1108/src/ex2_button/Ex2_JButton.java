package ex2_button;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ex2_JButton {
	public static void main(String[] args) {
		JFrame f = new JFrame("ActionEvent 처리");
		f.setLayout(new FlowLayout());
		f.setBackground(Color.yellow);
		JButton jbtn1,jbtn2,jbtn3,jbtn4,jbtn5;
		
		jbtn1 = new JButton("입력");
		jbtn2 = new JButton("확인");
		jbtn3 = new JButton("옵션");
		jbtn4 = new JButton("메세지");
		jbtn5 = new JButton("종료");
		
		f.add(jbtn1);
		f.add(jbtn2);
		f.add(jbtn3);
		f.add(jbtn4);
		f.add(jbtn5);
		
		//버튼과 관련된 리스너
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 switch(e.getActionCommand()) {
				 case "입력":
					 String name = JOptionPane.showInputDialog(f,"이름을 입력하세요");
					 System.out.println(name);
					 break;
				 case "확인":
					 int icon = JOptionPane.showConfirmDialog(f, "확인?");
					 break;
				 case "옵션":
					 String[] option = {"검색","추가","취소"};
					 JOptionPane.showOptionDialog(f, "원하는 작업", "옵션 대화상자", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE , null, option, option[0]);
					 break;
				 case "메세지":
					 JOptionPane.showMessageDialog(f, "메세지 대화상자");
					 break;
				 }
				
			}	
		};
		
		jbtn1.addActionListener(al);
		jbtn2.addActionListener(al);
		jbtn3.addActionListener(al);
		jbtn4.addActionListener(al);
		
		jbtn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("종료합니다.");
				
			}
		});
		
		
		f.setLocation(100,100);
		f.setSize(400,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
