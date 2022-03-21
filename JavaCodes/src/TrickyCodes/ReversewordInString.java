package TrickyCodes;

public class ReversewordInString {

	public static void main(String[] args) {
		String s= "My name is Rishabh";
		String[] word = s.split(" ");
		String retrn="";
		
		for(int i=word.length-1;i>=0;i--)
		{
			retrn+=word[i]+" ";
		}
		System.out.println("Reverse of word: ");
		//System.out.println(retrn.substring(0,retrn.length()-1));
		System.out.println(retrn);
	}

}
