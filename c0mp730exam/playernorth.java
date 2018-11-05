package comp730;

public class playernorth implements commandinterface {
	
	String say;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		say = player.getInstance().xplus();
		System.out.println(say);
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
		say = player.getInstance().xmin();
		System.out.println(say);
	}

}
