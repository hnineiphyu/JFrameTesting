package iss.edu.sg;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class MyJList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame= new JFrame("JList Test");
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] selections = {"yellow","greeen","red","blue"};
		JList list= new JList(selections);
		list.setSelectedIndex(1);
		System.out.println(list.getSelectedValue());
		frame.add(new JScrollPane(list));
		frame.pack();
		frame.setVisible(true);

	}

}
