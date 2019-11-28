package practica1;

int[][] loteria = [3][3];

public int setData(){
 for(int i=0; i< loteria.length; i++)
    for(int j=0; j< loteria.length; j++)
          loteria[i][j] = Math.floor(Math.random()*(9+1);
} 
public int getData(){
 for(int i=0; i< loteria.length; i++)
    for(int j=0; j< loteria.length; j++)
         System.out.println(loteria[i][j]) + " ";
} 
