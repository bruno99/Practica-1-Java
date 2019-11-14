package practica1;



public class Book extends Product {



 String editorial;



public Book(String name,

		   String author,

		   String year,

		   int amount,

		   boolean available,

           String editorial

   ) {

super(name, author, year, amount, available);

this.editorial= editorial;

}

public String getEditorial() {

	 return this.editorial;

	 }

public String getBData() {

return "Name: " + this.name + "\t" +

"Author: " + this.author + "\t" +

"Year: " + this.year + "\t" +

"Editorial: " + this.editorial + "\t" +

"Number of books available: " + this.amount;



}

}
