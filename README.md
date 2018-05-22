# Programming-2-Projects

Projects made in year 2 programming at Skyline High School.

## SPOTLIGHT PROJECT
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
Code for program 
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

