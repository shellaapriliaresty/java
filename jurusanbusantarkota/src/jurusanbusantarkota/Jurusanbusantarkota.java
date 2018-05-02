/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurusanbusantarkota;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Jurusanbusantarkota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nama_pemesan;
        int jumlah_pesanan;
        // TODO code application logic here
int jk,jurusan,total,harga = 0;
String nama,nama_jurusan=null;

Scanner inputan = new Scanner(System.in);

System.out.println("Jurusan Bus Antar Kota");
System.out.println("1. BSD - Bandung");
System.out.println("2. Bandung - BSD");

System.out.print("Nama Pemesan : ");
nama=inputan.nextLine();
System.out.print("Jumlah Kursi : ");
jk=inputan.nextInt();
System.out.print("Jurusan :");
jurusan=inputan.nextInt();
        String jumlah_kursi;

switch (jurusan){
    case 1:
        nama_jurusan="BSD - Bandung";
        harga=70000;
        break;
    case 2:
        nama_jurusan="Bandung - BSD";
        harga=50000;
  
    default :
        System.out.print("maaf silahkan input ulang pesanan anda");

}
if (jurusan>=1 && jurusan<=2){
    total=harga*jk;
    System.out.println("tiket telah dipesan oleh"+nama);
    System.out.println("jurusan"+nama_jurusan+"dengan jumlah"+jk);
    System.out.println("tiket dengan total bayar yaitu Rp"+total);
            
    
}
    }
    
}
