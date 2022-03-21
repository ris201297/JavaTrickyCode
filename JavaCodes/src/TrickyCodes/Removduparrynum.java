package TrickyCodes;

public class Removduparrynum {

	static int duplicateremove(int[] arr, int n)
	{
		if(n==0||n==1)
		{
			return n;

		}
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j++]= arr[i];
			}
		}
		arr[j++]= arr[n-1];

		return j;


	}

	public static void main(String[] args) {
		int [] arr= {18,18,24,24,90};
		int length= arr.length;
		length= duplicateremove(arr, length);

		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
