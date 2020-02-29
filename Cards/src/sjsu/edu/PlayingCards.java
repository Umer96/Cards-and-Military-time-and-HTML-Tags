package sjsu.edu;

import java.util.Scanner;

public class PlayingCards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the card notation: ");
        String Cards = in.next();

        String First = "";
        String Second = houseOfCards(Cards);

        if (!(typeOfCards (Cards).equals("Type of the card not found"))){
            First = typeOfCards(Cards);
        }
        else{
            First = numberOfCards(Cards);
        }

        if (First.equals("0")){
            System.out.println("Not found");
        }
        else if(Second.equals("House of the card not found")){
            System.out.println(Second);
        }
        else {
            System.out.println(First+" of "+ Second);
        }

    }

    public static String typeOfCards(String Cards) {
        if(Cards.charAt(0)== 'A'){
            return "Ace";
        }
        else if (Cards.charAt(0) == 'J'){
            return "Jack";
        }
        else if (Cards.charAt(0) == 'Q'){
            return "Queen";
        }
        else if (Cards.charAt(0) == 'K'){
            return "King";
        }
        return "Type of the card not found";
    }

    public static String numberOfCards (String Cards) {
        int number = 0;

        for (int i = 1; i <= 10; i++) {
            if (((int)Cards.charAt(0))- 48 == i) {
                number = i;
            }
            if (((int)Cards.charAt(1))- 48 == i){
                number = 0;
                break;
            }
        }
            return "" + number;
    }

    public static String houseOfCards(String Cards) {
            if(Cards.charAt(1)== 'C'){
                    return "Clubs";
            }
            else if (Cards.charAt(1) == 'D'){
                return "Diamonds";
            }
            else if (Cards.charAt(1) == 'H'){
                return "Hearts";
            }
            else if (Cards.charAt(1) == 'S'){
                return "Spades";
            }
            return "House of the card not found";
        }
}
