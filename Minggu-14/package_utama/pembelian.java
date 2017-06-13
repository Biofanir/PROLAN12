package package_utama;


Public class pembelian<T>{

    public T pembelian_item;

    public int hasil;
    public int temp;

public int pembelianbrng(){

    if ( hasil > 5000){
        hasil=hasil-1000;
        }
    else if(hasil == 5000){
            hasil= hasil - 500;
        }
    else{
        System.out.println("anda tidak mendapat diskon pembelian");
    }
    return hasil;
}

public int metodepembayaran{
         System.out.println("1.Tunai (pembayaran anda kurang dari 5000");
        System.out.println("2.Kredit (pembayaran anda lebih dari 5000");


        if(hasil < 5000){
            System.out.println("anda melakukan tunai silahkan bayar di tempat");
            }
        else {
            System.out.println("anda melakukan credit");
            hasil = hasil / 6; 
            temp = hasil mod 6;
            hasil = hasil + temp;
            System.out.println("kredit anda/bulan = "+hasil);
        }
        return hasil;
}    

public T sambutan(){
    System.out.println("anda memasuki pembayaran");    

    return pembelian_item;
}



    
