package package_utama;

import Event.Pengumumangame;

import java.util.Scanner
public class Mainbeli{

    public static void main(String[] args){
		
        Pembelian<Integer> beli = new Pembelian<Integer>();
		Pengumumangame <String> event = Pengumumangame();
        Scanner input = new Scanner (System.in);
        System.out.println("MENU PEMBAYARAN");
        System.out.print("Masukkan jumlah pembayaran : ");
        int hasil = input.nextInt();
        beli.pembelian_barang(hasil);
        beli.metodepembayaran(hasil);
		event.maintenance();
    }
}

