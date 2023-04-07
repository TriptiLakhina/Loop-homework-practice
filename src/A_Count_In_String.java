import java.util.Scanner;

public class A_Count_In_String {
    Scanner scanner=new Scanner(System.in);


    public static void main(String[] args) {
        A_Count_In_String a_count_in_string = new A_Count_In_String();
        a_count_in_string.countTotalNumberOfA();
    }



    public void countTotalNumberOfA(){
        System.out.println("Enter any word/s or sentence/s");
        String sentence=scanner.nextLine();
        int count=0;
        int charCount = sentence.length() - sentence.replaceAll("a", "").length();

        for (int i = 0; i < charCount; i++) {
            if (sentence.charAt(i) != ' ')
            count++;


        } System.out.println("Total number of character 'a' in your string" + " \"" + sentence + "\" "+ "are: "+ count);
    }
}
//.
