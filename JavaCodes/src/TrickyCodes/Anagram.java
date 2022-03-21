package TrickyCodes;

public class Anagram {

	public static void main(String[] args) {
		String s="listen";
		String s1="silent";
		char[] str= s.toCharArray();
		char[] str1= s1.toCharArray();
		
		if(s.length()==s1.length())
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				for(int j =0;j<str1.length;j++)
				{
					if(str[i]==str[j])
					{
						count++;
						break;
					}
				}
			}
			if(count==s.length())
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
	}

}
