package comp730;

public interface gamecommandinterface {
	public default void Execute() {}
	
	public default void undo() {}
	
	public default void redo() {}

}
