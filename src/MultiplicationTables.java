import java.util.Scanner;

public class MultiplicationTables {
    Scanner scanner=new Scanner(System.in);



    public static void main(String[]args){
        MultiplicationTables multiplicationTables=new MultiplicationTables();
        multiplicationTables.getMultiplicationTable();




    }



    public void getMultiplicationTable(){
        System.out.println("Enter any Integer number to get its multiplication table");
        int number=scanner.nextInt();


        for (int i=number; i<=number; i++){
            for (int j = 1; j <= 12; j++) {
                System.out.println(i +" x " +j + " = " + i*j);

            }
        }

    }
}
//.
