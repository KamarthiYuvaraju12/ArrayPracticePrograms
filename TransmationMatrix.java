package test;

public class TransmationMatrix {
public static void main(String[]args) {
	 int array[][] = {{2,3,},{4,2}};
	 int array1[][] = {{4,7},{4,7}};
	
	int a[][] = new int[2][2];
	System.out.println("....Before transpose Matrix...");
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array1.length;j++) {
			a[i][j] = array[i][j]+array1[i][j];
			
			
			System.out.print(a[i][j]+" ");
						
		}
		System.out.println();
		
		
	}
	System.out.println(".... After transpose Matrix...");
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array1.length;j++) {
			a[i][j] = array[i][j]+array1[i][j];
			
	System.out.print(a[j][i]+" ");
		}	
		System.out.println();
     }
   }
}
