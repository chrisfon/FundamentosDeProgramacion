/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author ulacit
 */
public class Burbuja {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random rand=new Random();
      int [] Numeros= new int [5];
      
      int cambio=0;
      for (int i=0; i<Numeros.length;i++){
            Numeros[i]=rand.nextInt(20);
      
    }
      System.out.println("Antes de acomodar: "+Arrays.toString(Numeros));
      
    for (int i=0;i<Numeros.length;i++){
        for (int j=1;j<Numeros.length-i;j++){
            if (Numeros[j-1]>(Numeros[j])){
                cambio=Numeros[j-1];
                Numeros[j-1]=Numeros[j];
                Numeros[j]=cambio;
            }
        }
    
    }
    System.out.print("Despues de acomodar: "+Arrays.toString(Numeros));
}
}



