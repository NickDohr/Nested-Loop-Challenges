import java.util.Scanner;

public class ArrayChallenges
	{

		public static void main(String[] args)
			{
				//challenge1();
				//challenge2();
				//challenge3();
				//challenge4();
				//challenge5();
				challenge6();
			}
		public static void challenge1()
		{
			
			Scanner userIntInput = new Scanner(System.in);
			System.out.println("How many favorite sweets do you have?");
			int numberOfSweets = userIntInput.nextInt();
			String[] sweets = new String [numberOfSweets];
			for (int i = 0; i < sweets.length; i++)
				{
					Scanner userStringInput = new Scanner(System.in);
					System.out.println("Input a favorite sweet");
					String favoriteSweet = userStringInput.nextLine();
					
					sweets[i] = favoriteSweet;
				}	
			System.out.println();
			System.out.println();
			
			for (int i = 0; i<sweets.length; i++)
				{
					System.out.println("(" + (i + 1) + ") " + sweets[i]);
				
				}
			
		}
		public static void challenge2()
			{
				int odds =0;
				int evens = 0;
				int [] numbers = new int [8];
				for (int i = 0; i < numbers.length; i++)
					{
						Scanner userIntInput = new Scanner(System.in);
						System.out.println("Give me a number!?");
						int number = userIntInput.nextInt();
						numbers[i] = number;
					}
				for (int i = 0; i < numbers.length; i ++)
					{
						if(numbers[i]%2 == 0)
							{
								evens = evens + numbers[i];
							}
						else if(numbers[i]%2 ==1)
							{
								odds = odds + numbers[i];
							}
					}
				System.out.println("The total of your odd numbers was " + odds);
				System.out.println("The total of your evens numbers was " + evens);
				
			}
		public static void challenge3()
		{
		int [] random = new int [5];
		
		{
			for(int i = random.length - 1; i >=0; i--)
				{
					random[i] = ((int)(Math.random() * 91) + 10);
				}
			for(int n: random)
				{
					System.out.println(n);
				}
		}
		}
		public static void challenge4()
		{
			int [] quad = new int [4];
			 Scanner userIntInput = new Scanner(System.in);
				System.out.println("Give me a 4 digit number!");
				int number = userIntInput.nextInt();
				for(int i = 0; i < quad.length; i++)
					{
				quad[i] = number % 10;
				number = number/10;
				
					}
				for(int n: quad)
					{
						System.out.println(n);
					}
		}
		public static void challenge5()


		{
			String [] games = {"Scrabble", "Monopoly", "Catan", "Go", "Life" };
			for(int i = 0; i < games.length; i++)
				{
					games[games.length -1] = "boggle";
				}
			for(String r: games)
				{
					System.out.println(r);
				}
		}
		public static void challenge6()
		{
			
		}
	}
