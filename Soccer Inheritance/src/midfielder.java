
public class midfielder extends fieldPlayer
	{
	protected static int mShot;
	protected static int mWhere;

	public midfielder(int s)
		{
		super(s);
		}
	
	public static void midfieldShot()
		{
		mShot = (int)(Math.random()*9);
		if (mShot==0)
			{
			mWhere = Soccer.goal[0][0];
			}
		else if (mShot == 1)
			{
			mWhere = Soccer.goal[1][0];
			}
		else if (mShot == 2)
			{
			mWhere = Soccer.goal[2][0];
			}
		else if (mShot == 3)
			{
			mWhere = Soccer.goal[0][1];
			}
		else if (mShot == 4)
			{
			mWhere = Soccer.goal[1][1];
			}
		else if (mShot == 5)
			{
			mWhere = Soccer.goal[2][1];
			}
		else if (mShot == 6)
			{
			mWhere = Soccer.goal[0][2];
			}
		else if (mShot == 7)
			{
			mWhere = Soccer.goal[1][2];
			}
		else if (mShot == 8)
			{
			mWhere = Soccer.goal[2][2];
			}
		}

	}
