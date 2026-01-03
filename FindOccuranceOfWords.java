package test;


import java.util.*;

public class FindOccuranceOfWords {
   public static void main(String[]args) {
	   String str = "java word java oracle html css word";
	   
	   Map<String,Number> map = new HashMap<>();
	   for(String str1 : str.split(" ")){
		   if(map.containsKey(str1)) {
			  int value = (int) map.get(str1);
			  map.put(str1, value+ 1);
			   
		   }else {
			   map.put(str1, 1);
		   }
		   
	   }
	   System.out.println(map);
   }
}
