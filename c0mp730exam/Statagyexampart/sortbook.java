package Exampart2;

import java.util.Comparator;


public class sortbook {
	
	
	public static Comparator<Bookinformation> BookttlComparator = new Comparator<Bookinformation>() {

		public int compare(Bookinformation s1, Bookinformation s2) {
		   String BookName1 = s1.returnttl().toUpperCase();
		   String BookName2 = s2.returnttl().toUpperCase();

		   
		   return BookName1.compareTo(BookName2);

		   
	    	}
		};
		public static Comparator<Bookinformation> BookthrComparator = new Comparator<Bookinformation>() {

			public int compare(Bookinformation s1, Bookinformation s2) {
			   String BookName1 = s1.returnthr().toUpperCase();
			   String BookName2 = s2.returnthr().toUpperCase();

			   
			   return BookName1.compareTo(BookName2);

			   
		    	}
			};
			public static Comparator<Bookinformation> BooksmmrComparator = new Comparator<Bookinformation>() {

				public int compare(Bookinformation s1, Bookinformation s2) {
				   String BookName1 = s1.returnsmmr().toUpperCase();
				   String BookName2 = s2.returnsmmr().toUpperCase();

				   
				   return BookName1.compareTo(BookName2);

				   
			    	}
				};
				public static Comparator<Bookinformation> BookyrpblshdComparator = new Comparator<Bookinformation>() {

					public int compare(Bookinformation s1, Bookinformation s2) {
					   String BookName1 = s1.returnyrpblshd().toUpperCase();
					   String BookName2 = s2.returnyrpblshd().toUpperCase();

					   
					   return BookName1.compareTo(BookName2);

					   
				    	}
					};

}
