public class Kelas{
	
	int kursi;
	int meja;
	String jadwal;
	String organigram;

	void BelajarBersama(){
		System.out.println("belajar bersama guru");

	}
  
  void Jumlahkursidanmeja(){
    	System.out.println("Meja = 12 buah");
    	System.out.println("Kursi = 10 buah");
  }


	public static void main(String[] args)
	{
		Kelas saya= new Kelas();
		saya.BelajarBersama();
      	saya.Jumlahkursidanmeja();
		
	}
}