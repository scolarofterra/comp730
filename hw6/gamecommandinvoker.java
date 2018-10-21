package comp730;


import java.util.Stack;

public class gamecommandinvoker {
	
	public Stack<gamecommandinterface> cmddo = new Stack<gamecommandinterface>();
	public Stack<gamecommandinterface> cmdundo = new Stack<gamecommandinterface>();

	public void Execute() {
		// TODO Auto-generated method stub
		cmddo.peek().Execute();
	}



	
	public void undo() {
		// TODO Auto-generated method stub
		
		cmddo.peek().undo();
		cmdundo.push(cmddo.pop());
	}

	
	public void redo() {
		// TODO Auto-generated method stub
		cmdundo.peek().redo();
		cmddo.push(cmddo.pop());
	}
	public void setcommand(gamecommandinterface cmb) {
		cmddo.push(cmb);
		
		
	}

}
