public Class Keinginan{
  String keinginan;
  
  public abstract void harta();
  public abstract void tahta();
  public abstract void wanita();
}

public Class Bio extends Keinginan{
  
  @Override
  public abstract void harta(){
    System.out.println("Harta adalah ekonomi untuk menunjang kehidupan di dunia");
  }
  
  @Override
  public abstract void tahtah(){
    System.out.println("tahtah adalah suatu kebijakan dalam perbuatan");
  }
  
  @Override
  public abstract void wanita(){
    System.out.println("wanita adalah pendamping");
  }
}

public Class Mainprogram{
  public static void main(String[]args){
    Keinginan saya = new Bio();
   	saya.harta();
    saya.tahtah();
    saya.wanita();
  }
}
  
  