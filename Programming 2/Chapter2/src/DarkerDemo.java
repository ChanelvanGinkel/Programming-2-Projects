import java.awt.Color;
public class DarkerDemo {
	public static void main(String []args) {
		Color x = Color.RED;
		System.out.println(x);
		System.out.println(x.darker());
		x = x.darker();
		System.out.println(x.darker());
	}

}
