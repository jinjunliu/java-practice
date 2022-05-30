import java.util.Arrays;

public class JavaArray {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3};
		int[] b = {4, 5, 6};
		for (int i : a) {
			System.out.println(i);
		}
		for (int i : b) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(a)); // convert an array to a string
		
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		
		System.out.println(Arrays.toString(ns));
		Arrays.sort(ns);
		System.out.println(Arrays.toString(ns));
		
		String[] fruits = {"banana", "apple", "orange"};
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		
		int[][] two_d_array = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		System.out.println(Arrays.deepToString(two_d_array));
	}
}
