import java.util.Scanner;

public class PositiveNegative {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a double-precision number to check negative/positive: ");
    double number = reader.nextDouble();
    reader.close();

    if (number > 0)
      System.out.println(number + " is positive.");
    else if (number < 0)
      System.out.println(number + " is negative.");
    else 
      System.out.println(number + " is 0.");
  }
}
