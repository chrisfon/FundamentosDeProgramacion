/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areayperimetro;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author crazyiot
 */
public class TRIANGULO_EQUILATERO {
 private int side;
private int height;
private int Perimeter;
private double Area;
Scanner scan=new Scanner(System.in);
    public TRIANGULO_EQUILATERO(){
        
    }
    public void setSide(){
     System.out.print("Cual es el tama;o de los lados del triangulo?"); 
     this.side=scan.nextInt();
    }
    
    
    private int getSide(){
      return this.side;  
    }
  
    
    public int calcPerimeter(){
        Perimeter=getSide()*3;
        return Perimeter;
    }
    public double calcArea(){
        double Area=(Math.sqrt(3)/4)*getSide()*getSide();
        return Area;
    }
}
