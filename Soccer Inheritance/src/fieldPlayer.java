import java.util.Scanner;


public class fieldPlayer
	{
	protected int shooting;
	private static String name;
	public fieldPlayer(int s)
		{
        shooting = s;
		}
	public static void character()
		{
		System.out.println("What is your name?");
		Scanner userInput2 = new Scanner(System.in);
		name = userInput2.nextLine();
		System.out.println("Great, " + name + " on a scale from 1-100, how good are you at shooting for soccer?");
		}
	}
