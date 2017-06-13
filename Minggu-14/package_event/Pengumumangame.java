
package package_event;


public class Pengumumangame <T> extends Sprinttask{

   
   
    public <T> void pengumumandiskon(T pengumuman){
        String diskon="Diskon Ramadhan Kolek dengan pembelian item1 , item 2 dan item3 sebesar 10%";
        System.out.println(pengumuman);    
    }  
     public <T> void pengumumanevent(T pengumuman){
        String event="EVENT double EXP akan di lanjutkan pada tanggal 15 juni 2017";
        System.out.println(pengumuman);    
    }
      public void maintenance(){
        String tenance="Maintenance di laksanakan seminggu sekali pada hari selasa jam 10.00- jam 12.00";
        System.out.println(tenance);    
    }
      private static <T> Sprinttask Namabarang(T nb){
        return (Sprinttask) nb;
    }
     
 
  
}
