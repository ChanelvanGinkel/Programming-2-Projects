import java.util.Scanner;

public class E6v2 {
	public static void main(String[]args) {
		System.out.println("Type anything you want!");
		Scanner sc = new Scanner (System.in);
		String words = sc.nextLine();
		int max = words.length();
//		for(int i = 0; i < max; i++) {
//			words.charAt(i);
//			if(words.charAt(i) == 'e') {
//				words.replaceAll(i, 'o');
//			}
//			System.out.println(i);
//		}
		words = words.replace('o', '}');
		words = words.replace('e', 'o');
		words = words.replace('}', 'e');
		System.out.println(words);
		System.out.println("Notice anything weird?");
	
		
	}

}
