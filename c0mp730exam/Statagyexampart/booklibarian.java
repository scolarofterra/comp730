package Exampart2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class booklibarian {
	List<Bookinformation> booklist = new ArrayList<Bookinformation>();
	List<Bookinformation> sortedlist = new ArrayList<Bookinformation>();
	
	public void setSortMethod (String type)
	{
		String stype = type;
		switch(stype) 
		{
			case "Author":
				sortedlist = Collections.sort(booklist, sortbook.BookthrComparator);
				break;
			case "Title":
				sortedlist = Collections.sort(booklist, sortbook.BookttlComparator);
				break;
			case "Year":
				sortedlist = Collections.sort(booklist, sortbook.BookyrpblshdComparator);
				break;
			case "Summary":
				sortedlist = Collections.sort(booklist, sortbook.BooksmmrComparator);
				break;
		
		}
		
	}
	
	public void addbook(Bookinformation book) 
	{
		booklist.add(book);
	}
	public String printer() 
	{    String prtlst;
		if(sortedlist[0] != null) {
			for(Bookinformation book : sortedlist) 
			{
				prtlst = prtlst + book.returnttl() + " " + book.returnthr() + " " + book.returnsmmr() + " " book.returnyrpblshd() + \n;
			}
		}
		else {for(Bookinformation book : sortedlist) 
		{
			prtlst = prtlst + book.returnttl() + " " + book.returnthr() + " " + book.returnsmmr() + " " book.returnyrpblshd() + \n;
		}}
		return prtlst;
	}

}
