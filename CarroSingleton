package practica1;
import java.util.Vector;
public class CarroSingleton {

 private Vector<String> productos;
 
 private static CarroSingleton instancia = null;
 
 private CarroSingleton() {
 this.productos = new Vector<String>();
 };
 
 public static synchronized CarroSingleton getInstancia() {
 if (instancia == null)
 instancia = new CarroSingleton();
 return instancia;
 }
 public void añadeProducto(String producto) {
 this.productos.add(producto);
 }
 public String getProductos() {
 String productos = "";
 for (String p : this.productos)
 productos = productos + p + "\n";
 return productos;
 }
}
