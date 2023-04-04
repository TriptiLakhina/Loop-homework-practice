import java.util.Scanner;

public class DivisibleNumbers2 {
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        DivisibleNumbers2 divisibleNumbers2 = new DivisibleNumbers2();
        divisibleNumbers2.divide();

    }


    public void divide() {
        System.out.println("Enter 2 integer numbers to see the full list of numbers divisible by number 3 & 5 within your provided range");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Here is the list of numbers from your range "+ number1 + "-" + number2 + " which are divisible by number 3");
        for (int i = number1; i <= number2; i++) {
            if (i % 3 == 0) {
                System.out.println(i);

            }


        }
        System.out.println("\nHere is the list of numbers from your range "+ number1 + "-" + number2 + " which are divisible by number 5");
        for (int i = number1; i <= number2; i++) {
            if (i % 5 == 0) {

                System.out.println(i);

            }
        }
    }
}


//        System.out.println("Enter either number 3 or 5 to see the full list of numbers divisible by your number from 1-100");
//        int number = scanner.nextInt();


//
//        if ((number == 3)||(number==5))
//        {
//            for (int i = 3; i % number == 0; i++)
//            {
//                System.out.println("Here is the list of numbers from 1-100 which are divisible by your number " + number);
//                System.out.println(i + "\n");
//
//            }
//                else {
//                    System.out.println("Invalid entry. Please enter either number 3 or 5 ");
//                    break;
//                }
//        }else {
//            System.out.println("Invalid entry. Please enter either number 3 or 5 ");
//
//        }
//    }
//        if (number==5){
//            for (int i = 5; i % number == 0; i++) {
//               // if ((i <= 100) || (i >= 1)) {
//
//                    System.out.println("Here is the list of numbers from 1-100 which are divisible by your number " + number);
//                    System.out.println(i + "\n");
//
//                }
//                //break;
//            }
      //  }

//









//  if (number == 3)
//      {
//            for (int i = 3; i % number == 0; i++) {
//                if ((i<=100)||(i>=1)){

//   System.out.println("Here is the list of numbers from 1-100 which are divisible by your number " + number);
//                System.out.println(i);
//
//            }else {
//                    System.out.println("Invalid entry. Please enter either number 3 or 5 ");
//                    break;
//                }


//      }
//        System.out.println("Here is the list of numbers from 1-100 which are divisible by your number " + number);
//        System.out.println();

//    } else if (number==5){
//            for (int i=5;i%number==0;i++){
//                if ((i<=100)||(i>=1)){
//                    break;

//  }  }
//}}else{ System.out.println("Invalid entry. Please enter either number 3 or 5 ");
//
//
