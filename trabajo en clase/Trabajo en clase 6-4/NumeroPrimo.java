/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;
import java.util.Scanner;
/**
 *
 * @author crazyiot
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite un numero para saber si es primo: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i=2; i<number; i++){
            if (number % i==0){
                isPrime=false;
                break;
            }
            
        }
        System.out.println("El numero " + (isPrime ? " si " : " no ") + " es primo ");
    }
    }
    

