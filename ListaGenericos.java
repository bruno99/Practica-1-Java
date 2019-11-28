package practica1;

public class ListaGenericos <T extends Generico<T>>{
private <T> vector;

public Lista (T[] vector){
this.vector = vector;
}
public T ListG(){
T ListG = this.vector[0];

for(int i=1; i<this.vector.length; i++){
System.out.println(this.vector[i].getValor());
}

