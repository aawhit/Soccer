import java.util.Scanner;


public class fieldPlayer
	{
	protected int shooting;
	private static String name;
	protected static int playerShot;
	protected static int whichPlayer;
	protected static int compShot;
	public fieldPlayer(int s)
		{
        shooting = s;
		}
	public static void character()
		{
//		System.out.println("What is your name?");
//		Scanner userInput = new Scanner(System.in);
//		name = userInput.nextLine();
//		System.out.println("Great, " + name + " on a scale from 1-100, how good are you at shooting for soccer?");
		System.out.println("Where would you like to shoot?");
		Scanner userInput1 = new Scanner(System.in);
		playerShot = userInput1.nextInt();
		}
	public static void pickComp()
		{
		whichPlayer = (int)(Math.random()*3);
		if (whichPlayer == 0)
			{
			System.out.println("You will be playing against the defender.");
			compShot = defender.dWhere;
			}
		else if (whichPlayer == 1)
			{
			System.out.println("You will be playing against the midfielder.");
			compShot = midfielder.mWhere;
			}
		else 
			{
			System.out.println("You will be playing against the forward.");
			compShot = forward.fWhere;
			}
		}
	}
