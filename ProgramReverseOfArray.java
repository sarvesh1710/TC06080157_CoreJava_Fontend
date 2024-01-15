package core_programs;

import java.util.Arrays;

public class ProgramReverseOfArray{
	public static void printarray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
	}
	}
	
	public static int[] reverse(int[] array) {
		int[] result = new int[array.length];
		for(int i=0,j=result.length-1;i<array.length;i++,j--) {
			result[j] = array[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {23,54,7,45,76,98,34};
		printarray(arr);
		System.out.println(" ");
		printarray(reverse(arr));
		System.out.println(" ");
		Arrays.sort(arr);
		printarray(arr);
		
	}
}
	


