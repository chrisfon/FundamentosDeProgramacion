/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.even;
import java.util.Scanner;
/**
 *
 * @author crazyiot
 */
public class IsEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.print("Introduzca un digito para saber si es par un impar ");
        int digito=scanner.nextInt();
        if ((digito%2)==0){
        System.out.print("su numero "+digito +" es par");
    }else{
    System.out.print("su numero "+digito+" es impar ");
    }
    }   
}
