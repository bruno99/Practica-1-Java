package practica1;

public class Music extends Product {
 
 String lenght;
 String genre;
 


public Music(String name,
		   String author,
		   String year,
		   int amount,
		   boolean available,
           String editorial, 
           String lenght,
           String genre
   ) {
super(name, author, year, amount, available);
this.lenght= lenght;
this.genre = genre;
}
public String getLenght() {
	 return this.lenght;
	 }
public String getGenre() {
	 return this.genre;
	 }
	 public String getMoData() {
return "Name: " + this.name + "\t" +
"Author: " + this.author + "\t" +
"Year: " + this.year + "\t" +
"Genre: " + this.genre + "\t" +
"Lenght: " + this.lenght + "\t" +
"Number of albums available: " + this.amount;

}

}
	
