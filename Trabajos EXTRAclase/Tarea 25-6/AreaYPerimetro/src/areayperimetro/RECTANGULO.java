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
public class RECTANGULO {
 private int length;
 private int width;
 private int Area;
 private int Perimeter;
 Scanner scan=new Scanner(System.in);
 
public RECTANGULO(){
    
}
public void setLenght(){
   System.out.print("Cual es el largo del rectangulo?");
   this.length=scan.nextInt();
}
public void setWidth(){
  System.out.print("Cual es el ancho del rectangulo?");
  this.width=scan.nextInt();
}
private int getLength(){
  return this.length;  
}
private int getWidth(){
  
    return this.width;  
}
public int calcArea(){
    Area=getLength()*getWidth();
    return Area;
}
public int calcPerimeter(){
    Perimeter=(getWidth()+getLength())*2;
    return Perimeter;
}
}
