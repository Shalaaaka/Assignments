class ArmstrongNumBetweenRange
	{
		int num,orig,result=0;
		public int armstrongNumbersInRange(int min , int max)
		{
			for (num=min;num<=max;num++)
			{
				orig=num;
				while (num!=0)
				{
					int remainder = orig%10;
					result = result + (remainder*remainder*remainder);
					orig = orig/10;

				}
				if(result==num)
				{
					System.out.println(num+" ");
				}
				result=0;
			}
			return result;
		}
	}

public class Assignment1Q2 {
    public static void main (String [] args)
	{
		ArmstrongNumBetweenRange a = new ArmstrongNumBetweenRange();
		int min = 100;
		int max = 999;
		a.armstrongNumbersInRange(100,999);
		//System.out.println();
	}
}