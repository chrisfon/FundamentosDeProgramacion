/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precio;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ulacit
 */
public class Precio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     Random rand=new Random();
     int MontoAPagar=rand.nextInt(999999);
     int Billetes20=MontoAPagar/20000;
     int Sobra20=MontoAPagar%20000;
     int Billetes10=Sobra20/10000;
     int Sobra10=Sobra20%10000;
     int Billetes5=Sobra10/5000;
     int Sobra5=Sobra10%5000;
     int Billetes2=Sobra5/2000;
     int Sobra2=Sobra5%2000;
     int Billetes1=Sobra2/1000;
     int Sobra1=Sobra2%1000;
     int Monedas500=Sobra1/500;
     int Sobra500=Sobra1%500;
     int Monedas100=Sobra500/100;
     int Sobra100=Sobra500%100;
     System.out.print("Su total a pagar es de "+MontoAPagar+"\n" );
     System.out.print ("Billetes de 20: "+Billetes20+ " Billetes de 10: "+Billetes10+"\n");
     System.out.print("Billetes de 5: "+Billetes5+" Billetes de 2: "+Billetes2+"\n");
     System.out.print ("Billetes de 1: "+Billetes1+" Monedas 500: "+Monedas500+"\n");
     System.out.print ("Monedas 100: "+Monedas100+" Restante: "+Sobra100+"\n");
    }
    
}
