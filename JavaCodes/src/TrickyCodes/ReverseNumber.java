package TrickyCodes;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=454, reverse=0;
		System.out.println("number: "+n);
		int temp=n;
		for(;n!=0;n=n/10)
		{
			int remainder= n % 10;
			 reverse=reverse*10+remainder;	
		}
		System.out.println("Reverse of number: "+reverse);

		if(temp==reverse)
		{
			System.out.println("palindrom");
			
		}
		else
		{
			System.out.println("not palindrom");
		}
	}

}

