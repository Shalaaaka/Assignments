abstract class shape
{
	abstract void draw();
}
class rectangle extends shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}
class circle extends shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}
abstract class animal
{
	void eat()
	{
		System.out.println("eating");
	}
	abstract void sleep();
}
class dog extends animal 
{
	void eat()
	{
		System.out.println("eating");
	}
}
abstract class cat
{
}
class pig extends cat
{
	void show()
	{
		System.out.println("pig");
	}
}
public final abstract class example
{
	public void sample();
}
class ex extends example
{
	void sample()
	{
		System.out.println("ex");
	}
}
private abstract class sample
{
	void show();
}
class example extends sample
{
	void show()
	{
		System.out.println("Example");
	}
}
class Assignment2Q4
{
	public static void main(String args[])
	{
		animal a=new animal();
		animal b=new dog();
		shape s=new circle();
		s.draw();
		cat ca=new pig();
		ca.show();
	}
}