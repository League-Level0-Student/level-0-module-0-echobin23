import javax.swing.JOptionPane;

public class Greeter {
	
	 public static void main(String[] args) throws Exception {
		 
	String name = JOptionPane.showInputDialog("What is your name");
		 JOptionPane.showMessageDialog(null, "hi "+name);

}
}
