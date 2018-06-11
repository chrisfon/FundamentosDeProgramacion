/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroaleatorio;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ulacit
 */
public class NumeroAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random Rand=new Random();
      
        int NumeroAdivinar= Rand.nextInt(101);
        while (NumeroAdivinar>0){
        System.out.print ("Adivine el numero \n");
        int Adivina = scanner.nextInt();
        if (Adivina >NumeroAdivinar){
            System.out.print("El numero es mas bajo \n");
        
        }else{
            System.out.print("El numero es mas alto \n");
        }while (NumeroAdivinar==Adivina){
            System.out.print("Correcto!");
            System.exit(0);
           
    }
    
    }
}
}
