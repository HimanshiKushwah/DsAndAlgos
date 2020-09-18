// Recursion(Question is in downloads TataCliq.jpg)
package LeetCodeChallenge;
import java.util.Scanner;
class Tower {

	private static int maxPower(int[] arr, int[] pw, int index) {

		if (index == arr.length) return 0;
		if (index == arr.length - 1) {
			return pw[index];
		}

		if (arr[index] == arr[index + 1]) {
			// if we are including the element
			// at index

			int temp1 = pw[index];
			temp1 += maxPower(arr, pw, index + 2);

			int temp2 = maxPower(arr, pw, index + 1);

			return Math.max(temp1, temp2);
		}

		else {
			return pw[index] + maxPower(arr, pw, index + 1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the test cases");
		int t = sc.nextInt();
		while (t -- > 0) {
			System.out.println("Enter the size of an array");
			int size = sc.nextInt();

			int[] arr = new int[size];
			int[] pw = new int[size];
			
			System.out.println("Enter the Elements");
			for (int i = 0; i < size; ++i) {
				arr[i] = sc.nextInt();
			}

			for (int i = 0; i < size; ++i) {
				pw[i] = sc.nextInt();
			}

			System.out.println(maxPower(arr, pw, 0));



		}
	}
}