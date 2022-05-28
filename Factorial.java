import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter an integer to find the factorial: ");
    int input = reader.nextInt();
    reader.close();
    long factorial = 1;
    for (int n = input; n > 1; n--) {
      factorial *= n;
    }
    System.out.printf("Here is the factorial of %d: %n %d%n", input, factorial);
  }
}
