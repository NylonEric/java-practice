import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number to determine if it is odd or even: ");
    int num = reader.nextInt();
    reader.close();
    boolean isEven = num % 2 == 0;
    String answer;

    if (isEven == true) {
      answer = "even";
    } else {
      answer = "odd";
    }
    System.out.printf("The given number %d is %s%n", num, answer);
  }
}
