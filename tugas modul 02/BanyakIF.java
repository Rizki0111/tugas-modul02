import java.util.Scanner;

public class BanyakIF {
  public static void main(String[] args) {
    // Data Members
    int nilai;
    String grade;

    // Create a Scanner object to receive input from the keyboard
    Scanner scan = new Scanner(System.in);

    // Prompt the user to enter a value
    System.out.print("Masukkan nilai : ");
    nilai = scan.nextInt();

    // Determine the grade based on the value using if-else statements
    if (nilai >= 80) {
      grade = "A";
    } else if (nilai >= 70) {
      grade = "B";
    } else if (nilai >= 60) {
      grade = "C";
    } else if (nilai >= 50) {
      grade = "D";
    } else {
      grade = "E";
    }

    // Print the value and grade
    System.out.println("Nilai: " + nilai);
    System.out.println("Grade: " + grade);
  }
}
