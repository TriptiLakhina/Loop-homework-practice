import java.util.Scanner;

public class PrimeNumbers {




    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
   //     PrimeNumbers primeNumbers=new PrimeNumbers();
        System.out.println("Please enter a number to check if it is a prime number");
        int number=scanner.nextInt();
        if (checkPrimeNumber(number)){
            System.out.println(number + " is a prime number");
        }else {
            System.out.println(number+ " is not a prime number");
        }
  //      primeNumbers.checkPrimeNumber();


    }



    public static boolean checkPrimeNumber(int number) {


        if (number <= 1) {
            return false;
        }

        for (int i=2; i<Math.sqrt(number);i++){
            if (number%i==0){
                return false;
            }
        }

        return true;
    }
}
