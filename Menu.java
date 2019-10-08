package practica1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
 
     
    public static void main(String[] args) {
    ArrayList<Book> list = new ArrayList<Book>();//esto es una lista
   
    Book book1 = new Book("Harry Potter y la piedra filosofal",
                "JK Rowling",
                "1997",
                "Bloomsbury"
               );  
    list.add(book1); //esto añade a la lista
    Book book2 = new Book("Harry Potter y la camara de los secretos",
            "JK Rowling",
            "1998",
            "Bloomsbury"
           );  
list.add(book2); 
Book book3 = new Book("Harry Potter y el prisionero de azkaban",
        "JK Rowling",
        "1999",
        "Bloomsbury"
       );  
list.add(book3); 
Book book4 = new Book("Harry Potter y el caliz de fuego",
        "JK Rowling",
        "2000",
        "Bloomsbury"
       );  
list.add(book4); 
Book book5 = new Book("Harry Potter y la orden el fénix",
        "JK Rowling",
        "2001",
        "Bloomsbury"
       );  
list.add(book5); 
Book book6 = new Book("Harry Potter y el príncipe mestizo",
        "JK Rowling",
        "2002",
        "Bloomsbury"
       );  
list.add(book6); 
Book book7 = new Book("Harry Potter y las reliquias de la muerte",
        "JK Rowling",
        "2003",
        "Bloomsbury"
       );  
list.add(book7); 
         
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
