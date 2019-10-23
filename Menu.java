package practica1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


	public static void main(String[] args) {
		//LISTA DE LIBROS
		ArrayList<Book> list = new ArrayList<Book>();
		Book book1 = new Book("Harry Potter y la piedra filosofal","JK Rowling", "1997",10, true,"Bloomsbury" );  
		list.add(book1); 
		Book book2 = new Book("Harry Potter y la camara de los secretos","JK Rowling","1998",10, true,"Bloomsbury");  
		list.add(book2); 
		Book book3 = new Book("Harry Potter y el prisionero de azkaban","JK Rowling","1999",10, true,"Bloomsbury");  
		list.add(book3); 
		Book book4 = new Book("Harry Potter y el caliz de fuego","JK Rowling","2000",10, true,"Bloomsbury");  
		list.add(book4); 

		// LISTA DE PELICULAS
		ArrayList<Movie> list2 = new ArrayList<Movie>(); 
		Movie movie1 = new Movie("Titanic", "James Cameron", "1998", 10, true, "195", "Romance");
		list2.add(movie1);
		Movie movie2 = new Movie("Avenger:Endgame", "Anthony y Joe Russo", "2019", 10, true, "181", "Superheroes");
		list2.add(movie2);
		Movie movie3 = new Movie("Avatar", "James Cameron", "2009", 10, true, "162", "Ciencia Ficcion");
		list2.add(movie3);
		Movie movie4 = new Movie("Frozen", " Chris Buck", "2013", 10, true, "102", "Animacion");
		list2.add(movie4);
		//LISTA DE MUSICA
		ArrayList<Music> list3 = new ArrayList<Music>(); 
		Music music1 = new Music("Thriller", "Michael Jackson", "1982", 10, true, "42:19", "pop-rock");
		list3.add(music1);
		Music music2 = new Music("Back in black", "AC/DC", "1980", 10, true, "41:57", "hard rock");
		list3.add(music2);
		Music music3 = new Music("Dark side of the moon", "Pink floyd", "1972", 10, true, "42:59", "rock progresivo");
		list3.add(music3);
		Music music4 = new Music("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", "1967", 10, true, "39:45", "pop-rock psicodelico");
		list3.add(music4); 
		
		//LISTA DE USUARIOS
		ArrayList<User> list4 = new ArrayList<User>();
		User user1 = new User("Bruno ", "Bruno99", "Bnebrija", "678563787", true);
		list4.add(user1);
		User user2 = new User("Agustina ", "Agus99", "Anebrija", "663748926", false);
		list4.add(user2);
		User user3 = new User("Rocio ", "Ro99", "Rnebrija", "609897654", false);
		list4.add(user3);
		
		//AQUI ABAJO TENGO QUE EDITAR POR LAS HERENCIAS Y METER EL USER
		Scanner sn = new Scanner(System.in);
		boolean close = false;
		int option;      

		while(!close){

			System.out.println("1. New book"); //depende de la cantidad, añadir nuevo o añadir un +1 a la cantidad
			System.out.println("2. Check 1 book"); //funcion search que busque, tambien se usa en el 1 y el 4
			System.out.println("3. Check book list");
			System.out.println("4. Take book out (if available)"); //se fija en la cantidad y lo quita o le resta 1 a la cantidad
			System.out.println("5. Close");

			System.out.println("Write your option");
			option = sn.nextInt();

			switch(option){
			case 1:
				Scanner keyboard = new Scanner(System.in);
				System.out.println("Is your book already in our book list? (Yes=0; No=1)");
				for (int i=0; i < list.size(); i++)
					System.out.println(list.get(i).getData());
				int answer;
				answer = keyboard.nextInt();
				if (answer == 0) {
					System.out.println("Which one? (Write the order number) ");
					int in;                     
					in = keyboard.nextInt();
					int x;
					x = list.get(in-1).getAmount();
					list.get(in-1).setAmount(x+1);
				}
				else {
					String n, a, y,e;

					System.out.println("New book");
					System.out.println("Name: \n");  
					n = keyboard.nextLine();
					System.out.println("Author: \n");  
					a = keyboard.nextLine();
					System.out.println("Year: \n");  
					y = keyboard.nextLine();
					System.out.println("Editorial: \n");  
					e = keyboard.nextLine();
					Book bookk = new Book(n,a,y,e);
					list.add(bookk); 

				}
				break;
			case 2:
				System.out.println("Check 1 book");            
				Scanner keyboard2 = new Scanner(System.in);                          
				int in;
				System.out.println("What book do you want to check?");  
				for (int i=0; i < list.size(); i++)
					System.out.println(list.get(i).getName());
				in = keyboard2.nextInt();
				System.out.println(list.get(in-1).getData());

				break;
			case 3:
				System.out.println("Check book list");

				for (int i=0; i < list.size(); i++)
					System.out.println(list.get(i).getData());

				break;
			case 4:              	
				System.out.println("Take book out (if available)");
				System.out.println("What book do you want?(write number of list)\n");
				for (int i=0; i < list.size(); i++)
					System.out.println(list.get(i).getData());
				Scanner keyboard3 = new Scanner(System.in);
				in = keyboard3.nextInt();
				int x;
				x= list.get(in-1).getAmount();
				if (x<1)
					System.out.println("Not available");
				else {
					list.get(in-1).setAmount(x-1);
					System.out.println("Thanks for taking ");
					System.out.println(list.get(in-1).getName()); 
				}
				break;
			case 5:
				close=true;
				break;
			default:
				System.out.println("only numbers between 1 and 5");
			}

		}

	}

}
