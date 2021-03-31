import java.util.Scanner;

abstract class DesertItem 
{
    abstract public int getCost();
}

class Candy extends DesertItem 
{
    private int totalCandies = 0;
    private int candyPrice = 1; 

    public int addCandies(int candies) 
	{
        totalCandies += candies;
        return totalCandies;
    }

    @Override
    public int getCost() 
	{
        int cost = totalCandies * candyPrice * 60;
        int totalCost = (int) 1.10 * cost;
        return totalCost;
    }
}

class Cookie extends DesertItem 
{
    private int totalCookies = 0;
    private int cookiePrice = 2; 

    public int addCookies(int cookies) 
	{
        totalCookies += cookies;
        return totalCookies;
    }

    @Override
    public int getCost() 
	{
        int cost = cookiePrice * 70;
        int totalCost = (int) 1.10 * cost;
        return totalCost;
    }
}

class IceCream extends DesertItem 
	{
    private int totalIceCreams = 0;
    private int iceCreamPrice = 100; 

    public int addIceCreams(int iceCreams) 
	{
        totalIceCreams += iceCreams;
        return totalIceCreams;
    }

    @Override
    public int getCost() 
	{
        int cost = totalIceCreams * iceCreamPrice;
        int totalCost = (int) 1.10 * cost;
        return totalCost;
    }
}

public class Assignment2Q7 
{
    Scanner input = new Scanner(System.in);
    Candy candy = new Candy();
    Cookie cookie = new Cookie();
    IceCream iceCream = new IceCream();

    public static void main(String[] args) 
	{
        Assignment2Q7 a = new Assignment2Q7();
        a.selectRoles();
    }

    private void selectRoles() 
	{
        System.out.println("Choose Role");
        System.out.println("A. owner");
        System.out.println("B. customer");
        System.out.print("Enter choice: ");
        String selectedRole = input.next();
        System.out.println();
        roles(selectedRole);
    }

    private void roles(String Roles) 
	{
        if (Roles.equals("A")) {
            addItems();
        } 
		else if (Roles.equals("B")) {
            placeOrder();
        } 
		else if (Roles.equals("C")) {
            return;
        } 
		else {
            System.out.println("Invalid Choice");
            selectRoles();
        }
    }

    private void addItems() 
	{
        int choice = 0;
        int totalItems = 0;
        while (choice != 5) 
		{
            System.out.println("Add Item");
            totalItems = candy.addCandies(0);
            System.out.println("1. Candy ("+totalItems+")");
            totalItems = cookie.addCookies(0);
            System.out.println("2. Cookie ("+totalItems+")");
            totalItems = iceCream.addIceCreams(0);
            System.out.println("3. IceCream ("+totalItems+")");
            System.out.println("4. Change Role");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            addItemsOperation(choice);
        }
    }

    private void addItemsOperation(int choice) 
	{
        int quantity = 0;
        if (choice == 5) {
            System.exit(0);
        } 
		else if (choice == 1) 
		{
            System.out.print("Number of candies: ");
            quantity = input.nextInt();
            int totalCandies = candy.addCandies(quantity);
            System.out.println("Total candies in shop: " + totalCandies);
        } 
		else if (choice == 2) 
		{
            System.out.print("Number of cookies: ");
            quantity = input.nextInt();
            int totalCookies = cookie.addCookies(quantity);
            System.out.println("Total cookies in shop: " + totalCookies);
        } 
		else if (choice == 3)
		{
            System.out.print("Number of icecreams: ");
            quantity = input.nextInt();
            int totalIcecreams = iceCream.addIceCreams(quantity);
            System.out.println("Total icecreams in shop: " + totalIcecreams);
		}
    }

    private void placeOrder() {
        int choice = 0;
        int totalItems = 0;
        while (choice != 5) 
		{
            System.out.println("Order Item");
            totalItems = candy.addCandies(0);
            System.out.println("1. Candy ("+totalItems+")");
            totalItems = cookie.addCookies(0);
            System.out.println("2. Cookie ("+totalItems+")");
            totalItems = iceCream.addIceCreams(0);
            System.out.println("3. IceCream ("+totalItems+")");
            System.out.println("4. Change Role");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            placeOrderOperation(choice);
        }
    }

    private void placeOrderOperation(int choice)
		{
        int quantity = 0;
        int price = 0;
        int stock = 0;
        switch(choice)
			{
            case 1:
                quantity = input.nextInt();
                stock = candy.addCandies(0);
                if (quantity <= stock) {
                    price = quantity * candy.getCost();
                    candy.addCandies(-quantity);
                    System.out.println("Total cost of " + quantity + " candies = " + price);
                } else 
				{
                    System.out.println("Ordered already");
                }
                break;
            case 2:
                quantity = input.nextInt();
                stock = cookie.addCookies(0);
                if (quantity <= stock) 
				{
                    price = quantity * cookie.getCost();
                    cookie.addCookies(-quantity);
                    System.out.println("Total cost of " + quantity + " cookies = " + price);
                } else {
                    System.out.println("Ordered already");
                }
                break;
            case 3:
                quantity = input.nextInt();
                stock = iceCream.addIceCreams(0);
                if (quantity <= stock) 
				{
                    price = iceCream.getCost();
                    iceCream.addIceCreams(-quantity);
                    System.out.println("Total cost of " + quantity + " icecreams = " + price);
                } 
				else 
				{
                    System.out.println("Ordered already");
                }
                break;
            case 4:
                selectRoles();
                break;
			case 5:
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
        }
    }
}
