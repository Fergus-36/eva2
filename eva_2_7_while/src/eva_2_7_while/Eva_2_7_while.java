/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_7_while;

/**
 *
 * @author Alondra
 */
public class Eva_2_7_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int val=1;
                //while
        System.out.println("WHILE");
        while(val <=10){//mientras que los parentesis sean correctos se repitera la instruccion
            System.out.print(val+"-");
        val++;
  
        }
        
                //do while
        System.out.println("");
        System.out.println("do while");
        val=1;
        do{
        System.out.print(val+"-");
        val++;
        }while(val <=10);//repite las instrucciones cuando el parente4cis es verdad
        
    }
    
}