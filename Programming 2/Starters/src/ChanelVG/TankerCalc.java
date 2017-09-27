import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Class Name
public class TankerCalc {
	// controls for App
	private JFrame mainframe;
	private JLabel headerLable;
	private JLabel statusLable;
	private JPanel controlPanel;
	private JTextField tbox1;
	private JTextField tbox2;
	
	// constructor
	public TankerCalc(){
		prepareGUI();
	}
	// entry point
	public static void main(String []args) {
		TankerCalc swingTankerCalc = new TankerCalc();
		swingTankerCalc.showTextField();
	}
	//
	private void prepareGUI() {
		mainframe = new JFrame("Tanker Truck Calculator");
		mainframe.setSize(400,400);
		mainframe.setLayout(new GridLayout(3,2));
		
		headerLable = new JLabel("Welcome to the Tanker Calculator",JLabel.CENTER );
		statusLable = new JLabel("Pleas enter your data",JLabel.CENTER );
		statusLable.setSize(350,100);
		mainframe.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainframe.add(headerLable);
		mainframe.add(controlPanel);
		mainframe.add(statusLable);
		mainframe.setVisible(true);
		
		//setup labels
		//setup layout
		//add controls
	}
	//display controls
	private void showTextField() {
		
		JLabel life = new JLabel("Ounces of water consumed every day",JLabel.CENTER );
		JLabel oz = new JLabel("Number of year you plan on consuming water",JLabel.CENTER);
		tbox1 = new JTextField(10);
		tbox2 = new JTextField(10);
		tbox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showanswer();
				
			}
		});
	
		JButton submitButton = new JButton("Submit");
		submitButton.setActionCommand("Submit");
		submitButton.addActionListener(new ButtonClickListener());
		
		controlPanel.add(life);
		controlPanel.add(tbox1);
		controlPanel.add(oz);
		controlPanel.add(tbox2);
		controlPanel.add(submitButton);
		
		mainframe.setVisible(true);
		//set values for controls
		//action listener for button click
		//place controls on panels
		//set visibility
	}
	
	
	private class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			
			if(command.equals("Submit") | command.equals("return")) {
				showanswer();
			}
		}
	}
	
	private void showanswer() {
		try {
			Float age = Float.parseFloat(tbox1.getText());
			Float ozperday = Float.parseFloat(tbox2.getText());
			Float lifetimeagua = age * 365 * ozperday;
			Float trucks = lifetimeagua / (128 * 11000);
			statusLable.setText(Float.toString(trucks)+ " Tanker Trucks worth of liquid.");;
		} catch(java.lang.NumberFormatException a) {
			statusLable.setText("MUST BE A NUMBER");
		}
	}

}


// oflatt@gmail.com
//k.ragula1@gmail.com