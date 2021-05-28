public class Test3 {

        //Initialize lists of variables required for the deck of cards
        int[] deck = new int[52];
        String[] suits = {"S", "H", "D", "C"};
        String values[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        //Make a new deck
        public void init() {
            for (int i = 0; i < deck.length; i++) {
                deck[i] = i;
            }
        }

        //This is the main task method that shuffles the deck (See main method to confirm it works properly).
        public void shuffle() {
            for (int i = 0; i < deck.length; i++) {
                int index = (int) (Math.random() * deck.length);
                int temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }
        }

        //Display the deck whether or not it has been shuffled (See main class for confirmation).
        public void displayDeck() {
            for (int i = 0; i < 52; i++) {
                String suit = suits[deck[i] / 13];
                String rank = values[deck[i] % 13];
                System.out.println(rank + suit + ", ");
            }
        }
    }

