import java.util.Scanner;

public class FactorialNumber {

    public static void main(String []args)
    {
        //Take input from the user
        //Create an instance of the Scanner Class
        Scanner scanner=new Scanner(System.in);
        //Declare and Initialize the variable
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int factorialnumber=1;
        for(int i=1;i<=num;i++)
        {
            factorialnumber=factorialnumber*i;
        }
        System.out.println("Factorial of the number: "+factorialnumber);
    }
}
