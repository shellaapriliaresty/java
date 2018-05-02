/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int alas,tinggi;
        double luas;
        
        Scanner segitiga = new Scanner(System.in);
        
        System.out.println("Program Luas Segitiga");
        System.out.println("***********************");
        
        System.out.print("Alas :");
        alas=(int) segitiga.nextDouble();
        
        System.out.print("Tinggi : ");
        tinggi=(int) segitiga.nextDouble();
        
        luas=(double) (alas*tinggi)/2;
        System.out.print("Luas segitiga adalah"+luas);
        
        
    }
    
}
