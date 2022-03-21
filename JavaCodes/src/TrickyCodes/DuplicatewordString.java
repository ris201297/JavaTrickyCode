package TrickyCodes;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatewordString {

	public static void main(String[] args) {
		List<String> l1= new ArrayList<String>();
		l1.add("Akash");
		l1.add("aass");
		l1.add("aass");
		
		Set<String> s1= new LinkedHashSet<String>(l1);
		
		System.out.println(s1);
		
		

	}

}
