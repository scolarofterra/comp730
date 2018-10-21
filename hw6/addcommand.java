package comp730;

public class addcommand implements gamecommandinterface {
	private String Mystring;

	public addcommand(String mystring) {
		
		Mystring = mystring;
	}

	@Override
	public void Execute() {
		
		listofwords.getInstance().addword(Mystring);
	}

	@Override
	public void undo() {
		
		listofwords.getInstance().removeword(Mystring);
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		Execute();
	}
	

}
