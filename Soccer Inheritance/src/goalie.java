
public class goalie 
	{
    protected int goodHands;
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
     	break;
     	
     	case 1:
     	System.out.println("The goalie stayed in the middle.");
     	break;
     	
     	case 2:
     	System.out.println("The goalie dove to the right.");
     	}
     }
	}
