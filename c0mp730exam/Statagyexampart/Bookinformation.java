package Exampart2;

public class Bookinformation {
	private String Author, Title, YearPublished, Summary;

	public Bookinformation(String author, String title, String yearPublished, String summary) {
		Author = author;
		Title = title;
		YearPublished = yearPublished;
		Summary = summary;
	}
	public String returnthr() 
	{
		return Author;
	}
	
	public String returnttl() 
	{
		return Title;
	}
	public String returnyrpblshd() 
	{
		return YearPublished;
	} 
	
	public String returnsmmr() 
	{
		return Summary;
	}
	

}
