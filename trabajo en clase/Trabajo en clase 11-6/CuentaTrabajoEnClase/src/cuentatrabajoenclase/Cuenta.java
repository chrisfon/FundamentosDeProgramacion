/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentatrabajoenclase;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author crazyiot
 */
public class Cuenta {
    public static Random rand=new Random();
    public static Scanner scan=new Scanner(System.in);
    public Cuenta (int monto){
        int otra=1;
     
        while (otra==1){
        int PlataEnCuenta=monto;
        System.out.print("Actualmente en su cuenta hay: "+PlataEnCuenta+"\n");
        System.out.print("Desea 1=Agregar Debito o 2=Agregar Credito ");
        int modo=scan.nextInt();
        if (modo==1){ 
            System.out.print("Cuanto desea agregar de debito? ");
            Cuenta.Debitar(monto);
            
        }else{
            System.out.print("Cuanto desea agregar de credito? ");
            Cuenta.Acreditar(monto);
        }
        System.out.print("Desea intentar otra vez? 1=si 0=no");
        
        otra=scan.nextInt();
   }
    }

    private static void Debitar(int monto){
        
        int debito=scan.nextInt();
        monto=monto-debito;
        System.out.print("En su cuenta hay "+monto);
        System.out.print("\n");
        
    }
    private static void Acreditar(int monto){
       
        int credito=scan.nextInt();
        monto=monto+credito;
        System.out.print("En su cuenta hay "+monto); 
        System.out.print("\n");
    }

}

