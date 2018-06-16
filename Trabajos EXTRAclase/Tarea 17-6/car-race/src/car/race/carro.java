/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.race;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author crazyiot
 */
public class carro {
    Random rand=new Random();
    Scanner scan=new Scanner(System.in);
    public int fuerza;
    public int año;
    public int Distancia;
    String marca;
public carro(){
  
  System.out.print("Que marca es el vehiculo?");
  marca=scan.next();
  System.out.print("de que a;o es el auto");
  año  =scan.nextInt();
  System.out.print("El carro fue creado\n");
  System.out.print(" Marca: "+marca+" Año:"+año+" Caballos de fuerza: "+fuerza+"\n");
  
  
}  
public int moverse(){
   fuerza=(rand.nextInt(100)+100);
   
   int Distancia=(rand.nextInt(2)*fuerza);
    
   System.out.print("Auto:"+marca+" Distancia recorrida:"+Distancia+"\n");        
    return (Distancia);
}
public String Anuncio(){
    return (("#Auto: "+marca+" -Año del carro: "+año+" -Caballos de fuerza: "+fuerza+" ")); 
    
}
}
