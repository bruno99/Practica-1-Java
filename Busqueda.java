public class Busqueda implements InterfaceBusqueda {


 private String [] name;
 private Object [] author;
 public BusquedaSimple(String [] name, Object [] author) {
 this.name = name;
 this.author = author;
 }
 @Override
 public Object existe(String name) {
 for (int i=0; i < name.length; i++)
 if (name[i].equals(name))
 return author[i];
 return null;
 }
}
