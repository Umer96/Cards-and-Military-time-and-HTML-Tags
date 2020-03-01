package sjsu.edu;

import java.util.Scanner;

public class ExtraCredit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the HTML tag: ");
        String HTML = in.nextLine();

        if(HTML.matches("(<.*.>*)")){

            if (HTML.matches("((.*)</.*.>)")) {

                System.out.println("The html tag is correct.");
            }
            else {
                System.out.println("The html tag is incorrect.");
            }
        }
        else {
            System.out.println("HTML statement is incorrect. Please check your tags.");
        }
    }
}
