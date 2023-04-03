import java.util.Scanner;

public class DivisibleNumbers
{
    Scanner scanner=new Scanner(System.in);



    public static void main(String[]args){
        DivisibleNumbers divisibleNumbers=new DivisibleNumbers();
        divisibleNumbers.divide();

    }



    public void divide()
    {
        System.out.println("Enter either number 3 or 5 to see the full list of numbers divisible by your number from 1-100");
        int number = scanner.nextInt();


        if (number==3)
        {
            System.out.println("Here is the list of numbers from 1-100 which are divisible by your number " + number);
            for (int i = 1; i <= 100; i++) {
                if (i % number == 0)
                    System.out.print(i + "\n");
            }
        } else if (number==5)
        {
            System.out.println("Here is the list of numbers from 1-100 which are divisible by your number " + number);
            for (int i=1; i<=100; i++)
            {
            if (i % 5 == 0)
                System.out.print(i + ", " );
            }
        } else
        {
            System.out.println("Invalid entry. Please enter either number 3 or 5 ");
        }
    }
}

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