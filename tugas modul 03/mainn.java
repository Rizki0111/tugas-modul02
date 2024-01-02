import java.util.Scanner;

public class mainn {
  public static void main(String[] args) {
    // Data Member
    int Total_belanja = 0;

    // membuat Scanner menerima input dari keyboard
    Scanner scan = new Scanner(System.in);

    //mengambil input dari keyboard
    System.out.print("masukkan total belanja : ");
    Total_belanja = scan.nextInt();
    //total belanja
    if (Total_belanja >= 50000) {
      System.out.println("anda mendapatkan mouse : ");
    } else {
      System.out.println("belanja anda kurang dari RP.50000");
    }
    System.out.println("terima kasih telah belanja di toko kami");
    
   }
  }  

