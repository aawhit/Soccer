
public class runner
	{

	public static void main(String[] args)
		{
		Soccer.printGoal();
		fieldPlayer.character();
		fieldPlayer.pickComp();
		goalie.goalieSide();
		Soccer.goalOrBlock(Soccer.playerShot,fieldPlayer.compShot);
		}

	}
