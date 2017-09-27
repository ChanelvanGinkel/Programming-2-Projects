import java.util.Random;
public class RandomPrice {
	public static void main(String []args) {
		Random r = new Random();
		float n = (float) r.nextInt(1001)+1000;
		System.out.println("$" + n/100);
	}

}
