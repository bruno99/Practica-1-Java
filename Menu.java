package practica1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

private Locale locale;
	private Messages messages;
	
	public Menu(Locale locale) {
		this.locale = locale;
		messages= new Messages(locale);
	}
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
		
		
		    
                //Aqui metes tu usuario (existe o no)
		System.out.ptinyln("1-Español \n 2-English \n 3-Francais"); 
		string u, p;
		Scanner user = new Scanner(System.in);
		System.out.ptinyln("("user", locale)");
		u =user.nextInt();
		System.out.ptinyln("("password", locale)");
		p=user.nextInt();
		for(int i=1; i>list4.size: i++){
			if u == list4.getName(user[i]){
			System.out.ptinyln("("utrue", locale)");
			int cuenta = 0;
			}
		}
		//Una vez se verifica el usuario, su bool de premium nos dirá si a la cuenta se le resta un 10%
		//Si no es premium se le ofrecerá la opción de pagar 20$ anuales (buscar funcion calendar para que cuente el tiempo
		//y hacer false el bool una vez transcurra el año de premium) añadidos a la cuenta final
		if (cuenta !=0){
		System.out.ptinyln("("ufalse", locale)");
			System.exit(0);
		}
		
		
		Scanner sn = new Scanner(System.in);
		boolean close = false;
		int option;  	  
		while(!close){

			System.out.println("1. Locale.getMessages ("option1", locale)"); //depende de la cantidad, añadir nuevo o añadir un +1 a la cantidad
			System.out.println("2. Locale.getMessages ("option2", locale)"); //funcion search que busque, tambien se usa en el 1 y el 4
			System.out.println("3. ("option3", locale)");
			System.out.println("4. ("option4", locale)"); //se fija en la cantidad y lo quita o le resta 1 a la cantidad
			System.out.println("5. ("option5", locale)");

			System.out.println("("option", locale)");
			option = sn.nextInt();

			switch(option){
			case 1: //Preguntar que tipo de producto y subdividir en categorías
				Scanner keyboard = new Scanner(System.in);
				System.out.println("("productoLista", locale)");
				for (int i=0; i < list.size(); i++)
					System.out.println(list.get(i).getData());
				int answer;
				answer = keyboard.nextInt();
				if (answer == 0) {
					System.out.println("("productoListaSi", locale) ");
					int in;                     
					in = keyboard.nextInt();
					int x;
					x = list.get(in-1).getAmount();
					list.get(in-1).setAmount(x+1);
				}
				else {
					String n, a, y,e;

					System.out.println("("nuevoProducto", locale)");
					System.out.println("("nombre", locale)\n");  
					n = keyboard.nextLine();
					System.out.println("("autor", locale)\n");  
					a = keyboard.nextLine();
					System.out.println("("ano", locale) \n");  
					y = keyboard.nextLine();
					System.out.println("("editorial", locale) \n");  
					e = keyboard.nextLine();
					Book bookk = new Book(n,a,y,e);
					list.add(bookk); 

				}
			       System.out.println("("precioPositivo", locale)"); 
					cuenta = cuenta-10;
					
				break;
			case 2://Preguntar que tipo de producto y subdividir en categorías
				System.out.println("("buscarProducto", locale)");            
				Scanner keyboard2 = new Scanner(System.in);                          
				int in;
				System.out.println("("buscando", locale)");  
				for (int i=0; i < list.size(); i++)
					System.out.println(list.get(i).getName());
				in = keyboard2.nextInt();
				System.out.println(list.get(in-1).getData());

				break;
			case 3://Preguntar que tipo de producto y subdividir en categorías para imprimir listas
				System.out.println("("listaProductos", locale)");

				for (int i=0; i < list.size(); i++)
					System.out.println(list.get(i).getData());

				break;
			case 4:   //Preguntar que tipo de producto y subdividir en categorías 	
				System.out.println("("sacarProducto", locale)");
				System.out.println("("sacando", locale)\n");
				for (int i=0; i < list.size(); i++)
					System.out.println(list.get(i).getData());
				Scanner keyboard3 = new Scanner(System.in);
				in = keyboard3.nextInt();
				int x;
				x= list.get(in-1).getAmount();
				if (x<1)
					System.out.println("("disponibilidad", locale)");
				else {
					list.get(in-1).setAmount(x-1);
					System.out.println("("compra", locale)");
					System.out.println(list.get(in-1).getName()); 
				}
					System.out.println("("precioNegativo", locale)");
					cuenta= cuenta-10;
				break;
			case 5:
				close=true;
				break;
			default:
				System.out.println("("fallo", locale)");
			}

		}

	}

}
