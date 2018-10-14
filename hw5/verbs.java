import java.util.Random;

public class verbs {
	private String verb [];
	private int indexintoarray;
	public decorater mlDecorator = new decorater(null);
	
	public String VerbReplacementDecorator(String input)
	{
		Random rand = new Random();
		indexintoarray = 0;
		String output = null;
		String words [] = input.split(" ");
		
		for( String word : words)
		{
			if(word == "<verb>") {
				indexintoarray = rand.nextInt(15);
				
				word = verb[indexintoarray];
			}
			output = output + " " + word;
		}
		mlDecorator.redecorater(output);
		return output;
	}

	public verbs(decorater mlDecorator) {
		
		this.mlDecorator =  mlDecorator;
		
		verb[0] = "run";
		verb[1] = "throw";
		verb[2] = "catch";
		verb[3] = "try";
		verb[4] = "find";
		verb[5] = "eat";
		verb[6] = "sprint";
		verb[7] = "fly";
		verb[8] = "read";
		verb[9] = "write";
		verb[10] = "turn";
		verb[11] = "jump";
		verb[12] = "view";
		verb[13] = "buy";
		verb[14] = "ride";
	} 
	


}
