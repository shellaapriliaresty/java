/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprojectjava3.shela;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class TugasprojectJava3Shela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
     int sisi, keliling;
     
    
     Scanner persegi = new Scanner(System.in);
     
     System.out.println("a. Progran keliling persegi");
     
     System.out.print("sisi : ");
     
     sisi=persegi.nextInt();
     
     keliling=4*sisi;
     System.out.print("keliling persegi adalah " + keliling);
     
     
    }
    
}
