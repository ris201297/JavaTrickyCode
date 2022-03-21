package TrickyCodes;

public class PrimeNum {

	public static void main(String[] args) {
		int i=0, n=0;
		String prime=" ";
		
		for(i=1;i<=100;i++)
		{
			int count=0;
			for(n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				prime=prime+i+" ";
			}
		}
		System.out.println("Prime number: ");
		System.out.println(prime);
	}

}
