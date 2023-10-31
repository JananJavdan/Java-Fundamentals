package Project1;
import java.util.Random;
import java.util.Scanner;

public class SlotMachine extends Casino{
    private int currentPayout = 0;
    private int youWin = 0;
    private int odds;

    public SlotMachine(int playerBalance){
        super(playerBalance, 50);
        this.playerBalance = playerBalance;
    }
    private void whatOddsToGive() {
        if (currentPayout <= 800) {
            odds = 1;
        } else if (currentPayout <= 900) {
            odds = 1000;
        } else if (currentPayout <= 1000) {
            odds = 100;
        } else {
            odds = 10;
        }
    }
    public int playTheSlots(int playerBalance) {
        this.playerBalance = playerBalance;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to the Slotmachine (tm)!");
        System.out.println("Your balance is: " + this.playerBalance);
        System.out.println("Each game costs 50€.");
        System.out.println("A random number is generated between 0 and 7. If a 7 comes up, you will WIN 300€!");
        System.out.println("How many games do you wish to play?");
        int numberOfGames = myScanner.nextInt();


        if (playerBalance / (numberOfGames * 50) > 0) {
            this.playerBalance -= (numberOfGames * 50);
            this.currentPayout += (numberOfGames * 50);


            for (int slotCounter = 1; slotCounter <= numberOfGames; slotCounter++) {
                Random randomNumber = new Random();
                whatOddsToGive(); // Updating odds variable
                int slotNumber = randomNumber.nextInt(odds);
                System.out.println("Odds: " + odds + " Random number: " + slotNumber + " Payout: " + currentPayout);

                if (slotNumber == 7) {
                    System.out.println("A 7!!!! You WIN!!!");
                    this.currentPayout -= 300;
                    this.youWin += 300;
                    playerBalance += 300;
                    System.out.println("Your total winnings are: " + youWin + "!!!!");
                } else {
                    System.out.println(slotNumber + ": Sorry, no win. Better luck next time.");
                }
            }
        } else {
            System.out.println("You do not have enough money to play this many games.");
        }
        return youWin;
    }
    public int getCurrentPayout(){
        return currentPayout;
    }

    @Override
    public void launch(Scanner scanner) {

    }
}
