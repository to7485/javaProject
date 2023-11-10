package ex5_items;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

//JTable클래스는 데이터를 테이블 형태인 행과 열로 나타내고자 할 때 사용한다.
//JTable클래스로 나타는 테이블에서 행은 마우스를 이용하여 경계선을 조정하고
//위치를 바꿀 수 있다.
public class Ex5_JTable {
	public static void main(String[] args) {
		JFrame f = new JFrame("테이블 만들기");
		f.setLayout(new BorderLayout());
		
		String[] title = {"사번","성명","부서"};
		String[][] data = {{"1","홍길동","총무과"},{"2","김말숙","인사과"},{"3","최춘식","전산과"}};
		
		JTable table = new JTable(data,title);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane js = new JScrollPane(table,v,h);
		
		f.add(js);
		
		
		
		f.setBounds(300,200,300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
