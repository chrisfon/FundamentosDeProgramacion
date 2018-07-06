/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package split;
import java.util.Scanner;
/**
 *
 * @author ulacit
 */
public class Split {
Scanner scan=new Scanner(System.in);
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String s="Texto de Ejemplo";
    String[] partes = s.split(" ");
    String parte1=partes[0];
    String parte2=partes[1];
    String parte3=partes[2];
    System.out.print(parte3+"  "+parte2+" "+parte1);
    }
    
}
