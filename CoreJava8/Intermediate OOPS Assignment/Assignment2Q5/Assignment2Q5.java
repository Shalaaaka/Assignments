abstract class Shape5 
{
    abstract public String draw();
}

class Rectangle5 extends Shape5 {
    @Override
    public String draw()
	{
		System.out.println("Rectangle");
		return null;
	}
}

class Line5 extends Shape5{
    @Override
    public String draw()
	{
		System.out.println("Line ");
		return null;
	}
}

class Cube5 extends Shape5 {
    @Override
    public String draw()
	{
		System.out.println("Cube");
		return null;
	}
}

public class Assignment2Q5{
    public static void main(String[] args)
	{
		Shape5 s=new Rectangle5();
		Shape5 b= new Line5();
		Shape5 c=new Cube5();
		b.draw();
		s.draw();
		c.draw();

	}
}