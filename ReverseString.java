import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a string to be reversed: ");
    String string = reader.nextLine();
    reader.close();
    String reversed = "";

    for (int i = string.length() - 1; i >= 0; i--) {
      reversed = reversed + string.charAt(i);
    }
    System.out.printf("The reverse of the given string %s is:%n %s%n", string, reversed);
  }
}
