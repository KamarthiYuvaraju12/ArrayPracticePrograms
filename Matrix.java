package test;

public class Matrix { 
	public static void main(String []args) {
		int a[][] = {{2,3},{4,5}};
		int b[][] = {{2,3},{4,3}};
		
		int array[][] = new int[2][2];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				
				array[i][j] = a[i][j]+b[i][j];
				
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
		
		}
	  }
   }
