/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromos;
import java.util.Scanner;
/**
 *
 *
 */
public class Palindromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        // TODO code application logic here
     Scanner scanner=new Scanner(System.in);
     System.out.print("introduzca la palabra para revisar si es palindromo ");
     String reverse="";
     String prueba=scanner.nextLine();
     for (int i= prueba.length()-1 ;i>=0;i--){
         reverse=reverse+prueba.charAt(i);
     }
    
        if (prueba.equals(reverse)) {
            System.out.print("Su palabra "+prueba+ " si es un palindromo " +reverse);
        }else{
            System.out.print ("Su palabra "+prueba+" no es un palindromo "+reverse);
         
     }
    }
    
}
