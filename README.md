# IB Computer Programming
### Chanel van Ginkel
Projects made in year 2 programming at Skyline High School.

## SPOTLIGHT PROJECT
### COLORING BOOK
Main Class
```markdown
code
```
Class for Drawing
```markdown
code
```
Class for Coloring
```markdown
code
```
## OTHER PROJECTS
### Roach Population Program


Class for the Button
```markdown
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
```

Class for the Roaches 
```markdown
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
```

### Tanker Truck Program
Code for Program 
```markdown
	import java.util.Scanner;

public class TankerTruck {
	public static void main(String []args) {
		float oun, yrs;
		double res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Have you ever wondered how many 11000 gallon Tanker Trucks of liquid YOU will drink in a life time? \nLet's find out! \n   How many ounces of liquid do you drink in a day?");
		oun = sc.nextFloat();
		sc.nextLine();
		System.out.println("   For how many years do you plan on consuming liquid?");
		yrs = sc.nextFloat();
		sc.nextLine();
		res = (((oun/128)*365.25)*yrs)/11000;
		System.out.println("YOU will drink "+ res + " 11,000 gallon Tanker Trucks worth of liquid in your life time!");
		
		if(res < 1) {
			System.out.println("DRINK");
			System.out.println("MORE");
			System.out.println("WATER");
			System.out.println("FOOL");
			
		} else if(res >= 1 && res < 2) {
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			
		} else if(res >= 2 && res < 3) {
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			
		} else if(res >= 3 && res < 4) {
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			
		} else if(res >= 4 && res < 5) {
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			
		} else if(res >= 5 && res < 6) {
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			System.out.println("|^^^^^^^^^^^^^^|");
			System.out.println("| KEEP TRUCKIN | 'I:.__,");
			System.out.println("|              |  I| | |._,");
			System.out.println("|_,,_,,____=======_|__...,}|");
			System.out.println("'(@)(@)''''(@)(@)**(@)  ");
			
		} else if(res >= 6) {
			System.out.println("      ~~~ HOLY ~~~");
			System.out.println("   ~~ MOTHER TRUCKER ~~");
			System.out.println("THAT'S A BOAT LOAD OF WATTER");
			System.out.println("         ** ");
			System.out.println("        ****");
			System.out.println("         ****");
			System.out.println("           **");
			System.out.println("         __||______");
			System.out.println("        |  o o o  \\");
			System.out.println("|_|_|_|_|           \\_________/  ");
			System.out.println("|_|_|_|_|   o o o o o o o     /");
			System.out.println("|    |   0   0   0   0   0   /");
			System.out.println("| ---| o o o o o o o o o o |");
			System.out.println(" \\_______________________/");
		}

	}
}

```
### Swing Control Demo Program
Code for Project
```markdown
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingControlDemo(){
      prepareGUI();
   }
   public static void main(String[] args){
      SwingControlDemo swingControlDemo = new SwingControlDemo();  
      swingControlDemo.showEventDemo();       
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        
      statusLabel.setSize(350,100);
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   private void showEventDemo(){
      headerLabel.setText("Control in action: Button"); 

      JButton okButton = new JButton("OK");
      JButton submitButton = new JButton("Submit");
      JButton cancelButton = new JButton("Cancel");

      okButton.setActionCommand("OK");
      submitButton.setActionCommand("Submit");
      cancelButton.setActionCommand("Cancel");

      okButton.addActionListener(new ButtonClickListener()); 
      submitButton.addActionListener(new ButtonClickListener()); 
      cancelButton.addActionListener(new ButtonClickListener()); 

      controlPanel.add(okButton);
      controlPanel.add(submitButton);
      controlPanel.add(cancelButton);       

      mainFrame.setVisible(true);  
   }
   private class ButtonClickListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();  
         
         if( command.equals( "OK" ))  {
            statusLabel.setText("Ok Button clicked.");
         } else if( command.equals( "Submit" ) )  {
            statusLabel.setText("Submit Button clicked."); 
         } else {
            statusLabel.setText("Cancel Button clicked.");
         }  	
      }		
   }
}
```
