package test;

public class RemoveDuplicateArray {
	public static int removeDuplicateArray(int arr [])
	{
		int rd = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[rd] != arr[i]){
			rd++;
			arr[rd] = arr[i];
		}
		
	}
		return rd;
}
	public static void main(String []args) {
		int arr[] = {2,2,3,3,5,6,6};
		System.out.println("Without Remove Duplicate Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	 
	  System.out.println("After Remove Duplicate Array:");
	  int rd = removeDuplicateArray(arr);
		for(int i=0;i<=rd;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	}


