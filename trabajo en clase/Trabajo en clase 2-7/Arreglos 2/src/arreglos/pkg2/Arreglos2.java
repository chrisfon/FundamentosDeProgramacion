/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.pkg2;
import java.util.Random;
/**
 *
 * @author ulacit
 */
public class Arreglos2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Random rand=new Random();
    int[] a=new int [5];
    int[] b=new int [5];
    int[] c=new int [5];
    
     for (int i=0; i<a.length;i++){
            a[i]=rand.nextInt(20+1);
            System.out.println("a."+a[i]);
    }
     for (int i=0; i<b.length;i++){
            b[i]=rand.nextInt(20+1);
            System.out.println("b."+b[i]);
    }
     for (int i=0; i<a.length;i++){
         
         
            for (int j=0; j<b.length;j++){
            c[i]+=b[j]*a[i];
            
            }
        System.out.println("c."+c[i]);
      }
    }
    
}

