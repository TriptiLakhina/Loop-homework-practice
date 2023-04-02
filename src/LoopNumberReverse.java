import java.util.Scanner;

public class LoopNumberReverse {

   // Scanner scanner=new Scanner(System.in);
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number to reverse");

        int number= scanner.nextInt();
        int reverse = 0;

      //we have not mentioned the initialization part of the for loop
        for(;number != 0;)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number=number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
