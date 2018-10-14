import java.util.Random;

public class nouns {
	private String noun [];
	private int indexintoarray;
	public	decorater mlDecorator = new decorater(null);
	
	public String NounReplacementDecorator(String input)
	{
		
		Random rand = new Random();
		indexintoarray = 0;
		String output=null;
		String words [] = input.split(" ");
		
		for( String word : words)
		{
			if(word == "<noun>") {
				indexintoarray = rand.nextInt(15);
				
				word = noun[indexintoarray];
			}
			output = output + " " + word;
		}
		mlDecorator.redecorater(output);
		return output;
	}

	public nouns(decorater mlDecorator) {
		
		this.mlDecorator = mlDecorator;
		noun[0] = "dog";
		noun[1] = "robot";
		noun[2] = "xenomorph";
		noun[3] = "banna";
		noun[4] = "minion Dave";
		noun[5] = "Chick fil a";
		noun[6] = "Dragon";
		noun[7] = "Knight";
		noun[8] = "subway";
		noun[9] = "gundam";
		noun[10] = "skyscraper";
		noun[11] = "sowrdfish";
		noun[12] = "cat";
		noun[13] = "spear";
		noun[14] = "sonic screwdriver";
	}
	
	
	

}
