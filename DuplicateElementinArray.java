package test;

public class DuplicateElementinArray {
	public static void main(String[]args) {
		int []a= {1,2,3,4,5,6,7,1,3};
		int sum = 0;
				for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
				System.out.println(a[j]);
				
				sum = sum+a[j];
				
				
				
				}
				
			}
			
		}
				System.out.println("sum is:"+sum);
		}
	}


