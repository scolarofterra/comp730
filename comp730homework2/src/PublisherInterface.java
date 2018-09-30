
public class PublisherInterface {
	public static void registerobserver(Observer ob) 
	{
		PublisherImplamentation.subscriber.add(ob);
	}
	public static void removeobserver(Observer ob) {
		PublisherImplamentation.subscriber.remove(ob);
	}
	public static void notifyobservers(Event E) 
	{
		PublisherImplamentation.threeobserver(E);
		PublisherImplamentation.oddobserver(E);
		PublisherImplamentation.evenobserver(E);
	}

}
