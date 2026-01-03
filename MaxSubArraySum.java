package test;

public class MaxSubArraySum {
	public static int sumArray(int a[])
	   {
		int sum = a[0];
		int maxsum = a[0];
		for(int i=1;i<a.length;i++)
		   {
			if(sum>=0)
			{
				sum+= a[i];
			}else 
			{
				sum = a[i]; 
			}
			if(sum>maxsum) 
			{
				maxsum = sum;
			}
			
		}
		System.out.println(maxsum);
		return maxsum;
				
	   }
	public static void main(String[] args ) 
	{
		
		int a[] = {1,2,3};
		sumArray(a);	
		
	}


	


	}
