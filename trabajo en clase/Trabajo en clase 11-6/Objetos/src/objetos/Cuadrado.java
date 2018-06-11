/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author crazyiot
 */
public class Cuadrado {
    public Cuadrado(int lado){

    for (int i = 0; i<lado ;i++){
            if (i==0 || i==lado-1 ){
                Cuadrado.LineaLlena(lado);
                System.out.print("\n");
               }else{
                Cuadrado.LineaVacia(lado);
                System.out.print("\n");
}
}
}

private static void LineaLlena(int lado){
  for (int i=0; i<lado;i++)
            System.out.print("*");
    }
 

private static void LineaVacia(int lado){
System.out.print("*");
        for (int j=0; j< lado - 2;j++){
            System.out.print(" ");
        }
        System.out.print("*");
    }

}
