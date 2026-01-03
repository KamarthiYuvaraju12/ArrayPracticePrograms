package test;

public class SearchElementinArray {
	public static void main(String[]args) {
		int []a = {10,20,40,50,30};
		int search_elem = 50;
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			if(search_elem == a[i]) {
				System.out.println("Search Element Found it Position is:"+i);
			}
		}
	}

}
