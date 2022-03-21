package TrickyCodes;

public class ReverseString {

	public static void main(String[] args) {
		
		String string="Malayalam";
		String reverstr=" ";
		System.out.println(string.length());
		
		for(int i=string.length()-1;i>=0;i--)
		{
			reverstr=reverstr+string.charAt(i);
		}
		
		System.out.println(reverstr.length());
		
		
		System.out.println("Reverse of given string: "+reverstr);
			
//		if(reverstr.equalsIgnoreCase(string))
//		{
//			System.out.println("this is palindrom");
//			
//		}
//		else
//		{
//			System.out.println("not palindrom");
//		}
		
	}
	}


