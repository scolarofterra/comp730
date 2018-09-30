import java.util.List;
import java.util.Random;

public class PublisherImplamentation {
	static List <Observer> subscriber= new List<Observer>();
	static Observer odd;
	Observer even;
	Observer three;
	private int threeod;
	private static int oddod;
	public void runSimulation() 
	{
		subscriber.add(odd);
		subscriber.add(even);
		subscriber.add(three);
		
		Random ran = new Random();
		int runnum;
		int ticket;
		for(int i = 0 ; i < 200 ; i++)
		{
			
			ticket = i +1;
			runnum = ran.nextInt(5000)+1;
			Event E = generateevent(ticket,runnum);
			notifyobserver(E);
			if (threeod < 6) {
				PublisherInterface.removeobserver(three);
			}
			if (oddod < 20) {
				PublisherInterface.removeobserver(odd);
			}
			if (ticket == 40 ||	ticket == 80 || ticket == 120 || ticket == 160 || ticket == 200) {
				if(threeod < 6) {
					threeod = 0;
					subscriber.add(three);
				}
				if(oddod < 20) 
				{
					oddod = 0;
					subscriber.add(odd);
				}
			}	
		} 
	}
	private Event generateevent(int number, int data) 
	{ 
		Event E = new Event(number, data);
		return E;
	}
	
	private void notifyobserver(Event E) 
	{
		PublisherInterface.notifyobservers(E);
	}
	
	public static void threeobserver(Event E)
	{
		if(subscriber.contains(odd)) {
			if (odd.notifyobserver(0, E.geteventdata() % 3){	
				System.out.println("Event event.getNumber() is a three: event.getData()");
				threeod = theeod+1;
			}	
			}
	}
	public static void oddobserver(Event E)
	{
		if(subscriber.contains(odd)) {
			if (odd.notifyobserver(1, E.geteventdata() % 2){	
				System.out.println("Event event.getNumber() is odd: event.getData()");
				oddod = oddod+1;
			}	
			}
	}
	public static void evenobserver(Event E)
	{
		if(subscriber.contains(odd)) {
			if (odd.notifyobserver(0, E.geteventdata() % 2){	
				System.out.println("Event event.getNumber() is even: event.getData()");
				
			}	
			}
	}

}
