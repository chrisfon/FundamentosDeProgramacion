/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.en.clase1;
import java.util.Random;
/**
 *
 * @author crazyiot
 */
public class TrabajoEnClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            for (int i=0;i<9;i++){
    
    Random Rand=new Random();
    int golesA= Rand.nextInt(5);
    int golesB= Rand.nextInt(5);
    int golesC= Rand.nextInt(5);
    int golesD= Rand.nextInt(5);
    
    System.out.println("Grupo#"+i);
    System.out.println("A "+(golesA)+" vs B "+(golesB));
    System.out.println("C "+(golesC)+" vs D "+(golesD));
    }
}
    }


