package _02_array_list_guestbook;

public class GuestBook {
	package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList <String> guestBook = new ArrayList<String>(); 
	
	JButton addName;
	JButton viewNames;
	JPanel panel;
	JFrame frame;
	void run() {
		//Make UI
			frame = new JFrame("Guest Book");
			panel = new JPanel();
			frame.add(panel);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			
			addName = new JButton("Add Name");
			panel.add(addName);
			addName.addActionListener(this);
			
			viewNames = new JButton("View Names");
			panel.add(viewNames);
			viewNames.addActionListener(this);
			
			frame.pack();
	}
//
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addName) {
			//Ask for name + add to array list
				String name = JOptionPane.showInputDialog("What is the name to add to the guest book?");
				guestBook.add(name);
		} else {
			//Loop and display all names
				String guestBookFormated = "Guest Book:";
			 	for (int i = 0; i < guestBook.size(); i++) {
					guestBookFormated = "\n" + guestBookFormated + "Guest #" + i + ": " + guestBook.get(i) + "\n";
				}
			 	JOptionPane.showMessageDialog(null, guestBookFormated);
		}
		
	}
}

}
