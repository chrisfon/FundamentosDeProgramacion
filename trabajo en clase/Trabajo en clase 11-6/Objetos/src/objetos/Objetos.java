/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;
import java.util.Scanner;
/**
 *
 * @author crazyiot
 */
public class Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("Que tamaño quiere el cuadro?");
        Scanner scanner=new Scanner(System.in);
    int lado=scanner.nextInt();
    
    System.out.print (new Cuadrado(lado));
    }
    
}
