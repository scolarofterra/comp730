package comp730;

public class deletecomand implements gamecommandinterface {
	private String Mystring;
	

	public deletecomand(String mystring) {
		
		Mystring = mystring;
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		listofwords.getInstance().removeword(Mystring);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		listofwords.getInstance().addword(Mystring);
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		Execute();
	}
	
	

}
