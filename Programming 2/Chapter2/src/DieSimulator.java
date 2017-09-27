import java.util.Random;

public class DieSimulator {
	public static void main(String []args) {
		Random r = new Random();
		int n = r.nextInt(6)+1;
		System.out.println(n);
		
	}

}
