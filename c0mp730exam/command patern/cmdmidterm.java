package comp730;

import java.util.Random;

public class cmdmidterm {

	public static void main(String[] args) {
		moveinvoker mover = new moveinvoker();
		Random ran = new Random();
		// TODO Auto-generated method stub
		boolean reverse = true;
		int i=0;
		while( i<100 ) 
		{
			i++;
			int x = ran.nextInt(4)+1;
			switch(x) 
			{
			case 1:
				playernorth north = new playernorth();
				mover.setcommand(north);
				mover.execute();
			case 2:
				playereast east = new playereast();
				mover.setcommand(east);
				mover.execute();
			case 3:
				playersouth south = new playersouth();
				mover.setcommand(south);
				mover.execute();
			case 4:
				playerwest west = new playerwest();
				mover.setcommand(west);
				mover.execute();
			
			}
			if (i==100) {
				reverse = false;
			}
			
		}
		while (reverse == false) 
		{
			mover.undo();
		}

	}

}
