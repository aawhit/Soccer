public class goalie extends Soccer
	{
    protected int goodHands;
    protected static int goaliePosition;
    public static int shot=1;
    public goalie(int gh)
    	{
    	gh = goodHands;
    	}
    
    public static void goalieSide()
     {
     int side = (int)(Math.random()*3);
     switch (side)
     	{
     	case 0:
     	System.out.println("The goalie dove to the left.");
     	int goalieLeft = (int)(Math.random()*3);
     	switch (goalieLeft)
     	 {
     	 case 0:
			 goaliePosition = goal[0][0];
			 break; 
     	 case 1:
     		 goaliePosition = goal[1][0];
     		 break;
     	 case 2:
     		 goaliePosition = goal[2][0];
     		 break;
     	 }
     	
     	if (shot == goaliePosition)
     		{
     		System.out.println("Your shot was blocked!");
     		}
     	else if ((shot = Goal[0][0] || shot=goal[2][0]) && goaliePosition = Goal[1][0]))
     		{
     		System.out.println("Shot may have been blocked");
     		}
     	else 
     		{
     		System.out.println("You scored!!");
     		}
     	break;
     	
     	case 1:
     	System.out.println("The goalie stayed in the middle.");
     	int goalieMiddle = (int)(Math.random()*3);
     	switch (goalieMiddle)
     	 {
     	 case 0:
			 goaliePosition = goal[0][1];
			 break; 
     	 case 1:
     		 goaliePosition = goal[1][1];
     		 break;
     	 case 2:
     		 goaliePosition = goal[2][1];
     		 break;
     	 }
     	if (shot == goaliePosition)
     		{
     		System.out.println("Your shot was blocked!");
     		}
     	else if ((shot = Goal[1] || shot=goal[7]) && goaliePosition = Goal[4]) )
     		{
     		System.out.println("Shot may have been blocked");
     		}
     	else 
     		{
     		System.out.println("You scored!!");
     		}
     	break;
     	
     	case 2:
     	System.out.println("The goalie dove to the right.");
     	int goalieRight = (int)(Math.random()*3);
     	switch (goalieMiddle)
     	 {
     	 case 0:
			 goaliePosition = goal[0][2];
			 break; 
     	 case 1:
     		 goaliePosition = goal[1][2];
     		 break;
     	 case 2:
     		 goaliePosition = goal[2][2];
     		 break;
     	 }
     	}
     }
	}
