/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_ganjil_genap;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Aplikasi_ganjil_genap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka;
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Prgorgam membedakan ganjil dan genap");
        
        System.out.print("Masukan bilangan : ");
        angka=input.nextInt();
        
        if (angka%2==0){
            System.out.print("ini adalah bilangan genap");
        }
        else {
            System.out.print("ini adalah bilangan ganjil");
        }
    }
    
}
