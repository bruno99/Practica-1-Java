package practica1;

public class Book {
 String name;
 String author;
 String year;
 String editorial;
 int amount;
 boolean available;


public Book(String name,
   String author,
   String year,
   String editorial
   ) {
this.name = name;
this.author = author;
this.year = year;
this.editorial= editorial;
this.amount = 1;
this.available = true;
}
public String getName() {
return this.name;
}
public String getAuthor() {
return this.author;
}
public String getYear() {
return this.year;
}
public String getEditorial() {
return this.editorial;
}
public int getAmount() {
return this.amount;
}
public void setAmount(int amount) {
this.amount = amount;
}
public boolean getAvailable() {
return this.available;
}
public void setAvailable(boolean available) {
	if (this.amount > 0)		
this.available = true;
	else {
		this.available = false;
	}	
}
public String getData() {
return "Name: " + this.name + "\t" +
"Author: " + this.author + "\t" +
"Year: " + this.year + "\t" +
"Editorial: " + this.editorial + "\t" +
"Number of books available: " + this.amount;

}

}
