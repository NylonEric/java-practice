import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int base, exponent;
    long result = 1;
    
    System.out.printf("Welcome to the power evaluator!\nPlease enter your base: ");
    base = reader.nextInt();
    System.out.printf("Please enter an exponent: ");
    exponent = reader.nextInt();
    reader.close();
    
    int count = exponent;
    while (count != 0) {
      result *= base;
      count--;
    } 

    System.out.printf("The result of the base (%d) raised to the (%d) power is: %d%n", base, exponent, result);
  } 
}
