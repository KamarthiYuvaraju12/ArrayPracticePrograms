package test;

public class MissingNumberInArray {
	public static void missingNumber(int a[]) {
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
			
		}
		System.out.println("Sum of array Lengtht:"+sum);
		int sum1=0;
		for(int j=1;j<=5;j++) {
			sum1 = sum1 + j;
			
		}
		System.out.println("Sum of numbers:"+sum1);
		
		System.out.println("Missing Number:"+(sum1-sum));
	}
	
	
	
	public static void main(String[] args) {
		
		int a [] = {1,2,4,5};
		
	missingNumber(a);
	
	}

	}

