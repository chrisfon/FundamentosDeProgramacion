/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author ulacit
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] [] matriz = {
           {1,2,3,4},
           {1,2,3,4},
           {1,2,3,4},
           {1,2,3,4}
       };
       for (int i=0;i<matriz.length;i++){
          for (int j=0; j<matriz[i].length;j++){
             if (i == j){
                 System.out.print(matriz [i][j]*matriz [i][j]+" ");
             }
          } 
       }System.out.println();
       for (int i=0;i<matriz.length;i++){
          for (int j=0; j<matriz[i].length;j++){
               if (i+j == j-1){
                   System.out.print(matriz [i][j]*matriz [i][j]+" ");
               }
          }
     }
    
}
}
