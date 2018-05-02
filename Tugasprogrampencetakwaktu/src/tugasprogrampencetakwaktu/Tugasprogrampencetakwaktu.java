/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprogrampencetakwaktu;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Tugasprogrampencetakwaktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai, waktu ;
        
        Scanner inputan = new Scanner (System.in);
        
        System.out.print("Masukan waktu :");
        waktu=inputan.nextInt();
        
        if (waktu>=5 && waktu<=11)
        {
            System.out.print("Pagi");
        }
        else if (waktu>=12 && waktu<=18)
        {
            System.out.print("Siang");
        }
        else if (waktu>19 && waktu<=22)
        {
            System.out.print("Malam");
        }
        else if (waktu>=1 && waktu<=4)
        {
            System.out.print("Dinbi hari");
        }
        else 
        {
            System.out.print ("Pilihan tidak tentu");
            
            }
}

}    