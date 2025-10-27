import java.util.Scanner;
import java.util.InputMismatchException;

class Player {
    private int numGuess;
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void guessNumber(Scanner scanner) {
        while (true) {
            try {
                System.out.println(playerName + ", guess the number (1-100):");
                numGuess = scanner.nextInt();
                if (numGuess < 1 || numGuess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    public int getNumGuess() {
        return numGuess;
    }

    public String getPlayerName() {
        return playerName;
    }
}

class Guesser {
    private int numGuess;

    public void guessNumber(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Hey Guesser, enter the secret number (1-100):");
                numGuess = scanner.nextInt();
                if (numGuess < 1 || numGuess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    public int getNumGuess() {
        return numGuess;
    }
}

class Umpire {
    private Guesser guesser;
    private Player player1;
    private Player player2;
    private Player player3;
    private Scanner scanner;

    public Umpire() {
        scanner = new Scanner(System.in);
        guesser = new Guesser();
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        player3 = new Player("Player 3");
    }

    public void getNumberFromGuesser() {
        guesser.guessNumber(scanner);
    }

    public void collectFromPlayers() {
        player1.guessNumber(scanner);
        player2.guessNumber(scanner);
        player3.guessNumber(scanner);
    }

    public void calculateResult() {
        int secretNumber = guesser.getNumGuess();
        int guess1 = player1.getNumGuess();
        int guess2 = player2.getNumGuess();
        int guess3 = player3.getNumGuess();

        System.out.println("\n--- Results ---");
        System.out.println("Secret Number: " + secretNumber);
        System.out.println("Player 1 guessed: " + guess1);
        System.out.println("Player 2 guessed: " + guess2);
        System.out.println("Player 3 guessed: " + guess3);
        System.out.println();

        boolean p1Win = (secretNumber == guess1);
        boolean p2Win = (secretNumber == guess2);
        boolean p3Win = (secretNumber == guess3);

        if (p1Win && p2Win && p3Win) {
            System.out.println("🎉 All players are winners!");
        } else if (p1Win && p2Win) {
            System.out.println("🎉 Player 1 and Player 2 are winners!");
        } else if (p1Win && p3Win) {
            System.out.println("🎉 Player 1 and Player 3 are winners!");
        } else if (p2Win && p3Win) {
            System.out.println("🎉 Player 2 and Player 3 are winners!");
        } else if (p1Win) {
            System.out.println("🎉 Player 1 is the winner!");
        } else if (p2Win) {
            System.out.println("🎉 Player 2 is the winner!");
        } else if (p3Win) {
            System.out.println("🎉 Player 3 is the winner!");
        } else {
            System.out.println("❌ No winners this round. Better luck next time!");
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("   Welcome to the Guesser Game!  ");
        System.out.println("=================================\n");

        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        System.out.println();
        umpire.collectFromPlayers();
        umpire.calculateResult();
        umpire.closeScanner();

        System.out.println("\nThanks for playing!");
    }
}
