package comp730;

public class player {
	private static player INSTANCE;
	 
	 public static player getInstance() {
       if(INSTANCE == null) {
           INSTANCE = new player();
       }
        
       return INSTANCE; 
       }
	 int x; 
	 int y;
	 String facing;
	 public String xplus() {
		 x=x+1;
		 facing = "north" ; 
		 return("Facing: " + facing + " " + x + " " +y);
	 }
	 public String xmin() {
		 x=x-1;
		 facing = "south" ;
		 return("Facing: " + facing + " " + x + " " +y);
	 }
	 public String yplus() {
		y=y+1;
		 facing = "west" ;
		 return("Facing: " + facing + " " + x + " " +y);
	 }
	 public String ymin() {
		y=y-1;
		 facing = "east" ;
		 return("Facing: " + facing + " " + x + " " +y);
	 }

}
