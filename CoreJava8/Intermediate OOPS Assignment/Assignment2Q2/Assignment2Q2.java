import java.util.ArrayList;
class Manager extends Assignment2Q2 
{
    //@Override
    public int getSalary(int salary) 
	{
        int incentive = 5000;
		return incentive+salary;
    }
}

class Labour extends Assignment2Q2 
{
    //@Override
    public int getSalary(int salary) 
	{
        int overtime = 500;
		return salary+overtime;
    }
}

public class Assignment2Q2 
{
    int salary = 10000;
    public int getSalary()
	{
		return 0;
	}
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries)
	{
		int sum=0;
        for(int i=0;i<employeeSalaries.size();i++)
            sum+=employeeSalaries.get(i);
        return sum;
	}
    public static void main(String[] args)
	{
		Manager m=new Manager();
		Labour l=new Labour();
		int man=m.getSalary();
		int lab=l.getSalary();
		ArrayList<Integer>total=new ArrayList<>();
        total.add(man);
        total.add(lab);
		Assignment2Q2 a=new Assignment2Q2();
		System.out.println(a.totalEmployeesSalary(total));
	}
}

