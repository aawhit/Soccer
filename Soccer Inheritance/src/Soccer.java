
public class Soccer
	{
	static int [][] goal = {{1,2,3},{4,5,6},{7,8,9}};
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
		switch (goalie.side)
		{
			case 0:
				if (ps == goalie.goaliePosition)
					{
					System.out.println("Your shot was blocked!");
					}
				else if ((ps == goal[0][0] || ps==goal[2][0]) && goalie.goaliePosition == goal[1][0])
					{
					System.out.println("Shot may have been blocked");
					}
				else 
					{
					System.out.println("You scored!!");
					}
				break;
			case 1:
				if (ps == goalie.goaliePosition)
					{
					System.out.println("Your shot was blocked!");
					}
				else if ((ps == goal[0][1] || ps == goal[2][1]) && goalie.goaliePosition == goal[1][1])
					{
					System.out.println("Shot may have been blocked");
					}
				else 
					{
					System.out.println("You scored!!");
					}
					break;
			case 2:
				if (ps == goalie.goaliePosition)
					{
					System.out.println("Your shot was blocked!");
					}
				else if ((ps == goal[0][2] || ps == goal[2][2]) && goalie.goaliePosition == goal[1][2])
					{
					System.out.println("Shot may have been blocked");
					}
				else 
					{
					System.out.println("You scored!!");
					}
				}
		
		switch (goalie.side)
		{
			case 0:
				if (cs == goalie.goaliePosition)
					{
					System.out.println("Your shot was blocked!");
					}
				else if ((cs == goal[0][0] || cs==goal[2][0]) && goalie.goaliePosition == goal[1][0])
					{
					System.out.println("Shot may have been blocked");
					}
				else 
					{
					System.out.println("You scored!!");
					}
				break;
			case 1:
				if (cs == goalie.goaliePosition)
					{
					System.out.println("Your shot was blocked!");
					}
				else if ((cs == goal[0][1] || cs == goal[2][1]) && goalie.goaliePosition == goal[1][1])
					{
					System.out.println("Shot may have been blocked");
					}
				else 
					{
					System.out.println("You scored!!");
					}
					break;
			case 2:
				if (cs == goalie.goaliePosition)
					{
					System.out.println("Your shot was blocked!");
					}
				else if ((cs == goal[0][2] || cs == goal[2][2]) && goalie.goaliePosition == goal[1][2])
					{
					System.out.println("Shot may have been blocked");
					}
				else 
					{
					System.out.println("You scored!!");
					}
		}
	}
	}
