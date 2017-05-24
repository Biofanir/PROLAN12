
public class ItemGAME implements listitemgame {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author labkom7
 */
public class ItemGAME implements listitemgame {
    int hasil;
    private int item1;
    private int item2;
    private int item3;
    private int item4;
     @Override
    public int getItem1() {
        item1=1000;
        System.out.println(item1);
        return 0;
    }
     @Override
    public int getItem2() {
        item2=1200;
        System.out.println(item2);
       return 0;
    }
     @Override
    public int getItem3() {
        item3=2000;
        System.out.println(item3);
        return 0;
    }
    @Override 
    public int getItem4() {
        item4=3000;
        System.out.println(item4);
        return 0;
    }
    @Override
    public int Diskon(){
         hasil=1000+1000;
        System.out.print("DISKON HARI INI SETIAP PEMBELIAN ITEM 1 DAN ITEM 2 HANYA !!!!!! : "+hasil);
       
         return 0;
    
    
    }
}

    
   
}

