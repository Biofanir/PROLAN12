/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author labkom7
 */
import java.util.Scanner;
public class Harga {
     public static void main(String[] args) {
        ItemGAME game = new ItemGAME();
        Scanner input = new Scanner(System.in);
        int n;
        
        int beli;
        int uang;
        do{
        System.out.println("GAME CATOUR");
        System.out.println("1. HARGA ITEM 1");
        System.out.println("2. HARGA ITEM 2");
        System.out.println("3. HARGA ITEM 3"); 
        System.out.println("4. HARGA ITEM 4");
        System.out.println("5. DISKON HARI INI");
        System.out.println("6. PEMBELIAN");
        System.out.println("7. KELUAR");
        System.out.print("Masukkan Pilihan Anda : ");
         n = input.nextInt();
        if(n == 1){
            System.out.println(game.getItem1());
            
        }
        if(n == 2){
            System.out.println(game.getItem2());
           
        }
        if(n == 3){
            System.out.println(game.getItem3());
           
        }
        if(n == 4){
            System.out.println(game.getItem4());
            
        }
        if(n == 5){
            System.out.println(game.Diskon());
            
        }
         if(n == 6){
            
            System.out.print("BARANG YANG DI BELI : ");
            beli=input.nextInt();
            System.out.print("UANG YANG DI BAYARKAN : ");
            uang=input.nextInt();
            System.out.println("DATA PEMBELI");
            System.out.println("BARANG YANG DI BELI : "+beli);
            if ( beli == 1){
                uang=uang-1000;
            }
            if ( beli == 2){
                uang=uang-1200;
            }
            if ( beli == 3){
                uang=uang-2000;
            }
            if ( beli == 4){
                uang=uang-3000;
            }
            System.out.println("TOTAL BAYAR : "+uang);
        }
        
        }while(n!=7);
     }
}
