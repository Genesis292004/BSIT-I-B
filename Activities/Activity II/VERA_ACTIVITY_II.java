import java.util.Scanner;

public class VERA_ACTIVITY_II{
  
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
      
        System.out.print(s:Enter your first number);
        int firstNumber=scanner.nextInt();
        System.out.print(s:Enter your second number);
        int secondNumber=scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product= firstNumber * secondNumber;

        System.out.println("Sum="+ sum);
        System.out.println("Difference="+ difference);
        System.out.println("Product="+ product);


    }
}      