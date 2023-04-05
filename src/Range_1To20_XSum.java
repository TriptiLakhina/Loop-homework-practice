import java.util.Scanner;

public class Range_1To20_XSum {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Range_1To20_XSum range_1To20_xSum = new Range_1To20_XSum();
        range_1To20_xSum.checkSum();

    }


    public void checkSum() {
        System.out.println("\nEnter 2 integer numbers from 1-20 to provide a range pressing enter after each input ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        // int b = scanner.nextInt();

        int sum_x = 0;


        for (int i = number1; i <= number2; i++)
            sum_x = sum_x + i;

        if ((number1 <= 20) && (number1 > 0) && (number2 > 0) && (number2 <= 20)) {

            System.out.println("The sum of all the numbers in your range " + number1 + "-" + number2 + " is " + sum_x);


        } else {

            System.out.println("Invalid entry. Please input number from range 1-20.");
        }
    }
}

//        if ((a<=20) && (a>0))
//        {
//            for (int x = 0; x <= a; x++)
//                sum = sum + x;
//            System.out.println ("The sum of " +a+ " is " + sum);

//          if (number1<0 && number2>20)

//        }else{

   //         System.out.println("Invalid entry. Please input number from range 1-20.");}




//}
