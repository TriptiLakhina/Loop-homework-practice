import java.util.Scanner;

public class XSum1To20 {
Scanner scanner=new Scanner(System.in);
    public static void main (String[]args)
    {
        XSum1To20 xSum1To20=new XSum1To20();
        xSum1To20.checkSum();

    }



    public void checkSum(){
        System.out.println("Enter an integer number from range 1-20 ");

        int a = scanner.nextInt();
       //. int b = scanner.nextInt();

        int sum = 0;

        if ((a<=20) && (a>0))
        {
            for (int x = 0; x <= a; x++)
                sum = sum + x;
            System.out.println ("The sum of " +a+ " is " + sum);



        }else{

            System.out.println("Invalid entry. Please input number from range 1-20.");}



    }
}
