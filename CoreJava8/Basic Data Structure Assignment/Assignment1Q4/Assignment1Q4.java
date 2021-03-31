import java.util .*;
class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks)
	{
		if(subject1Marks>60  && subject2Marks>60 && subject3Marks>60)
		{
			System.out.println("Passed");
		}
		
		else if(subject1Marks>60  && subject2Marks>60 || subject2Marks>60 && subject3Marks>60 || subject1Marks>60 && subject3Marks>60)
		{
			System.out.println("Promoted");
		}
		else if ((subject1Marks>60 || subject2Marks>60 ||  subject3Marks>60) || (subject1Marks<60  && subject2Marks<60 && subject3Marks<60))
		{
			System.out.println("failed");
		}
		return null;
	}
}
public class Assignment1Q4 {
    public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double subject1Marks= input.nextDouble();
		double subject2Marks= input.nextDouble();
		double subject3Marks= input.nextDouble();
		ResultDeclaration r=new ResultDeclaration();
		r.declareResults(subject1Marks,subject2Marks,subject3Marks);
	}
}