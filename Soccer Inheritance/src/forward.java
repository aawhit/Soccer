
public class forward extends fieldPlayer
	{
	protected static int fShot;
	protected static int fWhere;

	public forward(int s)
		{
		super(s);
		s = (int)(Math.random()*20)+71;
		}
	
	public static void forwardShot()
		{
		fShot = (int)(Math.random()*9);
		if (fShot==0)
			{
			fWhere = Soccer.goal[0][0];
			}
		else if (fShot == 1)
			{
			fWhere = Soccer.goal[1][0]; 
			}
		else if (fShot == 2)
			{
			fWhere = Soccer.goal[2][0];
			}
		else if (fShot == 3)
			{
			fWhere = Soccer.goal[0][1];
			}
		else if (fShot == 4)
			{
			fWhere = Soccer.goal[1][1];
			}
		else if (fShot == 5)
			{
			fWhere = Soccer.goal[2][1];
			}
		else if (fShot == 6)
			{
			fWhere = Soccer.goal[0][2];
			}
		else if (fShot == 7)
			{
			fWhere = Soccer.goal[1][2];
			}
		else if (fShot == 8)
			{
			fWhere = Soccer.goal[2][2];
			}
		}
    
	}
