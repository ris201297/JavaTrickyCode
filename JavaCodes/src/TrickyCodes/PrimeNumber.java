package TrickyCodes;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner pn = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int number = pn.nextInt();

        	int i = 2;
        	boolean flag = false;
        	while(i <= number/2)
        {
        		// condition for not a prime number
        		if(number % i == 0)
        		{
        			flag = true;
        			break;
        		}

        		++i;
        }

        	if (!flag)
        		System.out.println(number + " :is a prime number.");
        	else
        		System.out.println(number + " :is not a prime number.");
	}

}


