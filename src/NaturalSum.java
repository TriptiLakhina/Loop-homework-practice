import java.util.Scanner;

public class NaturalSum {

        Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            NaturalSum naturalSum = new NaturalSum();
            naturalSum.sumOfNaturalNumbers();

        }


        void sumOfNaturalNumbers() {
            System.out.println("Enter any number");
            //  int num1=scanner.nextInt();
            int numn = scanner.nextInt();

            int sum = 0;

            for (int i = 0; i <= numn; i++) {
                sum += i;
              //  System.out.println(i);
              //  System.out.println("Sum= " + i);
              //  System.out.println(i);

             //   if (i++<=numn);
               // break;


            }


            System.out.println("Sum of all natural number upto number " + numn + " = " + sum);



        }

}