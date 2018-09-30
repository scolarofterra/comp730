
public class Event {
	private int eventnumber;
	private int eventdata;
	
	public  int  geteventdata() {
		return eventdata;
	}
	public  int  geteventnumber() {
		return eventnumber;
	}
	public Event(int eventnumber, int eventdata) {
		super();
		this.eventnumber = eventnumber;
		this.eventdata = eventdata;
	}
	
}
