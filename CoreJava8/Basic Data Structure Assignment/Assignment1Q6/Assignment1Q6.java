import java.util .*;
class Login
{
    
	int totalAttempts= 3;
    public void loginUser(String user, String pass)
	{
		String userId = "Ajay",password = "password";
		while (totalAttempts != 0)
		{
			if (user.equals("Ajay") && pass.equals("password"))
			{
				System.out.println("Welcome");
break;
			}
			else
			{
				System.out.println("You have entered wrong credentials ,please enter the right credentials.");
				totalAttempts --;
			}
		}
		if (totalAttempts==0)
		{
			System.out.println("You have entered wrong credentials 3 times. Contact Admin");
		}
	}
}
public class Assignment1Q6 
{
    public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter usedId");
		String user = input.nextLine();
		System.out.println("Enter password");
		String pass = input.nextLine();
		Login l = new Login();
		l.loginUser(user,pass);
		
	}
}

