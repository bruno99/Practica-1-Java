package practica1;
import java.util.Locale;

import java.util.ResourceBundle;
import java.util.Scanner;



public class Internalization {
	static Scanner sn = new Scanner(System.in);
    private static Locale locale;
    static Locale esLocale = new Locale("es", "ES");
    static Locale enLocale = new Locale("en", "US");
	static Locale enLocale = new Locale("jp", "JP");
	
   

    
    public static Locale setLocale() {
    	
    	System.out.println(" 1. English.\n 2. Español \N 3. Japonés");
    	int option = sn.nextInt();
    	switch(option) {
    		case 1:
    			locale = Internalization.enLocale;
    			break;
    		case 2:
    			locale = Internalization.esLocale;
    			break;
		case 3:
			locale = Internalization.jpLocale;
  
    		default:
    			locale = Internalization.esLocale;
    	}  
    	return locale;
    }

    public static String getString(String key) {
        return ResourceBundle.getBundle("MessagesBundle", locale).getString(key);
    }
}
