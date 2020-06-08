package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {

	String[] colors = { "red", "orange", "yellow", "green", "blue" };

	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun morearrayfun = new MoreArrayFun();
		morearrayfun.printArray(morearrayfun.colors);
		morearrayfun.printReverseArray(morearrayfun.colors);
		morearrayfun.printOdds(morearrayfun.colors);
		morearrayfun.printRandomOrder(morearrayfun.colors);
		
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public void printArray(String[] colors) {
		for (String color : colors) {
			System.out.println(color);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public void printReverseArray(String[] colors) {
		for (int i = colors.length-1; i > 0; i--) {
			System.out.println(colors[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public void printOdds(String[] colors) {
		for (int i = 0; i < colors.length; i+=2) {
			System.out.println(colors[i]);
		}
	}
	
	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public void printRandomOrder(String[] colors) {
		Random r = new Random();
		int randomIndex;
		String holder;
		for (int i = 0; i < colors.length; i++) {
			randomIndex = r.nextInt(colors.length);
			holder = colors[i];
			colors[i] = colors[randomIndex];
			colors[randomIndex] = holder;
			
		}
		for (String color : colors) {
			System.out.println(color);
		}
		
		
	}

}
