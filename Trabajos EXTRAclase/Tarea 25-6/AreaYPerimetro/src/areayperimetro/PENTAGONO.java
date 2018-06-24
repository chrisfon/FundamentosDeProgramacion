/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areayperimetro;
import java.util.Scanner;
/**
 *
 * @author crazyiot
 */
public class PENTAGONO {
  private int side;
  private int apothem;
  private int Area;
  private int Perimeter;
  Scanner scan=new Scanner(System.in);
  public PENTAGONO(){
    
}
  public void setSide(){
   System.out.print("De que tama;o es el lado del pentagono?");
   this.side=scan.nextInt();
  }
  public void setApothem(){
   System.out.print("Cual es el Apotema(distancia al centro)");
   this.apothem=scan.nextInt();
  }
  private int getSide(){
   return this.side;
  }
  private int getApothem(){
   return this.apothem;   
  }
  public int calcArea(){
    Area=(getSide()*getApothem()*5)/2;
      return Area;
  }
  public int calcPerimeter(){
    Perimeter=getSide()*5;
      return Perimeter;  
  }
  
}
