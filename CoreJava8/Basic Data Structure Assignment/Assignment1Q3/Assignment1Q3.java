import java.util .*;
class SiCi
{
    public double simpleInterest(double principalAmount,int time,double interestRate)
	{
		double si=(principalAmount*time*interestRate)/100;
		System.out.println("Simple Interest="+si);
		return si;
	}
    public double compoundInterest(double principalAmount,int time,double interestRate)
	{
		double ci=principalAmount*Math.pow(1.0+interestRate/100.0,time)-principalAmount;
		System.out. println("Compound Interest="+ci);
		return ci;
	}
}
public class Assignment1Q3 
{
    public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		double principalAmount= input.nextDouble();
		int time= input.nextInt();
		double interestRate= input.nextDouble();
		SiCi si = new SiCi();
		SiCi ci = new SiCi();
		si.simpleInterest(principalAmount,time,interestRate);
		ci.compoundInterest(principalAmount,time,interestRate);
	}
}

