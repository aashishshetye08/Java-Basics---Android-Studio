package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingEg {

	public static void main(String[] args) {

		JFrame f = new JFrame("MY GUI");	//In "__", the string will be shown on the title bar of the layout
		f.setSize(100,200);
		
		JLabel l = new JLabel("Hello World..! \n");
		JTextField tf = new JTextField("TextField.");
		
		JButton b1 = new JButton ("Button1");
		JButton b2 = new JButton ("Button2");
		JButton b3 = new JButton ("Button3");
		
		JPanel p = new JPanel();
		
		p.add(l);
		p.add(tf);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
//		Ading panel to frame
		f.add(p);
		
		f.show();
	}

}
