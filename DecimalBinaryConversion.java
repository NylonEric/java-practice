import java.util.Scanner;

public class DecimalBinaryConversion {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Would you like to convert\n (1) Decimal->Binary\nor (2)Binary->Decimal?\nenter number here: ");
    int choice, decimal;
    long binaryNumber;
    String inputMessage;
    choice = reader.nextInt();
    if (choice == 1) {
      inputMessage = "enter Decimal here: ";
      System.out.print(inputMessage);
      decimal = reader.nextInt();
      binaryNumber = convertDecimalToBinary(decimal);
      System.out.printf("The Binary representation of (%d) is: %d\n", decimal, binaryNumber);
    } else {
      inputMessage = "enter Binary digits here: ";
      System.out.printf(inputMessage);
      binaryNumber = reader.nextLong();
      decimal = convertBinaryToDecimal(binaryNumber);
      System.out.printf("The Decimal representation of (%d) is: %d\n", binaryNumber, decimal);
    }
    reader.close();
  };

  public static long convertDecimalToBinary(int num) {
    long binaryNum = 0;
    int i = 0, remaining = num, sum = 0;
    
    while (num != 0) {
      remaining = num % 2;
      binaryNum += remaining * Math.pow(10, i);
      num /= 2;
      i++;
    }
    return binaryNum;
  }

  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;

    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      i++;
    }
    return decimalNumber;
  }
}
