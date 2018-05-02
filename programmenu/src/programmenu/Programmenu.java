/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmenu;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Programmenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String jumlah;
        // TODO code application logic here
        String pesanan, jumlah pesanan;
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("pesanan : ");
        pesanan=inputan.nextLine();
        
        switch (pesanan){
          case "p";
               System.out.print(pesanan+" kopi");
                break;
          case "p";
               System.out.print(pesanan+" teh");
               break;
         case "";
               System.out.print(pesanan+" air mineral");
               break;
         default;
              System.out.print("maaf silahkan input ulang pesanan anda");
     }  
     
    }
    
}    