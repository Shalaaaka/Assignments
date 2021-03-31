//if two persons have same weight them sort them based upon their height
package javaaa;
public class Person implements Comparable<Person>
{

	private String name;
    private int height;
    private double weight;
    
    
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}


	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}


	public double getWeight() {return weight;}
	public void setWeight(double weight) {this.weight = weight;}


	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}


	@Override
	public int compareTo(Person p) {
		
		if (this.weight==p.getWeight())
			return 0;
		else if(this.height< p.getHeight())
			return -1;
		else
			return 1;
	}
	
}
