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
public class Menu {
private int Shape;
private int Mode;
Scanner scan=new Scanner(System.in); 
public Menu(){
   
}  
public int Introduction(){
 System.out.print("1. Calcular área\n" +
"\n" +
"2. Calcular perímetro\n" +
"\n" +
"3. Salir\n");
 setMode();
 return this.Mode;
}

public int ShapeSelect(){
 System.out.print("De que figura?\n" +
 "\n" + "1.Cuadrado\n"+"2.Rectangulo\n"+"3.Triangulo Equilatero \n"+"4.Triangulo Isoceles\n"
 +"5.Pentagono\n"+"6.Circulo\n");
 setShape();
 return this.Shape;
}
private void setShape(){
    
    this.Shape=scan.nextInt();
}
public int getShape(){
    return this.Shape;
}
public void setMode(){
    this.Mode=scan.nextInt();
}
public int getMode(){
    return this.Mode;
}
}
