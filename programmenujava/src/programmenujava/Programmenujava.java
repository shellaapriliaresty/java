/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmenujava;

import static java.awt.SystemColor.menu;
import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Programmenujava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int pesanan, jumlah_pesanan,harga,total = 0;
String nama_pesanan = null;
        
Scanner inputan = new Scanner(System.in);
        
System.out.println("menu");
System.out.println("1. kopi");
System.out.println("2. teh");
System.out.println("3. air mineral");
        
System.out.print("pesanan : ");
pesanan=inputan.nextInt();
        
System.out.print("Jumlah Pesanan");
jumlah_pesanan=inputan.nextInt();
        
switch(pesanan){
    case 1:
    nama_pesanan="Kopi";
    harga=25000;
        break;
    case 2:
    nama_pesanan="Teh";
    harga=15000;
    break;
    case 3:
    nama_pesanan="Air Mineral";
    harga=10000;
    break;
    default:
        System.out.print("Maaf silahkan input ulang pesanan anda");
                     
}
if (pesanan>=1 && pesanan<=3){
    total = harga*jumlah_pesanan;
    System.out.print("Silahkan membayar Rp "+total);
    System.out.print("Ani memesan tiket jurusan ,sebanyak "+ jumlah_pesanan +" gelas, silahkan tunggu pesanan anda");
}
    
    }
}
    

