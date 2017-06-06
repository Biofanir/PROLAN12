public class Hitungluas{
  int l;
  int s;
  String judul;
  String subjek;
  Hitungluas(){
	judul = "hitung luas dari beberapa objek";
	subjek = "luas 2D";
	System.out.println(judul);
	System.out.println(subjek);
	}
	
  public void luas_persegi(){
    l=s*s;
    System.out.println(l);
  }
  
  public void luas_persegipanjang(int le,int p){
    
    l=le*p;
    System.out.println(l);
  }
  
  public void luas_jajargenjang(int a,int t){
   l=a*t;
    
   System.out.println(l);
  }
  
  public void luas_segitiga(int a,int t){
    l=(a/2)*t;
    
  System.out.println(l);
  }
  
}

public class Hitungluas_3d extends Hitungluas{
  
  
  @Override
  public void luas_persegi(){
    l=s+s;
    System.out.println(l);
	super.luas_persegi();
  }
  
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
   
	hitung.luas_persegi();
	
  }
  
  
  
}