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
public class TRIANGULO_ISOCELES {
  private int base;
  private int height;
  private int Perimeter;
  private int Area;
  private int side;
  Scanner scan=new Scanner(System.in);
   public TRIANGULO_ISOCELES(){
    
}  
  public void setBase(){
     System.out.print("Determine la base del triangulo");
     this.base=scan.nextInt();
  }
  public void setHeight(){
     System.out.print("Determine la altura del triangulo");
     this.height=scan.nextInt();
  }
  public void setSide(){
  System.out.print("Determine el lado del triangulo");
  this.side=scan.nextInt();
  }
  private int getSide(){
    return this.side;
  }
  private int getBase(){
     return this.base; 
  }
  private int getHeight(){
     return this.height; 
  }
  public int calcArea(){
     Area=(getBase()*getHeight())/2;
      return Area;
  }
  public int calcPerimeter(){
      Perimeter=(getSide()*2)+getBase();
      return Perimeter;
  }
}
