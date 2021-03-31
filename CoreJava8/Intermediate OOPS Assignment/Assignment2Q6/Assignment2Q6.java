abstract class Persistence 
{
    abstract public String persist();
}
class FilePersistence extends Persistence
{
    @Override
    public String persist()
	{
		System.out.println("FilePersistence");
		return null;
	}
}
class DatabasePersistence extends Persistence
{
    @Override
    public String persist()
	{
		System.out.println("DatabasePersistence");
		return null;
	}
}

public class Assignment2Q6 
{
    public static void main(String[] args)
	{
		Persistence p=new FilePersistence();
		p=new DatabasePersistence();
		p.persist();
	}
}

