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

