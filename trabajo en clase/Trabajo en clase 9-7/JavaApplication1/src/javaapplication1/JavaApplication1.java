/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ulacit
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [][] matriz=new int [5][5];
       int contador=1;
       
       for (int i=0;i<matriz.length;i++){
          for (int j=0; j<matriz[i].length;j++){
            matriz [i][j]=contador++;  
          } 
       }
         
          
    }
    
}
