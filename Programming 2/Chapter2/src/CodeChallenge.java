import java.util.Scanner;

public class CodeChallenge {
	public static void main(String []args) {
		Day d = new Day();
		float oz, yr;
		double res;
		System.out.println("What is your first name?");
		Scanner sc = new Scanner (System.in);
		String name = sc.nextLine();
		System.out.println("What is your date of birth?");
		
		System.out.println("How long would you like to live? (in years)");
		yr = sc.nextFloat();
		System.out.println("How many mouces of fluid do you consume in a day on average?");
		oz = sc.nextFloat();
	}

}
