import java.util.Set;
import java.util.TreeSet;
import java.util.*;
class SavingAccount implements Comparable<SavingAccount>
{

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;

	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	@Override
	public int compareTo(SavingAccount sa) {
		return (acc_ID -sa.acc_ID);
	}
} 

public class Assignment3Q9 
{
	public boolean addSavingAccount(SavingAccount saving)
	{
		List<SavingAccount> sa = new ArrayList<>();
		sa.add(saving);
		return true;
	}
	
    public static void main(String[] args)
	{
		TreeSet<SavingAccount> savingAccounts = new TreeSet<>();
		SavingAccount s1=new SavingAccount(1000,1001,"Shalaka",true);
		SavingAccount s2=new SavingAccount(4000,4001,"Bina",false);
		SavingAccount s3=new SavingAccount(3000,3001,"Deepika",false);
		SavingAccount s4=new SavingAccount(2000,2001,"Megha",true);
		SavingAccount s5=new SavingAccount(2000,2001,"Megha",true);

	    savingAccounts.add(s1);
	    savingAccounts.add(s2);
	    savingAccounts.add(s3);
	    savingAccounts.add(s4);
	    savingAccounts.add(s5);

		List<SavingAccount> newlist = new ArrayList<>();
		SavingAccount s6=new SavingAccount(5000,50001,"Reena",true);
		newlist.add(s6);



	    for(SavingAccount s:savingAccounts)
		{
			System.out.println(s.getAcc_balance()+" "+s.getAcc_ID()+" "+s.getAccountHolderName()+" "+s.isSalaryAccount());
		}
	}
	
	
}

