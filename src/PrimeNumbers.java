import java.util.Scanner;

public class PrimeNumbers
{
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        //     Scanner scanner=new Scanner(System.in);
             PrimeNumbers primeNumbers=new PrimeNumbers();
             primeNumbers.checkPrimeNumber();
//        System.out.println("Please enter a number to check if it is a prime number");
//        int number=scanner.nextInt();
//        if (checkPrimeNumber(number)){
//            System.out.println(number + " is a prime number");
//        }else {
//            System.out.println(number+ " is not a prime number");
//        }
        //      .primeNumbers.checkPrimeNumber();


    }


    public void checkPrimeNumber()
    {

        System.out.println("Please enter a number to check if it is a prime number");
        int number = scanner.nextInt();
        int printed=0;
        int squareroot = (int) Math.sqrt(number);
  //      double sqroot=Math.sqrt(number);
        //      checkPrimeNumber()=

        //     if (checkPrimeNumber){
        //         System.out.println(number + " is a prime number");
//        }else {
//            System.out.println(number+ " is not a prime number");


//        if (number <= 1)
//        {
//            System.out.println(number + " is not a prime number");
//        }

//int i=2;
      //  for (int i = 2; number % i == 0; i++)
        {
            for (int i=1; number >=1 ; i++)
            if (( number!=2)&&  (number!=3) && (number!=5) && (number % 2 == 0 || number==1 || (Math.pow(squareroot,2) == number) || number%3==0 || number%5==0))
//  && (number!=3) && (number!=5)
            {
                System.out.println(number + " is not a prime number");
                if (printed==0);
                break;
            } else if (number%number==0 )
            {
                System.out.println(number + " is a prime number");
                if (printed==0);
                break;
            }


        }
    }
}
//
//
//
//
//
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        //     PrimeNumbers primeNumbers=new PrimeNumbers();
//        System.out.println("Please enter a number to check if it is a prime number");
//        int number=scanner.nextInt();
//        if (checkPrimeNumber(number)){
//            System.out.println(number + " is a prime number");
//        }else {
//            System.out.println(number+ " is not a prime number");
//        }
//        //      primeNumbers.checkPrimeNumber();
//
//
//    }
//
//
//
//    public static boolean checkPrimeNumber(int number) {
//
//
//        if (number <= 1) {
//            return false;
//        }
//
//        for (int i=2; i<Math.sqrt(number);i++){
//            if (number%i==0){
//                return false;
//            }
//        }
//
//        return true;
//    }
//}
//
