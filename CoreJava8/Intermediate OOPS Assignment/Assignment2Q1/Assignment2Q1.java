class SingletonInheritanceCheck
{
	private static SingletonInheritanceCheck obj;
	private SingletonInheritanceCheck ()
	{
	}
	public static SingletonInheritanceCheck getInstance()
	{
		if (obj==null)
		{
			obj=new SingletonInheritanceCheck();
		}
		return obj;
	}
}

public class Assignment2Q1
{
	public static void main(String[] args)
	{
		SingletonInheritanceCheck s;
		s=SingletonInheritanceCheck.getInstance();
	}
}