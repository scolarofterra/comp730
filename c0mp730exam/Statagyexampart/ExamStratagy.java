package Exampart2;

public class ExamStratagy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		booklibarian lib = new booklibarian();
		Bookinformation dt = new Bookinformation("Steven King", "The Dark tower", "1982", "Roland of giliaed seeks the dark tower");
		lib.addbook(dt);
		Bookinformation drcr = new Bookinformation("Travis Deschenes", "Dragon core", "2020", "when a evil knight from the fabled round table attacks the world"
				+ "with a army on gaint beasts only a secrative organization and the last decendents of the kights of the round table  stand between"
				+ " humanaty and curtain doom.");
		lib.addbook(drcr);
		Bookinformation brsrk = new Bookinformation("Kentaro Miura", "Berserk", "1990", "The swords man guts seeks to kill the deamon Griffith");
		lib.addbook(brsrk);
		Bookinformation CHA = new Bookinformation("Travis Deschenes", "Commedic heroic Adventure", "2024", "A scifi fantasy adventure were anything can happen");
		lib.addbook(CHA);
		Bookinformation tld = new Bookinformation("Travis Deschenes", "the last detective", "2020",
				"the detective Dean Thornwall hunts for the elusive Skylar Colfax");
		lib.addbook(tld);
		Bookinformation hrdbs = new Bookinformation("Edward Stratemeyer", "the hardy boys", "1927", "two detective brothers solve mistoryies");
		lib.addbook(hrdbs);
		Bookinformation ESV = new Bookinformation("Crossway Bibles", " English Standard Version Bible", "2001", "bible translation by crossway bibles");
		lib.addbook(ESV);
		Bookinformation ckbk = new Bookinformation("Dorothy Deschenes", "family cook book", "????", "My grandmother's cook book");
		lib.addbook(ckbk);
		Bookinformation fake = new Bookinformation("faky fakes", " fake of fakes", "9999", "fakest faky fake");
		lib.addbook(fake);
		Bookinformation HDH = new Bookinformation("DHDBFBFHFI fhkfhsisf", "fhksisf wwiubfb", "1990", "kzhnghbgajbgiaih agjabgihaihajbdka");
		lib.addbook(HDH);
		Bookinformation ddpl = new Bookinformation("stan lee", "Deadpool", "1980", "deadpools story");
		lib.addbook(ddpl);
		Bookinformation fake2 = new Bookinformation("faky fakes", " fake of fakes2", "9999", "fakest faky fake");
		lib.addbook(fake2);
		Bookinformation fake3 = new Bookinformation("faky fakes", " fake of fakes3", "9999", "fakest faky fake");
		lib.addbook(fake3);
		Bookinformation SOI = new Bookinformation("H P Lovecraft", "Shadow over insmith", "2001", "Eltrich horrors in the town of insmith");
		lib.addbook(SOI);
		Bookinformation ltr = new Bookinformation("J R R Tolkin", "lord of the rings", "1954", "quest to destroy the one ring");
		lib.addbook(ltr);
		Bookinformation sil = new Bookinformation("J R R Tolkin", " silmorilion", "1977", "Story of midlearths history");
		lib.addbook(sil);
		
		lib.printer();
		
		lib.setSortMethod("Author");
		lib.printer();
		
		lib.setSortMethod("Title");
		lib.printer();
		
		lib.setSortMethod("YearPublished");
		lib.printer();
		
		lib.setSortMethod("Summary");
		lib.printer();
	
	
	

	}

}
