package practica1;

public class Bancoout extends Cuenta {
 private Cuenta cuenta;
 private int transacciones;
 private double importe;
 public Retiro(Cuenta cuenta, int transacciones, double importe) {
 this.cuenta = cuenta;
 this.transacciones = transacciones;
 this.importe = importe;
 }
 public void run() {
 for(int i = 1; i <= this.transacciones; i++) {
 this.cuenta.retiro(this.importe); 
 }
 }
}
