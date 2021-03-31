//if two persons have same weight them sort them based upon their height
package javaaa;
import java.util.Set;
import java.util.TreeSet;
public class Assignment3Q1 {
	public static void main(String[] args) 
	{
		Set <Person> pset = new TreeSet<Person>().descendingSet();
		
		Person p1=new Person("Megha",160,60);
		Person p2=new Person("veena",180,68);
		Person p3=new Person("Anita",150,50);
		Person p4=new Person("Sneha",162,56);
		Person p5=new Person("Mona ",158,56);

		pset.add(p1);
		pset.add(p2);
		pset.add(p3);
		pset.add(p4);
		pset.add(p5);
		
		for(Person p:pset)
		{
			System.out.println(p.getName()+" "+p.getHeight()+" "+p.getWeight());
		}
		
	}

}
