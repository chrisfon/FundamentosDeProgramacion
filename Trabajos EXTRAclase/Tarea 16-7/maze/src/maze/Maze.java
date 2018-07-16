/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;
import java.util.Scanner;
/**
 *
 * @author crazyiot
 */
public class Maze {

 Scanner scan=new Scanner(System.in);  
 String move=scan.next();
 /**
 
 * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String move;
        boolean finish=false;
        Board b=new Board();
        b.init();
        b.print();
        b.inGame();
        
       
       }
       
       
    }
    

