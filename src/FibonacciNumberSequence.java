import java.util.Scanner;

public class FibonacciNumberSequence {
    Scanner scanner=new Scanner(System.in);



    public static void main(String[] args){
        FibonacciNumberSequence fibonacciNumberSequence=new FibonacciNumberSequence();
        fibonacciNumberSequence.printFibonacciSequence();

    }



    public void printFibonacciSequence(){


        System.out.println("Please input a number to see Fibonacci number sequence upto your number");

        int n=scanner.nextInt();

        int a=0,b=1,nextnum;
        System.out.println("Fibonacci number sequence upto your number "+ n+ " is:" );
        for (int i = 1; i <= n; i++) {



            if (i<=1) {
                nextnum = i;
                System.out.println(i);


            }else {
                nextnum=a+b;
                if (nextnum>n)
                    break;
                a=b;
                b=nextnum;
                System.out.println(nextnum);


            }




            }


        }}

//        int i2=1;
//        int i=0;
//        int sumOfPrevTwo = i + i2;
//        i = i2;
//        i2 = sumOfPrevTwo;
//       // i++;
//
//        if (i==sumOfPrevTwo)
//        for (int i=0; i <=n  ; i++) {
//         //   System.out.println(i);
//
//
//
//
//            System.out.println("i1");

        //    if (i==sumOfPrevTwo){











//    int count, num1 = 0, num2 = 1;
//        System.out.println("How may numbers you want in the sequence:");
//                Scanner scanner = new Scanner(System.in);
//                count = scanner.nextInt();
//                scanner.close();
//                System.out.print("Fibonacci Series of "+count+" numbers:");
//
//                int i=1;
//                while(i<=count)
//                {
//                System.out.print(num1+" ");
//                int sumOfPrevTwo = num1 + num2;
//                num1 = num2;
//                num2 = sumOfPrevTwo;
//                i++;