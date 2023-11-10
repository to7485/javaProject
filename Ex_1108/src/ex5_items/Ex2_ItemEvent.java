package ex5_items;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex2_ItemEvent {
	public static void main(String[] args) {
		
		JRadioButton r1,r2,r3;
		
		JFrame f = new JFrame("ItemEvent 처리");
		f.setLayout(new BorderLayout());
		
		//라디오버튼 객체 생성하기
		ButtonGroup group = new ButtonGroup();
		
		r1 = new JRadioButton("선택1");
		r2 = new JRadioButton("선택2");
		r3 = new JRadioButton("선택3");
		
		//그룹에 라디오버튼 추가하기
		group.add(r1);
		group.add(r2);
		group.add(r3);

		//패널에 라디오 버튼 붙히기
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp1.add(r1);
		jp1.add(r2);
		jp1.add(r3);
		
		//패널 프레임의 가운테 붙히기
		f.add(jp1,BorderLayout.CENTER);
		
		JPanel jp2 = new JPanel(new FlowLayout());
		JLabel txt1 = new JLabel("선택할 항목 : ");
		JLabel txt2 = new JLabel();
		
		jp2.add(txt1);
		jp2.add(txt2);
		f.add(jp2,BorderLayout.SOUTH);
		
		//체크박스와 라디오버튼의 이벤트 처리를 담당하는 리스너
		ItemListener il = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(e.getSource() == r1) {
						txt2.setText("선택1");
					} else if(e.getSource() == r2) {
						txt2.setText("선택2");
					} else if(e.getSource() == r3) {
						txt2.setText("선택3");
					}
				};
				
			}
		};
		
		//라디오버튼에 만들어준 기능 붙히기
		r1.addItemListener(il);
		r2.addItemListener(il);
		r3.addItemListener(il);
		
		
		f.setBounds(300,300,300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
