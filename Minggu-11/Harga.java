import java.util.Scanner;
public class Harga {
    
     public static void main(String[] args) {
        ItemGAME game = new ItemGAME();
        Scanner input = new Scanner(System.in);
        System.out.println("Merek yang tersedia");
        System.out.println("1. HARGA ITEM 1");
        System.out.println("2. HARGA ITEM 2");
        System.out.println("3. HARGA ITEM 3"); 
        System.out.println("4. HARGA ITEM 4");
        System.out.print("masukkan Pilihan Anda : ");
        int n = input.nextInt();
        if(n == 1){
            System.out.println(game.getItem1());
        }
        if(n == 2){
            System.out.println(game.getItem2());
        }
        if(n == 3){
            System.out.println(game.getItem3());
        }
        if(n == 4){
            System.out.println(game.getItem4());
        }
    }
}