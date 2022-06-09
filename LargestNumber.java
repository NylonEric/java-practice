import java.util.Scanner;
import java.util.Arrays;

public class LargestNumber {
  public static void main(String[] args) {
  int arraySize;
  double[] numberArray = null;
  String arrayString;
  Scanner reader = new Scanner(System.in);

  // input:
  System.out.print("Welcome to the largest number search\nHow large of an array of double-precision floating-point numbers would you like to enter? ");
  arraySize = reader.nextInt();
  numberArray = new double[arraySize];
  double largest = numberArray[0];
  double temp;
  for (int i = 0; i < arraySize; i++ ) {
    System.out.printf("please enter array item #%d: ", i + 1);
    temp = reader.nextDouble();
    numberArray[i] = temp;
  }

  // search:
  for (double number: numberArray) {
    if (largest < number) {
      largest = number; 
    }
  }

  arrayString = Arrays.toString(numberArray);
  System.out.printf("The largest item in the array %s is: %f%n", arrayString, largest);
  }
}