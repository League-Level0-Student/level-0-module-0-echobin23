import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {
	public static void main(String[] args) throws Exception {
		String color =JOptionPane.showInputDialog("What is your favorite color");
		JOptionPane.showMessageDialog(null,color+ " That is my favorite color too");
		
		
		Robot jake = new Robot();
		jake.penDown();
		jake.setSpeed(10);
		for (int i = 0; i < 3; i++) {
			jake.turn(60);
			jake.move(20);
			jake.turn(60);
			
			
		}
		 
	}
}
