package test;

public class SearchingElementinArray {
	public static void main(String[]args) {
		int a[] ={1,2,3,4,6,8,7,9,10};
				int sum1 = 0;
				int sum2 = 0;
				for(int i=0;i<a.length;i++) {
					sum1 = sum1+a[i];
				}
				System.out.println("Array of sum element:"+sum1);
				
				
	          for(int i=1;i<=10;i++) {
	        	  sum2 = sum2+i;
	          }
	          System.out.println("Sum of Array Range:"+sum2);
	          System.out.println(" Missing Element:"+(sum2-sum1));
	          
	}

}
