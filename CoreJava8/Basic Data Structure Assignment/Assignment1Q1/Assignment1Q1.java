import java.util.Scanner;
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
		int result = 0; int orig = num; 
		while(num != 0)
		{
			int remainder = num%10;
			result = result + remainder*remainder*remainder; 
			num = num/10;
		}
		if(orig == result)
		{
			System.out.println("Number " + orig + " is an Armstrong number");
			return true;
		}
		System.out.println("Number "+ orig + " is not an Armstrong number");
		return false;
    }
}

public class Assignment1Q1 {
    public static void main(String[] args)
	{
		int number = new Scanner(System.in).nextInt();
		ArmstrongOrNot a = new ArmstrongOrNot();
		a.armstrongCheck(number);

	}
}

