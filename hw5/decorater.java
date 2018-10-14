
public class decorater {
	
	String mystring;
	
	public String getMadLibsString() 
	{
		return mystring;
	}

	public decorater(String mystring) {
		
		this.mystring = mystring;
	}

	public void redecorater(String output) {
		// TODO Auto-generated method stub
		mystring = output;
	}

	
	
	

}
