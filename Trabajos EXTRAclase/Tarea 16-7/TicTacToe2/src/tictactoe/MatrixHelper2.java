/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author ulacit
 */
public class MatrixHelper2 {
    boolean hasAssignedDiagonal=false;
    boolean diagonalOK=true;
    String nDiagonal;
    public void print(String[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public boolean checkWinner(String[][] matrix) {
        return checkSameRows(matrix) || checkSameCols(matrix) || checkDiagonalA(matrix) || checkDiagonalB(matrix);
    }
    
    private boolean checkSameRows(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String initial = matrix[i][0];
            boolean same = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != initial) {
                    same = false;
                }
            }
            if (same) {
                return same;
            }
        }
        return false;
    }
    
    private boolean checkSameCols(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String initial = matrix[0][i];
            boolean same = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[j][i] != initial) {
                    same = false;
                }
            }
            if (same) {
                return same;
            }
        }
        return false;
    }
    private boolean checkDiagonalA (String[][] matrix){
         for (int i=0;i<1;i++){
        for (int j=0; j<matrix[i].length;j+=2){
            
                if (matrix[i][j]==matrix[1][1]){
                    if (j==0){
                        if (matrix[2][2]==matrix[1][1]){
                          
                          diagonalOK=true;  
                        }
                    }else if (j==2){
                        if (matrix [2][0]==matrix[1][1]){
                         
                          diagonalOK=true;   
                        }
                    }
                    
                }else{
                   diagonalOK=false;
                }
            
    
    } 
         
    }
    return diagonalOK;
}
    private boolean checkDiagonalB (String[][] matrix){
        for (int i=0;i<=2;i+=2){
        for (int j=0; j<=2;j+=2){
            if (i==0){
                if (matrix [i][j]==matrix [1][1]){
                if (j==0){
                    if (matrix[2][2]==matrix[1][1]){
                    
                    
                    diagonalOK=true;
                    }
                }else if (j==2){
                   if(matrix [0][0]==matrix[1][1]){
                     
                    
                    diagonalOK=true;  
                   }
                }
            }
    
    }else if (i==2){
        
    } 
         
    }
    
}
        return diagonalOK;
    }

}