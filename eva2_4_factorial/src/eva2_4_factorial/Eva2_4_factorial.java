/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva2_4_factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
      int fact, valor;
      
      fact=1;
      
        System.out.println("el numero que quieras factorizar");
        fact=captu.nextInt();
        captu.nextLine();
        
      
              
        for(int i =valor; i>=1; i--){
          fact=fact*i;
        }
          System.out.println("factorzado de =" +valor + "-"+fact);
        
        
    }
    
}
