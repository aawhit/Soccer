import java.util.Scanner;


public class fieldPlayer
	{
	protected int shooting;
	private static String name;
	protected static int shot;
	public fieldPlayer(int s)
		{
        shooting = s;
		}
	public static void character()
		{
		System.out.println("What is your name?");
		Scanner userInput = new Scanner(System.in);
		name = userInput.nextLine();
//		System.out.println("Great, " + name + " on a scale from 1-100, how good are you at shooting for soccer?");
		System.out.println("Where would you like to shoot?");
		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();
		}
	}
