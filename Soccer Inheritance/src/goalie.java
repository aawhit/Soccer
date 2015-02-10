public class goalie extends Soccer
	{
    protected int goodHands;
    protected static int goaliePosition;
    static int side = (int)(Math.random()*3);
    public goalie(int gh)
    	{
    	gh = goodHands;
    	goodHands = (int)(Math.random()*40)+61;
    	}
    
    public static void goalieSide()
     {
     switch (side)
     	{
     	case 0:
     		int goalieLeft = (int)(Math.random()*3);
     		switch (goalieLeft)
     			{
     			case 0:
     			goaliePosition = goal[0][0];
     			System.out.println("The goalie dove to the top left.");
     			break; 
     			case 1:
     			goaliePosition = goal[1][0];
     			System.out.println("The goalie dove to the left and in the middle.");
     			break;
     			case 2:
     			goaliePosition = goal[2][0];
     			System.out.println("The goalie dove to the bottom left.");
     			break;
     			}
     		break;
     	
     	case 1:
     		int goalieMiddle = (int)(Math.random()*3);
     		switch (goalieMiddle)
     			{
     			case 0:
     			goaliePosition = goal[0][1];
     			System.out.println("The goalie jumped up in the middle.");
     			break; 
     			case 1:
     			goaliePosition = goal[1][1];
     			System.out.println("The goalie stayed in the center of the goal.");
     			break;
     			case 2:
     			goaliePosition = goal[2][1];
     			System.out.println("The goalie stayed in the middle and dove down.");
     			break;
     			}
     		break;
     	
     	case 2:
     		int goalieRight = (int)(Math.random()*3);
     		switch (goalieRight)
     			{
     			case 0:
     			goaliePosition = goal[0][2];
     			System.out.println("The goalie dove to the top right.");
     			break; 
     			case 1:
     			goaliePosition = goal[1][2];
     			System.out.println("The goalie dove to the middle right.");
     			break;
     			case 2:
     			goaliePosition = goal[2][2];
     			System.out.println("The goalie dove to the bottom right.");
     			break;
     			}
     		
     	}
     }
	}
