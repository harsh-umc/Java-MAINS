import java.util.Random;

public class CardPicker {

    public static void main(String[] args) {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7",
                          "8", "9", "10", "Jack", "Queen", "King"};

        boolean[] selected = new boolean[52];
        Random rand = new Random();

        System.out.println("Your 4 random cards are:");

        int count = 0;

        for (int i = 0; i < 52 && count < 4; i++) {

            int cardNumber = rand.nextInt(52);

            if (!selected[cardNumber]) {

                selected[cardNumber] = true;

                int suit = cardNumber / 13;
                int rank = cardNumber % 13;

                System.out.println(ranks[rank] + " of " + suits[suit]);

                count++;
            }
        }
    }
}