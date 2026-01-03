package test;

public class ReverseArray {
	public static void reverse(int []arr) {
		int i = 0;
		int j = arr.length-1;
		int temp;
		while(i<j) {
			  temp = arr[i];
			arr[i] = arr[j]; 
			arr[j] = temp;
			i++;
			j--;
		}
		
	}
	public static void main(String[]args) {
		int arr[] = {5,4,3,2,1};
		System.out.println("Before Reverse:");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);	
		}
		reverse(arr);
		System.out.println();
		System.out.println("After Reverse:");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
		
	}
	
}
