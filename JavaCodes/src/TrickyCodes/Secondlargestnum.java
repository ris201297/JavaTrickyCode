package TrickyCodes;

public class Secondlargestnum {
	
	static int secondlarge(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		return arr[arr.length-2];
	}

	public static void main(String[] args) {
		
		int [] arr= {100,22,663,892};
		System.out.println(secondlarge(arr));

	}

}
