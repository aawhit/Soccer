
public class defender extends fieldPlayer
	{
	protected static int dShot;
	protected static int dWhere;

	public defender(int s, int dw)
		{
		super(s);
		
		}
	
	public static void defenderShot()
		{
		dShot = (int)(Math.random()*9);
		if (dShot==0)
			{
			dWhere = Soccer.goal[0][0];
			}
		else if (dShot == 1)
			{
			dWhere = Soccer.goal[1][0]; 
			}
		else if (dShot == 2)
			{
			dWhere = Soccer.goal[2][0];
			}
		else if (dShot == 3)
			{
			dWhere = Soccer.goal[0][1];
			}
		else if (dShot == 4)
			{
			dWhere = Soccer.goal[1][1];
			}
		else if (dShot == 5)
			{
			dWhere = Soccer.goal[2][1];
			}
		else if (dShot == 6)
			{
			dWhere = Soccer.goal[0][2];
			}
		else if (dShot == 7)
			{
			dWhere = Soccer.goal[1][2];
			}
		else if (dShot == 8)
			{
			dWhere = Soccer.goal[2][2];
			}
		}
    
	}
