package practica1;

public class Movie extends Product {
 
 String lenght;
 String category;


public Movie(String name,
		   String author,
		   String year,
		   int amount,
		   boolean available,
           String editorial, 
           String lenght,
           String category
   ) {
super(name, author, year, amount, available);
this.lenght= lenght;
this.category = category;
}
public String getLenght() {
	 return this.lenght;
	 }

public String getCategory() {
	 return this.category;
	 }
}
	
