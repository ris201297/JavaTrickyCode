package TrickyCodes;

public class Sentence {

	public static void main(String[] args) {
		String str = "I am Rishabh from Capgemini";
		String[] word = str.split(" "); // store in array
		String rts =" ";

		for ( int i = 0; i < word.length; i++ )
		{
		if (!( word[i].length() > rts.length() )) // "!" --- use karenge less alphabet wale word ke liye 
		rts = word[i];

		}
		System.out.println("word: "+rts );

		
//		String str1="mymymy name is Rishabh";
//		String[] s= str.split(" ");
//		String ret="\s";
//		String ret1=s[0];
//		for(int i =0;i<s.length;i++)
//		{
//			if((s[i].length()>ret.length()))
//			{
//				ret= s[i];
//			}
//			if(s[i].length()<ret1.length())
//			{
//				ret1=s[i];
//			}
//		}
//		System.out.println(ret);
//		System.out.println(ret1);
	}

}
