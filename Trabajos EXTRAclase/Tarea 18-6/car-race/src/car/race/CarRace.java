/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.race;

/**
 *
 * @author crazyiot
 */
public class CarRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        carro carro1=new carro();
        carro carro2=new carro();
        carro carro3=new carro();
        
        System.out.print("Sus autos han sido creados. La carrera iniciara\n");
         System.out.print("3...\n");
        System.out.print("2...\n");
        System.out.print("1...\n");
        
        
        int c1=carro1.moverse();
        int c2=carro2.moverse();
        int c3=carro3.moverse();
       
        
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        for (int i=0;;i++){
        System.out.print("Turno "+i+"\n");
        if (c1>1000){
            System.out.print("El ganador es Carro #1!\n");
            System.out.print("Resultados:"+"\n"+"1."+carro1.Anuncio()+"-Distancia recorrida "+c1+"\n"+"2."+carro2.Anuncio()+"-Distancia recorrida "+c2+"\n"+"3."+carro3.Anuncio()+"-Distancia recorrida "+c3+"\n");
            System.exit(0);
            
        }else if (c2>1000){
            
              System.out.print("El ganador es Carro#2!\n");
              System.out.print("Resultados:"+"\n"+"1."+carro1.Anuncio()+"-Distancia recorrida "+c1+"\n"+"2."+carro2.Anuncio()+"-Distancia recorrida "+c2+"\n"+"3."+carro3.Anuncio()+"-Distancia recorrida "+c3+"\n");
              System.exit(0);
              
            }else if (c3>1000){
                System.out.print("El ganador es Carro#3!\n");
                System.out.print("Resultados:"+"\n"+"."+carro1.Anuncio()+"-Distancia recorrida "+c1+"\n"+"."+carro2.Anuncio()+"-Distancia recorrida "+c2+"\n"+"3."+carro3.Anuncio()+"-Distancia recorrida "+c3+"\n");
                System.exit(0);
            }else {
                c1= c1 + carro1.moverse();
                c2= c2+ carro2.moverse();
                c3= c3+ carro3.moverse();
                    
            }
        }    
        
    }
    
    }



