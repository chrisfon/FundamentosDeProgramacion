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
public class CIRCULO {
private int radius;
private int Area;
private int Perimeter;
Scanner scan=new Scanner(System.in);
public CIRCULO(){
    
}    
public void setRadius(){
  System.out.print("Cual es el radio de este Circulo?");
  
  this.radius=scan.nextInt();
}
private int getRadius(){
    return this.radius;
}
public int calcArea(){
    Area=((22*getRadius()*getRadius()/7));
    return Area;
}
public int calcPerimeter(){
    Perimeter=(22*getRadius()*2)/7;
    return Perimeter;
}

}
