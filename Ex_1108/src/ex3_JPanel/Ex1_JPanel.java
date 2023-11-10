package ex3_JPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//JPanel은 JFrame에 붙히는 중간 컨테이너 역할을 한다.
//화면이 복잡한 형태인 경우 요소를 그룹별로 묶어서 표현할 수 있는데
//이러한 경우 JPanel에다 묶어서 JFrame에다 붙힐 수 있다.
public class Ex1_JPanel {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		//배치관리자
		//FlowLayout : 왼쪽에서 오른쪽으로 배치, 오른쪽에 공간이 더이상 없으면 아래로 배치
		//BorderLayout : 동,서,남,북,중앙 5개의 영역으로 나뉜다.
		//GridLayout : 2차원 표 모양으로서 n X n으로 설정되어 왼쪽에서 오른쪽 위에서 아래 순으로 배치
		//CardLayout : 컴포넌트를 포개어 배치
		//Null : 레이아웃을 쓰지 않고 각 컴포넌트마다 수동으로 위치를 설정
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.YELLOW);
		//p1.setLayout(new FlowLayout());
		//p1.setLayout(new GridLayout(3,2));
		

		p1.add(new JButton("1"));
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p1.add(new JButton("4"));
		p1.add(new JButton("5"));
	
		f.add(p1);
		
		f.setLocation(100,100);
		f.setSize(400,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
