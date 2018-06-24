/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areayperimetro;

/**
 *
 * @author crazyiot
 */
public class AreaYPerimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu men=new Menu();
       int ModeSelected= men.Introduction();
       
     if (ModeSelected==1){
     int ShapeSelected=men.ShapeSelect();
     if (ShapeSelected==1){
      CUADRADO cuad=new CUADRADO();
      cuad.setSide();
      System.out.print("El area es:"+cuad.CalcArea());
     }else if (ShapeSelected==2){
      RECTANGULO rec=new RECTANGULO();
      rec.setLenght();
      rec.setWidth();
      System.out.print("El area es:"+rec.calcArea());
     }else if (ShapeSelected==3){
      TRIANGULO_EQUILATERO triE=new TRIANGULO_EQUILATERO();
      triE.setSide();
      System.out.print("El area es:"+triE.calcArea());
     }else if (ShapeSelected==4){
      TRIANGULO_ISOCELES triI=new TRIANGULO_ISOCELES();
      triI.setBase();
      triI.setHeight();
      System.out.print("El area es:"+triI.calcArea());
     }else if (ShapeSelected==5){
      PENTAGONO pen=new PENTAGONO();
      pen.setApothem();
      pen.setSide();
      System.out.print("El area es:"+pen.calcArea());
     }else if (ShapeSelected==6){
       CIRCULO cir=new CIRCULO();
       cir.setRadius();
       System.out.print("El area es: "+cir.calcArea());
     }else{
         System.out.print("Se equivoco");
         System.exit(0);
     }
    }else if (ModeSelected==2){
     int ShapeSelected=men.ShapeSelect();
     if (ShapeSelected==1){
      CUADRADO cuad=new CUADRADO();
      cuad.setSide();
      System.out.print("El Perimetro es:"+cuad.CalcPerimeter());
     }else if (ShapeSelected==2){
      RECTANGULO rec=new RECTANGULO();
      rec.setLenght();
      rec.setWidth();
      System.out.print("El perimetro es:"+rec.calcPerimeter());
     }else if (ShapeSelected==3){
      TRIANGULO_EQUILATERO triE=new TRIANGULO_EQUILATERO();
      triE.setSide();
      System.out.print("El perimetro es:"+triE.calcPerimeter());
     }else if (ShapeSelected==4){
      TRIANGULO_ISOCELES triI=new TRIANGULO_ISOCELES();
      triI.setBase();
      triI.setHeight();
      System.out.print("El perimetro es:"+triI.calcPerimeter());
     }else if (ShapeSelected==5){
      PENTAGONO pen=new PENTAGONO();
      pen.setApothem();
      pen.setSide();
      System.out.print("El perimetro es:"+pen.calcPerimeter());
     }else if (ShapeSelected==6){
       CIRCULO cir=new CIRCULO();
       cir.setRadius();
       System.out.print("La circumferencia es: "+cir.calcPerimeter());  
     }else{
         System.out.print("Se equivoco");
         System.exit(0);
     }
    }else if (ModeSelected==3){
     System.exit(0);
    }
    }
    
}


