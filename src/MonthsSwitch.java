import java.util.Scanner;

public class MonthsSwitch {

    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        MonthsSwitch monthsSwitch=new MonthsSwitch();
        monthsSwitch.switchMonth();



    }




    // no return type no parameters
    void switchMonth(){
        System.out.println("Enter any number from 1-12 for month");     //acknowledge user what to input
        int number = scanner.nextInt();
        // String month;

        switch (number){
            case 1:
                System.out.println("Month number " +number+ " is January");
                break;

            case 2:
                System.out.println("Month number " +number+ " is February");
                break;

            case 3:
                System.out.println("Month number " +number+ " is March");
                break;

            case 4:
                System.out.println("Month number " +number+ " is April");
                break;

            case 5:
                System.out.println("Month number " +number+ " is May");
                break;

            case 6:
                System.out.println("Month number " +number+ " is June");
                break;

            case 7:
                System.out.println("Month number " +number+ " is July");
                break;

            case 8:
                System.out.println("Month number " +number+ " is August");
                break;

            case 9:
                System.out.println("Month number " +number+ " is September");
                break;

            case 10:
                System.out.println("Month number " +number+ " is October");
                break;

            case 11:
                System.out.println("Month number " +number+ " is November");
                break;

            case 12:
                System.out.println("Month number " +number+ " is December");
                break;

            default:
                System.out.println("Invalid entry, please enter a number only from 1-12 for month");

        }

    }
}
