import java.util.Scanner;

public class SumNaturalNum {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number to get the sum of the natural numbers: ");
    int num = reader.nextInt();
    reader.close();
    int sum = 0;

    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    System.out.printf("Sum of natural numbers up to %d is: %d%n", num, sum);
  }
}