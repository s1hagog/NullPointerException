import java.awt.EventQueue;
import java.awt.EventQueue;
import java.io.Console;

import javax.swing.JFrame;

public class helloWorld {

	private JFrame frame;

	/**
	 * Launch the application.
	 * Aleksandr moshak 300227832
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					helloWorld window = new helloWorld();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public helloWorld() {
		initialize();
	}
	
	public int superCoolMethod(int a, int b) {
		return a+b;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
