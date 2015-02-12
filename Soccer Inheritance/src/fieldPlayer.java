import java.util.Scanner;


public class fieldPlayer
	{
	protected static int shooting;
	protected static String name;
	protected static int whichPlayer;
	protected static int compShot;
	public fieldPlayer(int s)
		{
        shooting = s;
		}
	public static int getShooting()
		{
		return shooting;
		}
	public void setShooting(int shooting)
		{
		this.shooting = shooting;
		}
	
	public static void character()
		{
		System.out.println("What is your name?");
		Scanner userInput = new Scanner(System.in);
		name = userInput.nextLine();
		}
	public static void pickComp()
		{
		System.out.println("I will choose your opponent now.");
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
