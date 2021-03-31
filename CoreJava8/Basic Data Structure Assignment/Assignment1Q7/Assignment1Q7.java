import java.util .*;
class SearchArray
{
    public boolean searchArray(int[] arr,int toCheckValue)
	{
		boolean found=false;
		for (int n: arr)
		{
			if (n==toCheckValue)
			{
				found = true;
				break;
			}
		}
		if (found)
		{
			System.out.println(toCheckValue+" is found");
		}
		else
		{
			System.out.println(toCheckValue+" is not found");
		}
		return found;
	}
}
public class Assignment1Q7 
{
    public static void main(String[] args)
	{
		int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int valueToCheck = 19;
		SearchArray s = new SearchArray();
		s.searchArray(arr,valueToCheck);
	}
}
   