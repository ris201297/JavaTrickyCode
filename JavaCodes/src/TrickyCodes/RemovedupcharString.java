package TrickyCodes;

public class RemovedupcharString {

	public static void main(String[] args) {
		
		String s="Hello";
		
		
		String dup="";
		
		char str[] = s.toCharArray();
		
		for(int i =0;i<str.length;i++)
		{
			if(!dup.contains(String.valueOf(str[i])))
			{
				dup+=str[i];
			}
		}
		System.out.println(dup);
		
	}

}
