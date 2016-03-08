package iss.edu.sg;
import javax.swing.JList;

public class JlistLocatio {

	


	  public static void main(String[] argv) throws Exception {
	    String[] items = { "A", "B", "C", "D" };
	    JList list = new JList(items);

	    // Set the item width
	    int cellWidth = 200;
	    list.setFixedCellWidth(cellWidth);

	    // Set the item height
	    int cellHeight = 18;
	    list.setFixedCellHeight(cellHeight);

	  }
}
	