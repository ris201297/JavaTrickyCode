package TrickyCodes;

public class ArrayIndex {

	public static void main(String[] args) {
		int [] arr= {0,1,0,0,1,1,0,1,0};
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==1)
			{
				System.out.println("index of 1: "+i);
				break;
			}
		}

	}

}
