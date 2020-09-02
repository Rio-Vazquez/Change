igtmport java.util.Scanner;

public class Change 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println( "What was the price in cents?");
		int price = scanner.nextInt();
		System.out.println( "What was the price paid in cents?");
		int pricePaid = scanner.nextInt();
		if (pricePaid >= price)
		{
			int cents = pricePaid - price;
			int dollars = cents / 100;
			int RC = (cents % 100);
			int quarters = (RC) / 25;
			int dimes = ((RC) % 25) / 10;
			int nickels = (((RC) % 25) % 10) / 5;
			int pennies = ((((RC) % 25) % 10) % 5) / 1;
			
			System.out.println("Your change is ");
			if (dollars > 0)  
			{
				if (dollars == 1) 
				{
					System.out.println(dollars + " dollar");
				}
				else
				{
					System.out.println(dollars + " dollars");
				}
			}
			if (quarters > 0)
			{
				if (quarters == 1)
				{
					System.out.println(quarters + " quarter");
				}
				else
				{
					System.out.println(quarters + " quarters");
				}
			}
			if (dimes > 0)
			{
				if (dimes == 1)
				{
					System.out.println(dimes + " dime");
				}
				{
					System.out.println(dimes + " dimes");
				}
			}
			if (nickels > 0)
			{
				if (nickels == 1)
				{
					System.out.println(nickels + " nickel");
				}
				else 
				{
					System.out.println(nickels + " nickels");
				}
			}
			if (pennies > 0)
			{
				if (pennies == 1)
				{
					System.out.println(pennies + " penny");
				}
				else
				{
					System.out.println(pennies + " pennies");
				}
			}
		}
		else 
		{
			System.out.println("You did not pay enough");
		}
	}
}