		
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

		Movie movie1 = new Movie("Titanic", "James Cameron", "1998", 10, true,"20th century", "195", "Romance");

		list2.add(movie1);

		Movie movie2 = new Movie("Avenger:Endgame", "Anthony y Joe Russo", "2019", 10, true,"20th century",  "181", "Superheroes");

		list2.add(movie2);

		Movie movie3 = new Movie("Avatar", "James Cameron", "2009", 10, true,"20th century",  "162", "Ciencia Ficcion");

		list2.add(movie3);

		Movie movie4 = new Movie("Frozen", " Chris Buck", "2013", 10, true,"20th century",  "102", "Animacion");

		list2.add(movie4);

		//LISTA DE MUSICA

		ArrayList<Music> list3 = new ArrayList<Music>(); 

		Music music1 = new Music("Thriller", "Michael Jackson", "1982", 10, true,"Sony Music",  "42:19", "pop-rock");

		list3.add(music1);

		Music music2 = new Music("Back in black", "AC/DC", "1980", 10, true,"Sony Music", "41:57", "hard rock");

		list3.add(music2);

		Music music3 = new Music("Dark side of the moon", "Pink floyd", "1972", 10, true,"Sony Music", "42:59", "rock progresivo");

		list3.add(music3);

		Music music4 = new Music("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", "1967", 10, true,"Sony Music", "39:45", "pop-rock psicodelico");

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

		System.out.println("1-Español \n 2-English ");


		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle");
		System.out.println(messages.getString("user"));
		int cuenta = 0;

		/*
		String u, p;

		Scanner user = new Scanner(System.in);


		u =user.nextInt();

		System.out.println(messages.getString("password"));

		p=user.nextInt();

		for(int i=1; i>list4.size: i++){

			if u == list4.getName(user[i]){

			System.out.println(messages.getString("utrue"));


			}

		}

		//Una vez se verifica el usuario, su bool de premium nos dirá si a la cuenta se le resta un 10%

		//Si no es premium se le ofrecerá la opción de pagar 20$ anuales (buscar funcion calendar para que cuente el tiempo

		//y hacer false el bool una vez transcurra el año de premium) añadidos a la cuenta final


		if (cuenta !=0){

		System.out.println(messages.getString("ufalse"));

			System.exit(0);

		}

		 */	



		Scanner sn = new Scanner(System.in);

		boolean close = false;

		int option;  	  

		while(!close){



			System.out.println(messages.getString("option1")); //depende de la cantidad, añadir nuevo o añadir un +1 a la cantidad

			System.out.println(messages.getString("option2")); 

			System.out.println(messages.getString("option3"));//se fija en la cantidad y lo quita o le resta 1 a la cantidad


			System.out.println(messages.getString("option4")); 




			System.out.println(messages.getString("option"));
			option = sn.nextInt();



			switch(option){

			case 1: //Preguntar que tipo de producto y subdividir en categorías
				System.out.println(messages.getString("producto"));
				int answer;
				int answer2;

				Scanner keyboard = new Scanner(System.in);
				answer = keyboard.nextInt();
				switch(answer) {
				case 5://Book
					System.out.println(messages.getString("productoLista"));

					for (int i=0; i < list.size(); i++)

						System.out.println(list.get(i).getBData());


					answer2 = keyboard.nextInt();

					if (answer2 == 0) {

						System.out.println(messages.getString("productoListaSi"));
						int in;                     

						in = keyboard.nextInt();

						int x;

						x = list.get(in-1).getAmount();

						list.get(in-1).setAmount(x+1);

					}

					else {

						String n, a, y,e;


						System.out.println(messages.getString("nuevoproducto"));
						System.out.println(messages.getString("nombre"));
						n = keyboard.nextLine();

						System.out.println(messages.getString("autor"));
						a = keyboard.nextLine();

						System.out.println(messages.getString("ano"));
						y = keyboard.nextLine();

						System.out.println(messages.getString("editorial"));

						e = keyboard.nextLine();

						Book bookk = new Book(n,a,y,1,true,e);

						list.add(bookk); 



					}
					break;
				case 6: //Movie

					System.out.println(messages.getString("productoLista"));

					for (int i=0; i < list2.size(); i++)

						System.out.println(list2.get(i).getMoData());



					answer2 = keyboard.nextInt();

					if (answer2 == 0) {

						System.out.println(messages.getString("productoListaSi"));
						int in;                     

						in = keyboard.nextInt();

						int x;

						x = list2.get(in-1).getAmount();

						list2.get(in-1).setAmount(x+1);

					}

					else {

						String n, a, y,e,l,c;


						System.out.println(messages.getString("nuevoproducto"));
						System.out.println(messages.getString("nombre"));
						n = keyboard.nextLine();

						System.out.println(messages.getString("autor"));
						a = keyboard.nextLine();

						System.out.println(messages.getString("ano"));
						y = keyboard.nextLine();

						System.out.println(messages.getString("editorial"));

						e = keyboard.nextLine();
						System.out.println(messages.getString("longitud"));

						l = keyboard.nextLine();
						System.out.println(messages.getString("categoria"));

						c = keyboard.nextLine();

						Movie moviee = new Movie(n,a,y,1,true,e,l,c);

						list2.add(moviee); 

					}
					break;
				case 7: //Music
					System.out.println(messages.getString("productoLista"));

					for (int i=0; i < list3.size(); i++)

						System.out.println(list3.get(i).getMuData());



					answer2 = keyboard.nextInt();

					if (answer2 == 0) {

						System.out.println(messages.getString("productoListaSi"));
						int in;                     

						in = keyboard.nextInt();

						int x;

						x = list3.get(in-1).getAmount();

						list3.get(in-1).setAmount(x+1);

					}

					else {

						String n, a, y,e,l,c;


						System.out.println(messages.getString("nuevoproducto"));
						System.out.println(messages.getString("nombre"));
						n = keyboard.nextLine();

						System.out.println(messages.getString("autor"));
						a = keyboard.nextLine();

						System.out.println(messages.getString("ano"));
						y = keyboard.nextLine();

						System.out.println(messages.getString("editorial"));

						e = keyboard.nextLine();
						System.out.println(messages.getString("longitud"));

						l = keyboard.nextLine();
						System.out.println(messages.getString("categoria"));

						c = keyboard.nextLine();

						Movie moviee = new Movie(n,a,y,1,true,e,l,c);

						list2.add(moviee); 

						break;
					}



					System.out.println(messages.getString("precioPositivo"));
					cuenta = cuenta-10;



					break;

				case 2:

					System.out.println(messages.getString("listaProductos"));

					for (int i=0; i < list.size(); i++)

						System.out.println(list.get(i).getBData());
					for (int i=0; i < list2.size(); i++)

						System.out.println(list2.get(i).getMoData());

					for (int i=0; i < list3.size(); i++)

						System.out.println(list3.get(i).getMuData());



					break;

				case 3:
					System.out.println(messages.getString("producto"));
					int answer3;
					int answer4;

					Scanner keyboard2 = new Scanner(System.in);
					answer3 = keyboard2.nextInt();
					switch(answer3) {
					case 5://Book
						System.out.println(messages.getString("productoLista"));

						for (int i=0; i < list.size(); i++)

							System.out.println(list.get(i).getBData());


						answer4 = keyboard2.nextInt();

						if (answer4 == 0) {

							System.out.println(messages.getString("productoListaSi"));
							int in;                     

							in = keyboard2.nextInt();

							int x;
							if(list.get(in-1).getAmount()>0) {
								x = list.get(in-1).getAmount();

								list.get(in-1).setAmount(x-1);

							}
							else {
								System.out.println(messages.getString("disponibilidad"));
							}

						}else {
							System.out.println(messages.getString("disponibilidad"));

                                                        vector.add(list.get(in-1).getDataB);//AQUI METEMOS LA COMPRA A LA LISTA GENERICA QUE SERIA LA CUENTA

						}
							
						break;
					case 6: //Movie

						System.out.println(messages.getString("productoLista"));

						for (int i=0; i < list2.size(); i++)

							System.out.println(list2.get(i).getMoData());


						answer4 = keyboard2.nextInt();

						if (answer4 == 0) {

							System.out.println(messages.getString("productoListaSi"));
							int in;                     

							in = keyboard2.nextInt();

							int x;

							if(list2.get(in-1).getAmount()>0) {
								x = list2.get(in-1).getAmount();

								list2.get(in-1).setAmount(x-1);

							}
							else {
								System.out.println(messages.getString("disponibilidad"));
							}

						}else {
							System.out.println(messages.getString("disponibilidad"));



						}
				         vector.add(list2.get(in-1).getDataMo);//AQUI METEMOS LA COMPRA A LA LISTA GENERICA QUE SERIA LA CUENTA
						break;
					case 7: //Music
						System.out.println(messages.getString("productoLista"));

						for (int i=0; i < list3.size(); i++)

							System.out.println(list3.get(i).getMuData());


						answer4 = keyboard2.nextInt();

						if (answer4 == 0) {

							System.out.println(messages.getString("productoListaSi"));
							int in;                     

							in = keyboard2.nextInt();

							int x;

							if(list3.get(in-1).getAmount()>0) {
								x = list3.get(in-1).getAmount();

								list3.get(in-1).setAmount(x-1);

							}
							else {
								System.out.println(messages.getString("disponibilidad"));
							}

						}else {
							System.out.println(messages.getString("disponibilidad"));



						}
						vector.add(list3.get(in-1).getDataMu);//AQUI METEMOS LA COMPRA A LA LISTA GENERICA QUE SERIA LA CUENTA
						break;
						}







						System.out.println(messages.getString("precioNegativo"));

						cuenta= cuenta+10;
						break;

					case 4:  
						

						System.out.println("su cuenta es " ListG());	//IMPRIMO LA CUENTA DE GENERICOS
						
						System.out.println("Su lotería de Navidad de regalo es " loteria.getData(); //LA LOTERIA ES EL ARRAY MULTIDIMENSIONAL	
						
						System.out.println("El resultado de la loteria es " loteria.getGanadora(); //TE DICE SI HAS GANADO LA LOTERIA	   
								   
						close=true;

						break;






					default:

						System.out.println(messages.getString("fallo"));
					}



				}



			}



	}
}
