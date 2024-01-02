import java.util.Scanner;

public class percabangan {
  public static void main(String[] args) {
    // Deklarasi variabel
    boolean isMember;
    int totalBelanja;

    // Membuat scanner untuk menerima input dari keyboard
    Scanner scanner = new Scanner(System.in);

    // Menerima input dari keyboard
    System.out.print("Apakah Anda memiliki kartu member? (Y/T): ");
    isMember = scanner.next().charAt(0) == 'Y';
    System.out.print("Masukkan total belanja Anda: ");
    totalBelanja = scanner.nextInt();

    // Percabangan
    if (isMember) {
      if (totalBelanja >= 100000) {
        System.out.println("Diskon yang diberikan adalah 10%.");
      } else {
        System.out.println("Diskon yang diberikan adalah 0%.");
      }
    } else {
      if (totalBelanja >= 50000) {
        System.out.println("Diskon yang diberikan adalah 5%.");
      } else {
        System.out.println("Diskon yang diberikan adalah 0%.");
      }
    }
  }
}
