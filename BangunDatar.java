/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangun.datar;

/**
 *
 * @author Achsani
 */import java.util.Scanner;
public class BangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("program menghitung luas");
        System.out.println("1. persegi\n2. segitiga");
        System.out.print("3. lingkaran\npilihan anda = ");
        byte pilih = s.nextByte();
        switch(pilih){
            case 1: System.out.print("masukan sisi = ");
                    int sisi = s.nextInt();
                    System.out.println("luas = "+(sisi*sisi));
                    break;
            case 2: System.out.print("masukkan alas =");
                    int alas = s.nextInt();
                    System.out.print("masukkan tinggi = ");
                    int tinggi = s.nextInt();
                    System.out.println("luas ="+(0.5*alas*tinggi));
                    break;
            case 3: System.out.print("masukkan jari-jari = ");
                    int jari = s.nextInt();
                    System.out.println("luas = "+(3.14*jari*jari));
                    break;
            default: System.out.println("pilihan tidak ada");
            
            
        }
        
    }
    
}
