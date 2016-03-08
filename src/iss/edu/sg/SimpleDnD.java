
package iss.edu.sg;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.TransferHandler;


public class SimpleDnD extends JFrame {

    JTextField field;
    JButton button;
    static String labels[] = { "A", "B", "C", "D", "E", "F", "G" };

    public SimpleDnD() {

    	   JFrame frame = new JFrame("Modifying Model");
    	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	    // Fill model
    	    final DefaultListModel model = new DefaultListModel();
    	    for (int i = 0, n = labels.length; i < n; i++) {
    	      model.addElement(labels[i]);
    	    }
    	    JList jlist = new JList(model);
    	    
    	    JScrollPane scrollPane1 = new JScrollPane(jlist);
    	    
    	   
    	   // JScrollPane scrollPane_1 = new JScrollPane(list);
    	    //jlist.setFixedCellWidth(200);
    	    //jlist.setFixedCellHeight(200);
    	    scrollPane1.setMaximumSize(new Dimension(400, 200));
    	    scrollPane1.setMinimumSize (new Dimension (200,200));
    	   
        setTitle("Simple Drag & Drop");

        setLayout(null);

        button = new JButton("Button");
        button.setBounds(200, 50, 90, 25);

        field = new JTextField();
        field.setBounds(30, 50, 150, 25);

        add(button);
        add(field);
        add(scrollPane1);
  
        field.setDragEnabled(true);
        button.setTransferHandler(new TransferHandler("text"));

        setSize(330, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        frame.add(scrollPane1, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new SimpleDnD();
    }
}