import java.util.Scanner;
class milih{

	public static void main(String[] args) 
	{
		int N;
        int Nilai;
        int i;
        int min=100,max=0;
		char pilihan;
		
		minmax tes = new minmax();
		Scanner input = new Scanner (System.in);
		
		System.out.print("Masukan Banyak Data = ");
        N = input.nextInt();
		System.out.println("\nKeterangan :\nA =nilai Minimum.\nB = nilai Maksimum.\n");
		System.out.print("Masukan Pilihan = ");
        pilihan = input.next().charAt(0);
		for (i=1;i<=N;i++){		
			System.out.print("Masukan Nilai ke-"+ i +"= ");
            Nilai = input.nextInt();
			if (pilihan =='A'){
				min=tes.pilihanA(Nilai,min);
			}
			if (pilihan == 'B'){
				max=tes.pilihanB(Nilai,max);
			}
		}
		
		System.out.println("Banyak Data= " + N);
		if (pilihan == 'A'){
			System.out.println("Nilai minimum= " + min);
		} else {
			System.out.println("Nilai maximum= " + max);
		}
		
	}
}

class minmax{
	int pilihanA(int mx, int mi){
		if(mx<mi){
			mi=mx;
			return mi;
		}
		return mi;
	}
	
	int pilihanB(int mx, int mi){
		if(mx>mi){
			mi=mx;
			return mi;
		}
		return mi;
	}
}
