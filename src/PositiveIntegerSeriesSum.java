import java.util.Scanner;

public class PositiveIntegerSeriesSum
{
    static Scanner scanner = new Scanner(System.in);


    // Driven Program
    public static void main(String[] args) {
        PositiveIntegerSeriesSum positiveIntegerSeriesSum = new PositiveIntegerSeriesSum();
        positiveIntegerSeriesSum.calculateSeriesSum();


    }


    void calculateSeriesSum()
    {
        System.out.println("Enter a positive integer number");
        int number = scanner.nextInt();

        double sum = 0;         //variable to store the running total of the sum or //// Declare and initialize a variable to store the sum
        for (int i = 1; i <= number; i++)
        {
            sum += (1.0 / i);   // add the next fraction to the sum


        }System.out.println("The sum of the series 1 + 1/2 + 1/3 + ...... + 1/"+number+" = "+sum);


    }
}

//     int n = 5;
//        System.out.printf("Sum is %f", calculateSeriesSum(number));
//
//        double i, s = 0.0;
//        for (i = 1; i <= number; i++)
//            s = s + 1/i;
//        return s;
//.

