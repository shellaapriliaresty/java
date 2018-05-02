/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai_latihan, nilai_uts, nilai_uas;
        double hasil;
        String nama;
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukan nama anda : ");
        nama=inputan.nextLine();
        
        System.out.print("Masukan nilai latihan : ");
        nilai_latihan=inputan.nextInt();
        
        System.out.print("Masukan nilai UTS : ");
        nilai_uts=inputan.nextInt();
        
        System.out.print("Masukan nilai UAS : ");
        nilai_uas=inputan.nextInt();
        
        hasil=(double)(0.2/100*nilai_latihan)+(0.3/100*nilai_uts)+(0.5/100*nilai_uas);
        
        System.out.print("Nilai yang diperoleh adalah "+hasil+". ");
        
       /*if(hasil>70)
        {
        System.out.print("Anda Hebat");
        }
        else
        {
        System.out.print("Sayang seksli, belajar lebih giat");
        }
        */
   
if (hasil>80){
    System.out.print("Grade A");
}
else if(hasil>65){
    System.out.print("Grade B");
}
else if(hasil>50){
    System.out.print("Grade C");
}
else if (hasil<=50){
    System.out.print("Grade D");
}
    
    }
}