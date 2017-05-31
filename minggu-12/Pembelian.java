public class Pembelian<T>{

    public T pembelian_item;

    public T pembelian_barang(int hasil){
        if ( hasil > 5000){
            hasil = hasil - 1000;
            System.out.println("Anda mendapat diskon ! , Total bayaran anda : "+hasil);
        }
        else if(hasil == 5000){
                hasil = hasil - 500;
                System.out.println("Anda mendapat diskon ! , Total bayaran anda : "+hasil);
        }
        else { 
                System.out.println("Anda tidak mendapat diskon");
        }
        return pembelian_item;
    }  
    
    public T metodepembayaran(int hasil){
        if ( hasil > 5000){
            System.out.println("Bayaran anda dapat menggunakan cicilan ");
            hasil = hasil/5;
            System.out.println("Bayaran cicilan anda/bulan : "+hasil);
        }
        else{
            System.out.println("silahkan bayar tunai");
        }
        return pembelian_item;
    }  
}


                   
