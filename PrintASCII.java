import java.util.Scanner;

public class PrintASCII {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter an ASCII character: ");

    char character = reader.next().charAt(0);
    int ascii = (char) character;

    System.out.println("The ASCII value of " + character + " is: " + ascii);
  }
}