import java.util.Scanner;

public class NaturalNumberSum {

    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        NaturalNumberSum naturalNumberSum=new NaturalNumberSum();
        naturalNumberSum.sumOfNaturalNumbers();

    }


    void sumOfNaturalNumbers(){
        System.out.println("Enter any natural number");
        //.  int num1=scanner.nextInt();
        int numn=scanner.nextInt();

        int sum=0;
        System.out.println("\nHere is the list of all natural numbers upto your number " + numn);

        for (int i = 1;i<=numn; i++) {
            sum+=i;
            System.out.println(i);




        }
        if (numn>0){
        System.out.println("\nSum of all above listed "+numn+ " natural numbers = " +sum);}
        else if (numn<=0){
            System.out.println("Invalid entry, please enter a natural number i.e., a positive whole number.");
        }


    }
}
