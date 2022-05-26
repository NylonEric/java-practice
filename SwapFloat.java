import java.util.Scanner;

public class SwapFloat {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a floating-point number: ");
    float first = reader.nextFloat();
    System.out.print("Enter a second floating-point number: ");
    float second = reader.nextFloat();

    float temp = first;
    first = second;
    second = temp;

    System.out.println("--After swap:--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);
  }
}
