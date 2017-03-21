public class Hitungluas_3d extends Hitungluas{
  
  
  
  public void luas_balok(int p,int le,int t){
    l=t*(p*le);
    
    System.out.println(l);
  }
  
  public void luas_kubus(int s){
    l=s^3;
    
    
  	System.out.println(l);
  }
  
  
  public static void main(String[] args){
    Hitungluas_3d hitung= new Hitungluas_3d();
    hitung.luas_balok(p,le,t);
    hitung.luas_kubus(s);
    hitung.luas_persegi(s);
    hitung.luas_persegipanjang(le,p);
    hitung.luas_jajargenjang(a,t);
    hitung.luas_segitiga(a,t);
  }
  
  
  
}