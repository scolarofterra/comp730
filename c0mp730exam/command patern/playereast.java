package comp730;

public class playereast implements commandinterface {
	String say;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		 say = player.getInstance().ymin();
		System.out.println(say);
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		 say = player.getInstance().yplus();
		System.out.println(say);
		return false;
	}

}
