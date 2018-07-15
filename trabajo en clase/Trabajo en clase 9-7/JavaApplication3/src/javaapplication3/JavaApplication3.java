/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author ulacit
 */
public class JavaApplication3 {

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
    boolean hasAssignedDiagonal=false;
    int nDiagonal=0;
    boolean diagonalOk=true;
    
    for (int i=0;i<matriz.length;i++){
        for (int j=0; j<matriz[i].length;j++){
            if (i==j){
                if (!hasAssignedDiagonal){
                    hasAssignedDiagonal=true;
                    nDiagonal=matriz[i][j];
                    
                }else if (nDiagonal !=matriz[i][j]){
                   diagonalOk=false;
                }
            }
    
    } 
    
    System.out.print(diagonalOk);
    
    }
    
}
}