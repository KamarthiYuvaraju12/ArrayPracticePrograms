package test;

import java.util.*;
public class FindOccuranceofCharater {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input:");
		String str = sc.nextLine();
		//String str = "aaBBBcdddd";
		int len = str.length();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				
				int value = map.get(ch);
				map.put(ch, value+1);
			
			}else {
				map.put(ch,1);
				
				
			}
	}
		
		System.out.print(map);
		
	}
}
