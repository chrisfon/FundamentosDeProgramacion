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
public class CUADRADO {
 private int Side;
 private int Perimeter;
 private int Area;
 Scanner scan=new Scanner(System.in);
public CUADRADO(){

}
public int CalcPerimeter(){
   Perimeter=(getSide()*4);
    return Perimeter;
}
public int CalcArea(){
    Area=getSide()*getSide();
    return Area;
}
public void setSide(){
    System.out.print("Que tama;o es el lado del cuadrado?");
    
    this.Side=scan.nextInt();
}
private int getSide(){
    return this.Side;
}
}
