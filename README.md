# Programming-2-Projects

Projects made in year 2 programming at Skyline High School.

## SPOTLIGHT PROJECT
### Roach Population Project
'''
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonViewer {
	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_HEIGHT = 60;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Birth of a Roach");
		frame.add(button);

		ActionListener listener = new RoachPop();
		button.addActionListener(listener);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
'''

'''
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoachPop implements ActionListener {
	int n;
	public RoachPop() {
		n = 0;
		System.out.println("One roach will be represnted by 'x'");
	}
	
	public void actionPerformed(ActionEvent event) {
		n += 1;
		int i = 0;
		while(i<Math.pow(n,2)) {
			i+=1;
			System.out.print("x");
		}
		System.out.println(" ");

	}

}
'''

