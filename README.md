# IB Computer Programming
### Chanel van Ginkel
Projects made in year 2 programming at Skyline High School.

## SPOTLIGHT PROJECT
### 10 HOUR PROJECT: ASCII Art CHARADES
Planning Process 
```markdown
10 Hour Programming Project Plan

Phase 1: Brainstorming and formulating an Idea (1 hour )
Tic tac toe
Ascii Art Charades
Hangman
Converter of some sorts
Expand more on “IA” project

Phase 2: Choose two Ideas and expand on each of them more (2 hours)
Ascii Art Charades:  teams play charades with ascii art.  One person from each team is picked to be the artist and then the person from the first team is given a random subject matter to depict with ascii art in under 2 minutes.  After the two minutes is up the drawing is shown to the rest of team one and they are given 30 seconds to guess the correct answer. If they get it right they get a point if not the other team gets a point.
Tic Tac Toe:  A classic game of Tic Tac Toe with two players going against each other one as “X” one as “O” on the standard grid. They may play multiple times and at the end who ever won the most rounds is named the winner 

Phase 3: Choose one of the two ideas and write pseudo code (2 hours)
Chosen one: Ascii Art Charades

Phase 4: Code (5 hours)

```
Code
```markdown
// Pictionary or Ascii art charades game
import java.util.Scanner;
import java.util.Random;


public class AsciiArtCharades {
	public static void main(string[] args){
		Scanner sc = new  Scanner(System.im);
		String[] array = new String[] {"cat","monkey","toothbrush","soap","rainbow","window","fish","cup", "bed", "clock", };

		int team1, team2, team3, team4;
		int score1, score2, score3, score4;
		String tName1, tName2, tName3, tName4;
		System.out.println("Welcome to Ascii Art Charades \n Would you like to learn how to play? (y/n)");
		sc = sc.nextLine;
		if( sc == 'y'){
			Sytem.out.println("To play this game you will need at least 2 teams and no more than 4 \n Each team will select a name for themselve and then the game will begin \n Team 1 will be asked to select one person to be their artist for this round \n the artist will then be givin a random subject matter to depict with ascii art in two minutes \n After the two minutes are up the rest of team one will be able to see what the artist has made and will be given 30 seconds to guess what it is \n If team one guess correctly they earn a point, if not team two earns a point \n The game continues with this same process for team two. \n there will be 5 rounds for each team.");	
		}
		System.out.println("How many teams are playing? (At least two and no more than 4)" );
		sc = sc.nextLine;
		if(sc == 2) {
			System.out.println("Team One Name: ");
			tName1 = sc.nextLine;
			System.out.println("Team Two Name: ");
			tName2 = sc.nextLine;

		} else if(sc == 3){
			System.out.println("Team One Name: ");
			tName1 = sc.nextLine;
			System.out.println("Team Two Name: ");
			tName2 = sc.nextLine;
			System.out.println("Team Three Name: ");
			tName3 = sc.nextLine;

		} else {
			System.out.println("Team One Name: ");
			tName1 = sc.nextLine;
			System.out.println("Team Two Name: ");
			tName2 = sc.nextLine;
			System.out.println("Team Three Name: ");
			tName3 = sc.nextLine;
			System.out.println("Team Four Name: ");
			tName4 = sc.nextLine;

		}
		System.out.println("Let the game begin! " );
		for(int i = o; i < 5; i++){
			score1 = 0;
			System.out.println(tName1 + " choose your artist for this round.\n Your subject matter is... (press 'n' to continue)");
			sc = sc.nextLine;
			if(sc == "n"){
				String sub = rand.array(10);
				System.out.println("Time to draw, " + sub);
				String ascii = sc.nextString;
				System.out.println("Time to guess! " + tName1 + "take a look and the enter your guess."); 
				String guess = sc.nextString;
				if (guess == sub) {

					score1++;
				}else {

					score2++;
				}
				System.out.println("Next Round!");
			}
			score2 = 0;
			System.out.println(tName2 + " choose your artist for this round.\n Your subject matter is... (press 'n' to continue)");
			sc = sc.nextLine;
			if(sc == "n"){
				String sub = rand.array(10);
				System.out.println("Time to draw, " + sub);
				String ascii = sc.nextString;
				System.out.println("Time to guess! " + tName2 + "take a look and the enter your guess."); 
				String guess = sc.nextString;
				if (guess == sub) {

					score2++;
				}else {

					score1++;
				}
				System.out.println("Next Round!");


			}
			
		}
		
	}
	
}
```
## OTHER PROJECTS
### Roach Population Program
#### Simulates the growth of a population of cockroaches 


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
#### Simulates how many tanker trucks you would need to carry the estimated amout of liquid you consume in your lifetime
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
