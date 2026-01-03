 package test;

import java.util.*;


public class ArrayAscending {
	public static void main(String[]args) {
		Integer array[] = {1,4,2,6,8,7,9,0,3,5};
		Arrays.sort(array);
		Spliterator<Integer>sp = Arrays.spliterator(array);
		System.out.println("....Ascending Order...");
		sp.forEachRemaining((z)->
		{
			System.out.print(z.toString()+" ");
		});
			System.out.println("\n.....Descending Order...");	
			for(int i=array.length-1;i>=0;i--) {
				System.out.print(array[i]+" ");
			}
	}

}
