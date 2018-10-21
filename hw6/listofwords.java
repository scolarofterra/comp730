package comp730;

import java.awt.List;

public class listofwords {
	 private static listofwords INSTANCE;
	 
	 public static listofwords getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new listofwords();
        }
         
        return INSTANCE;
        }
    private List wordlist;
    public void addword(String str) 
    {
    	wordlist.add(str);
    	
    	
    }
    public void removeword(String str) 
    {
    	wordlist.remove(str);
    }
    public String printlist() {
    	return wordlist.toString();
    }

}
