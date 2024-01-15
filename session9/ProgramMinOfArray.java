package core_programs;

public class ProgramMinOfArray {
	public static void main(String[] args) {
		int[] arr  = {10,14,11,9,4,45,98};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
	}
		
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
	}
		System.out.println(" ");
		System.out.println("Addition of the array ; "+ total);
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
			min = arr[i];
	}
			}
		System.out.println("Minimum of the array ; "+ min);
}
}
