/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprojectjava4.shela;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class TugasprojectJava4Shela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int panjang, lebar, tinggi, volume ;
        
        Scanner balok = new Scanner (System.in);
        
        System.out.println("b. Program Volume Balok");
        System.out.println("..........");
        
        System.out.print("panjang");
        panjang=balok.nextInt();
        
        System.out.print("lebar");
        lebar=balok.nextInt();
        
        System.out.print("tinggi");
        tinggi=LP.nextInt();
        
        
        int LPbalok = (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
        System.out.print("Luas permukaan balok adalah " + LPbalok);
    }
    
}
