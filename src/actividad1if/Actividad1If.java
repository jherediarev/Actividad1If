/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1if;

import java.util.Scanner;
/**
 *
 * @author Johnny Reveles
 */
public class Actividad1If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner miConsola = new Scanner(System.in);
    
    int año1 = 0;
    
    System.out.println("Introduce un número: ");
    año1 = miConsola.nextInt();
    
    if (año1 > 2021) {
    System.out.println("Faltan " + (año1 - 2021) + " años");
    } else if (año1 < 2021 ) {
    System.out.println("Han pasado " + (2021 - año1) + " años");
    } else {
    System.out.println("Nos encontramos en ese año");
    }
    
    
        
  } 
}
