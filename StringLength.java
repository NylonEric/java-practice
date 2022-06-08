import java.util.Scanner;

public class StringLength {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("enter a string: ");
    String string_1, string_2;
    string_1 = reader.next();
    System.out.print("enter a second string: ");
    string_2 = reader.next();
    reader.close();
    int length_1 = string_1.length();
    int length_2 = string_2.length();

    System.out.printf("The length of the first string \"%s\" is %d.\nThe length of the second string \"%s\" is %d%n", string_1, length_1, string_2, length_2);
  }
}
