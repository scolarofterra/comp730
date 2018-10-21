package comp730;

public class adddeletetest {
	addcommand addcmd = new addcommand("test");
	addcmd.Execute();
	addcmd.undo();
	addcmd.redo();
	
	deletecomand delcmd = new deletecomand("test");
	delcmd.Execute();
	delcmd.undo();
	delcmd.redo();

}
