package test;

public class MovesZerosToEnd {
	
	public static void movesZerosEnd(int arr[]) {
		int nz = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[nz] = arr[i];
				nz++;
			}
		}
		while(nz<arr.length) {
			arr[nz] = 0;
			nz++;
		} 
		
	}
	
	public static void main(String[]args) {
		int arr[] = {0,2,0,4,0,5,7};
		System.out.println("Before Zeros Moves End:");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);	
		}
		movesZerosEnd(arr);
		System.out.println();
		System.out.println("After Zeros Moves End:");
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
	   }

		
	  }
	
	


