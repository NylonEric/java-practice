import java.util.Scanner;

public class PrintInteger {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = reader.nextInt();
    reader.close();
    System.out.println("You entered: " + number);
  }
}