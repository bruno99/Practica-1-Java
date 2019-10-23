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
	public String getMoData() {
return "Name: " + this.name + "\t" +
"Author: " + this.author + "\t" +
"Year: " + this.year + "\t" +
"Category: " + this.category + "\t" +
"Lenght: " + this.lenght + "\t" +
"Number of movies available: " + this.amount;

}
}
	
