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