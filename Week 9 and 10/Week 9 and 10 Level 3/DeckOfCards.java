import java.util.Scanner;

public class DeckOfCards {

    // Method to Initialize the deck of cards with suits and ranks [cite: 229]
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length; // Calculate number of cards [cite: 227, 228]
        String[] deck = new String[numOfCards];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                // Deck is represented as "rank of suit" [cite: 230]
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    // Method to Shuffle the deck of cards [cite: 231]
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        // Iterate over the deck and swap each card with a random card [cite: 232, 234]
        for (int i = 0; i < n; i++) {
            // Generate a random card number [cite: 235]
            int randomCardNumber = i + (int) (Math.random() * (n - i)); 
            
            // Swap the current card with the random card [cite: 237]
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the deck of n cards to x number of players [cite: 238]
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        // Check if n cards can be distributed to x players [cite: 239]
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        // Create a 2D array to store the players and their cards [cite: 240]
        String[][] distributed = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        return distributed;
    }

    // Method to Print the players and their cards [cite: 242]
    public static void printPlayerCards(String[][] playersData) {
        if (playersData == null) return;

        for (int i = 0; i < playersData.length; i++) {
            System.out.println("\n--- Player " + (i + 1) + " ---");
            for (int j = 0; j < playersData[i].length; j++) {
                System.out.println(playersData[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create suits and ranks arrays [cite: 226]
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);
        printPlayerCards(distributedCards);
        
        sc.close();
    }
}