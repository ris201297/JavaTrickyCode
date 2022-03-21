package TrickyCodes;

import java.util.ArrayList;
import java.util.List;

public class Arraylistclass {

	public static void main(String[] args) {
		List<String> l1= new ArrayList<String>();
		List<String> l2= new ArrayList<String>();
 
		l1.add("Rishabh");
		l1.add("Anand");
		
		l2.add("Rishabh");
		l2.add("Sharma");
		
		for(int i=0;i<l1.size();i++)
		{
			for(int j=0;j<l2.size();j++)
			{
				if(l1.get(i).contains(l2.get(j)))
				{
					System.out.println(l1.get(i));
				}
			}
			
			l1.retainAll(l2);
			System.out.println(l1);
		}
	}

}
