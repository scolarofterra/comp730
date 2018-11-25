package comp730;

import java.util.Stack;

public class moveinvoker implements commandinterface {
	public Stack<commandinterface> cmddo = new Stack<commandinterface>();

	
	public void execute() {
		// TODO Auto-generated method stub
		cmddo.peek().execute();
	}

	
	public boolean undo() {
		// TODO Auto-generated method stub
		
		cmddo.peek().undo();
		cmddo.pop();
		return cmddo.isEmpty();
	}
	public void setcommand(commandinterface cmb) {
		cmddo.push(cmb);
		
		
	}


}
