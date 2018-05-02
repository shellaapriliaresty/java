/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mengenalkota;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Mengenalkota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kota,nama;
        
        Scanner inputan = new Scanner(System.in);
        
        
        System.out.print("Kode plat [B,D,E : ");
        String plat = inputan.nextLine();
        
        if ("B".equals(plat) || "b".equals(plat)){
            System.out.print(plat+"Wilayah jakarta");
        }
        else if ("D".equals(plat) || "b".equals(plat)){
            System.out.print(plat+"Wilayah bandung");
        }
        else if ("E".equals(plat) || "e".equals(plat)){
            System.out.print(plat+"Wilayah cirebon");
        }
        else{
            System.out.print("maaf "+plat+" Daftar kota tidak tersedia");
        }
    }
        
    
}
