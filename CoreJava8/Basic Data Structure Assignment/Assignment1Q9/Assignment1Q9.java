import java.util.*;
import java.io.*; 
class Student 
{
    public int subjectA,subjectB,subjectC;
	int total;int average;int a;
	public int getSubjectA() {
		return subjectA;
	}

	public void setSubjectA(int subjectA) {
		this.subjectA = subjectA;
	}

	public int getSubjectB() {
		return subjectB;
	}

	public void setSubjectB(int subjectB) {
		this.subjectB = subjectB;
	}

	public int getSubjectC() {
		return subjectC;
	}

	public void setSubjectC(int subjectC) {
		this.subjectC = subjectC;
	}
    public Student(int subjectA, int subjectB, int subjectC) {
		super();
		this.subjectA = subjectA;
		this.subjectB = subjectB;
		this.subjectC = subjectC;
	}
	public String toString() {
		return "Student [subjectA=" + subjectA + ", subjectB=" + subjectB + ", subjectC=" + subjectC + "]";
	}
}

public class Assignment1Q9 
{
	public static int studentsTotalMarksInAllSubjects(Student[] students)
	{
		int total=0;
		for (int i = 0; i <students.length; i++)
		{
			total =total+ students[i].subjectA + students[i].subjectB + students[i].subjectC;
			
		}
		System.out.println("Total marks of all the students in all subjects: "+total);
        return total;
	}
	public static double studentsAverageMarksInAllSubjects(Student[] students)
	{
		int average=0;
		for (int i = 0; i <students.length; i++)
		{
			average =average+students[i].subjectA + students[i].subjectB + students[i].subjectC;
			continue;
		}
		System.out.println("Average marks of all the students in all subjects: "+average/students.length);
		return 0;
	}
	 public static int subjectATotalByStudents(Student[] students)
	{
		 int a=0;
		for (int i = 0; i <students.length; i++)
		{
			 a =a+students[i].subjectA;
		}
		System.out.println("Total marks scored by students in subject A:"+a);
		return 0;
	}
	public static int subjectBTotalByStudents(Student[] students)
	{
		int b=0;
		for (int i = 0; i <students.length; i++)
		{
			 b=b+students[i].subjectB;
		}
		System.out.println("Total marks scored by students in subject B:"+b);
		return 0;
	}
	public static int subjectCTotalByStudents(Student[] students)
	{
		int c=0;
		for (int i = 0; i <students.length; i++)
		{
			 c=c+students[i].subjectC;
		}
		System.out.println("Total marks scored by students in subject C:"+c);
		return 0;
	}
	public static int subjectAAverageByStudents(Student[] students)
	{
		 int a=0;
		for (int i = 0; i <students.length; i++)
		{
			 a =a+students[i].subjectA;
		}
		System.out.println("Average marks scored by students in subject A:"+a/students.length);
		return 0;
	}
	public static int subjectBAverageByStudents(Student[] students)
	{
		int b=0;
		for (int i = 0; i <students.length; i++)
		{
			 b=b+students[i].subjectB;
		}
		System.out.println("Average marks scored by students in subject B:"+b/students.length);
		return 0;
	}
	public static int subjectCAverageByStudents(Student[] students)
	{
		int c=0;
		for (int i = 0; i <students.length; i++)
		{
			 c=c+students[i].subjectC;
		}
		System.out.println("Average marks scored by students in subject C:"+(c/students.length));
		return 0;
	}
    public static void main(String[] args)
	{
		Assignment1Q9 a=new Assignment1Q9();
		int n=3;
		Student[] arr;
		arr=new Student[3];
		arr[0]=new Student(10,20,30);
		arr[1]=new Student(10,20,30);
		arr[2]=new Student(10,20,30);
		System.out.println("Student 1: "+arr[0]+"\nStudent 2: "+arr[1]+"\nStudent 3: "+arr[2]);

		studentsTotalMarksInAllSubjects(arr);
		studentsAverageMarksInAllSubjects(arr);	
		subjectATotalByStudents(arr);
		subjectBTotalByStudents(arr);
		subjectCTotalByStudents(arr);
		subjectAAverageByStudents(arr);
		subjectBAverageByStudents(arr);
		subjectCAverageByStudents(arr);
	}
}