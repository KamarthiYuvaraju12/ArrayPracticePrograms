package test;
import java.util.*;
public class ArrayListAscending {
	public static void main(String[]args) {
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(8);
		al.add(6);
		al.add(1);
		al.add(4);
		al.add(0);
		al.add(5);
		al.add(2);
		al.add(7);
		al.add(3);
		al.add(9);
		Collections.sort(al);
		System.out.println("....Ascending Order....");
		System.out.print(al);
		System.out.println("\n....Descending Order....");
		for(int i= al.size()-1;i>=0;i--) {
			System.out.print(al.get(i)+" ");
		}
		
	   }
	
	}

