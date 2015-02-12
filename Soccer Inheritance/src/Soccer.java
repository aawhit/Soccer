import java.util.Scanner;

public class Soccer
	{
	static fieldPlayer s = new fieldPlayer(0);
	static goalie g = new goalie(0);
	static int [][] goal = {{1,2,3},{4,5,6},{7,8,9}};
	public static int tempInt;
	protected static int playerShooting;
	protected static int compShooting;
	protected static int playerShot;
	public static void printGoal()
		{
		System.out.println("          GOAL");
		System.out.println("-------------------------");
		System.out.println("| " + goal[0][0] + "         " + goal[0][1] + "         " + goal [0][2] + " |");
		System.out.println("|                       |");
		System.out.println("| " + goal[1][0] + "         " + goal[1][1] + "         " + goal [1][2] + " |");
	    System.out.println("|                       |");
	    System.out.println("| " + goal[2][0] + "         " + goal[2][1] + "         " + goal [2][2] + " |");
	    System.out.println("-------------------------");
		}


	public static void goalOrBlock(int ps, int cs)
		{	
		tempInt = (int)(Math.random()*40)+61;
		playerShooting = (int)(Math.random()*30)+71;
		compShooting = (int)(Math.random()*30)+71;
		switch (goalie.side)
			{
			case 0:
				if (playerShooting < tempInt)
					{
					System.out.println("Your shot missed the goal!");
					}
				else if (ps == goalie.goaliePosition)
					{
					System.out.println("Your shot was blocked!");
					}
				else if ((ps == goal[0][0] || ps==goal[2][0]) && goalie.goaliePosition == goal[1][0])
					{
					if (s.getShooting() < g.getGoodHands())
						{
						System.out.println("Your shot was blocked.");
						}
					else 							{
						System.out.println("You scored!");
						}
					}
				else 
				{
				System.out.println("You scored!!");
				}
				break;
			case 1:
				if (playerShooting < tempInt)
					{
					System.out.println("Your shot missed the goal.");
					}
				else if (ps == goalie.goaliePosition)
					{
					System.out.println("Your shot was blocked!");
					}
				else if ((ps == goal[0][1] || ps == goal[2][1]) && goalie.goaliePosition == goal[1][1])
					{
					if (s.getShooting() < g.getGoodHands())
						{
						System.out.println("Your shot was blocked.");
						}
					else 							
						{
						System.out.println("You scored!");
						}
					}
				else 
					{
					System.out.println("You scored!!");
					}
				break;
			case 2:
				if (playerShooting< tempInt)
					{
					System.out.println("Your shot missed.");
					}
				if (ps == goalie.goaliePosition)
					{
					System.out.println("Your shot was blocked!");
					}
				else if ((ps == goal[0][2] || ps == goal[2][2]) && goalie.goaliePosition == goal[1][2])
					{
					if (s.getShooting() < g.getGoodHands())
						{
						System.out.println("Your shot was blocked.");
						}
					else 							
						{
						System.out.println("You scored!");
						}
					}
				else 
					{
					System.out.println("You scored!!");
					}
			}

		switch (goalie.side)
		{
		case 0:
			if (compShooting < tempInt)
				{
				System.out.println("Your opponent's shot missed.");
				}
			else if (cs == goalie.goaliePosition)
				{
				System.out.println("Your opponent's shot was blocked!");
				}
			else if ((cs == goal[0][0] || cs==goal[2][0]) && goalie.goaliePosition == goal[1][0])
				{	
				if (s.getShooting() < g.getGoodHands())
					{
					System.out.println("Your shot was blocked.");
					}
				else 							
					{
					System.out.println("You scored!");
					}
				}
			else 
				{
				System.out.println("Your opponent scored.");
				}
			break;
		case 1:
			if (compShooting < tempInt)
				{
				System.out.println("Your opponent's shot missed.");
				}
			else if (cs == goalie.goaliePosition)
				{
				System.out.println("Your opponent's shot was blocked!");
				}
			else if ((cs == goal[0][1] || cs == goal[2][1]) && goalie.goaliePosition == goal[1][1])
				{
				if (s.getShooting() < g.getGoodHands())
					{
					System.out.println("Your shot was blocked.");
					}
				else 							
					{
					System.out.println("You scored!");
					}
				}
			else 
				{
				System.out.println("Your opponent scored");
				}
			break;
		case 2:
			if (compShooting < tempInt)
			 {
				
			 }
			else if (cs == goalie.goaliePosition)
				{
				System.out.println("Your opponent's shot was blocked!");
				}
			else if ((cs == goal[0][2] || cs == goal[2][2]) && goalie.goaliePosition == goal[1][2])
				{
				if (s.getShooting() < g.getGoodHands())
					{
					System.out.println("Your shot was blocked.");
					}
				else 							
					{
					System.out.println("You scored!");
					}
				}
			else 
				{
				System.out.println("Your opponent scored.");
				}
		}
		}
	public static void runAgain()
		{
		System.out.println(fieldPlayer.name + " where would you like to shoot?");
		Scanner userInput1 = new Scanner(System.in);
		playerShot = userInput1.nextInt();
		goalie.goalieSide();
		Soccer.goalOrBlock(Soccer.playerShot,fieldPlayer.compShot);
		}
	}
