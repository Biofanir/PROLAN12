

package package_event;


public class Sprinttask {
    int harga1=5000;
    int harga2=5000;
    int harga3=5000;
    String Namabaranggame;

    public <T> void itemgame1(T item1){
        
        harga1/=5;
        System.out.println(item1);
        
    }  
    public <T> void itemgame2(T item2){
       
        harga2/=5;
        System.out.println(item2);
    }  
    public <T> void itemgame3(T item3){
       
        harga3/=5;
        System.out.println(item3);
    }   
      
    public static <T,N> void Sprinttask(T item1,T item2,T item3,N hasil){
        System.out.println(hasil);
    }
   public void setNamabarang(String namabarang){
       this.Namabaranggame=namabarang;
   }
   
   }

   
    
}
