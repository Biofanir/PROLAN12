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