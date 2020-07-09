import javax.swing.JOptionPane;

public class Checkpoint {

	public static void main(String[] args) {
		String arraySize = JOptionPane.showInputDialog("Enter array size:");
		int arraySizeInt = Integer.parseInt(arraySize);
		int[] integers = new int[arraySizeInt];
		
		for (int i = 0; i < integers.length; i++) {
			String userInput = JOptionPane.showInputDialog("Enter an integer:");
			int userIntInput = Integer.parseInt(userInput);
			integers[i] = userIntInput;
		}
		
		int sum = 0;
		for (int i = 0; i < integers.length; i++) {
			sum += integers[i];
		}
		double avg = (double)sum / integers.length;
		
		JOptionPane.showMessageDialog(null, "The sum is: " + sum);
		JOptionPane.showMessageDialog(null, "The average is: " + avg);
	}
}
