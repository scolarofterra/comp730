package comp730;

import java.util.Scanner;

public class HW6run {

	public static void main(String[] args) {
		gamecommandinvoker gamer = new gamecommandinvoker();
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in); 
		
		while (true)
		{
			System.out.println("Command:");
			String entry = reader.nextLine().toString();
			String word = "";
			String cmd ="fake command";
			String[] s = entry.split(" ");
			for(String g : s)
			{
				if(g == "add" || g == "delete" || g == "undo" || g == "redo" || g == "quit") 
				{
					cmd = g;
				}
				else
				{
					word = word + g + " ";
				}
			} 
			switch(cmd)
			{
				case "add" :
					addcommand addcmd = new addcommand(word);
					gamer.setcommand(addcmd);
					gamer.Execute();
					
				case "delete":
					deletecomand delcmd = new deletecomand(word);
					gamer.setcommand(delcmd);
					gamer.Execute();
				case "undo":
					gamer.undo();
				case "redo":
					gamer.redo();
				case "quit":
					break;
				default: 
	                System.out.println("Command not recognized"); 
				
					
					
				
			}
		}

	}

	

}
