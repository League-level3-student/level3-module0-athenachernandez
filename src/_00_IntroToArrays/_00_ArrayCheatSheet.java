package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] strings = new String[5];
		// 2. print the third element in the array
		System.out.println(strings[3]);
		// 3. set the third element to a different value
		strings[3] = "f";
		// 4. print the third element again
		System.out.println(strings[3]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "calculator";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (String string : strings) {
			System.out.println(string);
		}

		// 7. make an array of 50 integers
		int[] integers = new int[50];

		// 8. use a for loop to make every value of the integer array a random number

		Random random = new Random();
		for (int i = 0; i < integers.length; i++) {

			integers[i] = random.nextInt(51);
		}

		// 9. without printing the entire array, print only the smallest number on the
		// array

		int min = 50;
		for (int integer : integers) {
			if (integer < min) {
				min = integer;
			}
		}
		System.out.print(min);
		// 10 print the entire array to see if step 8 was correct
		for (int integer : integers) {
			System.out.println(integer);
		}
		// 11. print the largest number in the array.
		int max = 0;
		for (int integer : integers) {
			if (integer > max) {
				max = integer;
			}
		}
		System.out.println(max);

		// 12. print only the last element in the array
		System.out.println(integers[integers.length - 1]);

	}
}
