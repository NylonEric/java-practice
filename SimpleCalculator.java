import java.util.Scanner;

class SimpleCalculator {
  public static void main(String[] args) {
    char operator;
    Double num1, num2, result;

    // create Scanner object:
    Scanner input = new Scanner(System.in);

    // enter operator:
    System.out.print("what operation would you like to use? (*, /, +, -): ");
    operator = input.next().charAt(0);
    
    // enter numbers:
    System.out.print("enter first number: ");
    num1 = input.nextDouble();

    System.out.print("enter second number: ");
    num2 = input.nextDouble();

    switch(operator) {
      case '+':
        result = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, result);
        break;
      case '-':
        result = num1 - num2;
        System.out.printf("%d + %d = %d", num1, num2, result);
        break;
      case '*':
        result = num1 * num2;
        System.out.printf("%d + %d = %d", num1, num2, result);
        break;
      case '/':
        result = num1 / num2;
        System.out.printf("%d + %d = %d", num1, num2, result);
        break;
      default: 
        System.out.print("invalid operation!");
    break;
      } 
      input.close();
  }
}
