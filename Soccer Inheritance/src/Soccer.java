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
	protected static int yourGoals=0;
	protected static int cGoals=0;
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


	public static void goalOrBlock(int ps, int cs) throws InterruptedException
		{	
		tempInt = (int)(Math.random()*40)+61;
		playerShooting = (int)(Math.random()*30)+71;
		compShooting = (int)(Math.random()*30)+71;
		goalie.goalieSide();
		Thread.sleep(2500);
		switch (goalie.side)
			{
			case 0:
				if (playerShot > 9 || playerShot<1)
					{
					System.out.println("Your shot missed the goal(You selected a number outside the goal.)");
					}
				else if (playerShooting < tempInt)
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
						yourGoals++;
						}
					}
				else 
				{
				System.out.println("You scored!!");
				yourGoals++;
				}
				break;
			case 1:
				if (playerShot > 9 || playerShot<1)
					{
					System.out.println("Your shot missed the goal(You selected a number outside the goal.)");
					}
				else if (playerShooting < tempInt)
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
						yourGoals++;
						}
					}
				else 
					{
					System.out.println("You scored!!");
					yourGoals++;
					}
				break;
			case 2:
				if (playerShot > 9 || playerShot<1)
					{
					System.out.println("Your shot missed the goal(You selected a number outside the goal.)");
					}
				else if (playerShooting< tempInt)
					{
					System.out.println("Your shot missed.");
					}
				else if (ps == goalie.goaliePosition)
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
						yourGoals++;
						}
					}
				else 
					{
					System.out.println("You scored!!");
					yourGoals++;
					}
			}

		goalie.goalieSide();
		Thread.sleep(2500);
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
					System.out.println("Your opponent scored.");
					cGoals++;
					}
				}
			else 
				{
				System.out.println("Your opponent scored.");
				cGoals++;
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
					System.out.println("Your opponent's shot was blocked.");
					}
				else 							
					{
					System.out.println("Your opponent scored!");
					cGoals++;
					}
				}
			else 
				{
				System.out.println("Your opponent scored");
				cGoals++;
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
					System.out.println("Your opponent's shot was blocked.");
					cGoals++;
					}
				else 							
					{
					System.out.println("Your opponent scored!");
					cGoals++;
					}
				}
			else 
				{
				System.out.println("Your opponent scored.");
				cGoals++;
				}
		}
		}
	public static void runAgain() throws InterruptedException
		{
		for (int i=0;i<5;i++)
			{
			System.out.println(fieldPlayer.name + " where would you like to shoot?");
			Scanner userInput1 = new Scanner(System.in);
			playerShot = userInput1.nextInt();
			Soccer.goalOrBlock(Soccer.playerShot,fieldPlayer.compShot);
			System.out.println("Your goals:" + yourGoals);
			System.out.println("Your opponent's goals:" + cGoals);
			}
		if (yourGoals > cGoals)
			{
			System.out.println("You won!");
			}
		else if (yourGoals < cGoals)
			{
			System.out.println("You lost.");
			}
		else
			{
			System.out.println("You tied... That's boring.");
			}
		}
	}
