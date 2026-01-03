package test;

public class CountNumberOfNumbers {

	public static void main(String[] args) {
		int a[] = {1,2,3,1,4,1,5,1};
		int count = 0;
		int num = 1;
		for(int i=0;i<a.length;i++) {
			if(num == a[i]) {
				count++;
				
			}
		 }
		System.out.println("Count Number Of Repeats-1:"+count+" times.");
		
		         }

}
