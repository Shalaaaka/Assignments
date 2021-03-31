import java.util .*;
class TaxAmount
{
	double tax;
    public double calculateTaxAmount(int ctc)
	{
		if(ctc>=0 && ctc<=180000)
		{
			tax=0;
			System.out.println(tax);
		}
		else if(ctc>=181001 && ctc<=300000)
		{
			tax=(ctc-181000)*0.10;
			System.out.println(tax);
		}
		else if(ctc>=300001 && ctc<=500000)
		{
			tax=18000+(ctc-300000)*0.20;
			System.out.println(tax);
		}
		else if(ctc>=500001 && ctc<=1000000)
		{
			tax=18000+60000+(ctc-500000)*0.30;
			System.out.println(tax);
		}
		return tax;
	}
}
public class Assignment1Q5 
{
    public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int ctc = input.nextInt();
		TaxAmount t = new TaxAmount();
		t.calculateTaxAmount(ctc);

	}
}

