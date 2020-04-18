package qatesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Testing {

public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<String> as = new ArrayList<String>(
				Arrays.asList("jagadeesh ", "satish " , "ravi"));
		ar.add(1);
		ar.add(567);
		ar.add(567);
		ar.add(2 ,345);
		as.add(0 , "Steve");
		System.out.println(as);
		System.out.println(ar);
		System.out.println(ar.get(1));
		
		
		System.out.println(as);
		
		/*for(String s : as){
			System.out.println(s);
		}
		
		Iterator it = as.iterator();
		it.hasNext();
		System.out.println(it.next());*/
		
		Collections.sort(as);
		for(String s : as){
			System.out.println(s);
		}
}

}