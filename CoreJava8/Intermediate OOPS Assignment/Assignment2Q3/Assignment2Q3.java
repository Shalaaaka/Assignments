import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 
{
    int totalDeposits = 10000;
    int creditLimit = 2000;

    @Override
    public int getCash() 
	{
        return totalDeposits - creditLimit;
    }
}

class SavingsAccount extends Assignment2Q3 
{
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;

    @Override
    public int getCash() 
	{
        return totalDeposits + fixedDepositAmount;
    }
}

public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash) 
	{
        int sum=0;
        for(int i=0;i<cash.size();i++)
            sum+=cash.get(i);
        return sum;

    }

    public int getCash() 
{
        return 0;
    }

    public static void main(String[] args) {
        CurrentAccount c=new CurrentAccount();
        SavingsAccount s=new SavingsAccount();
        int current=c.getCash();
        int savings=s.getCash();

        ArrayList<Integer>amount=new ArrayList<>();
        amount.add(current);
        amount.add(savings);

        Assignment2Q3 a=new Assignment2Q3();
        System.out.println(a.totalCashInBank(amount));
    }
}