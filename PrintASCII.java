import java.util.Scanner;

public class PrintASCII {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter an ASCII character: ");

    char character = reader.next().charAt(0);
    int ascii = (char) character;
    // int castAscii = (int) character;

    System.out.println("The ASCII value of " + character + " is: " + ascii);
    // System.out.println("The ASCII value of " + character + " is: " + castAscii);
  }
}