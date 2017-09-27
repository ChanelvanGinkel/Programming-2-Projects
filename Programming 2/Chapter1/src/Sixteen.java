import javax.swing.JOptionPane;
public class Sixteen {
	public static void main(String []args) {
		String name = JOptionPane.showInputDialog("What is your name");
		System.out.println("Hello," + name + "! \n My name is Hal! What would you like me to do?");
		String quest = JOptionPane.showInputDialog("My name is Hal! \nWhat would you like me to do?");
		System.out.println(quest);
		System.out.println("I am sorry, " + name + " I am afraid I can not do that" );
		JOptionPane.showInputDialog("I am sorry, " + name + " I am afariad I can not do that");
	}


}
