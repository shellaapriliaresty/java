/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pencetakhari;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Pencetakhari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hari, angka ;
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukan Nama Hari");
        hari=inputan.nextInt();
        
        if (hari ==1)
        {
            System.out.print("Senin");
        }
        else if (hari ==2)
        {
            System.out.print("Selasa");
        }
        else if (hari ==3)
        {
            System.out.print("Rabu");
        }
        else if (hari ==4)
        {
            System.out.print("Kamis");
        }
        else if (hari ==5)
        {
            System.out.print("Jumat");
        }
        else if (hari ==6)
        {
            System.out.print("Sabtu");
        }
        else if (hari ==7) 
        {
            System.out.print("Minggu");
        }
    }
    
}
