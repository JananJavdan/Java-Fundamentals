package Project1;

public class ClawMachine extends Casino{
    private int numbersOfTries;
    private int moneyInTheBank;

    public ClawMachine(){
        this.numbersOfTries = 0;
        this.moneyInTheBank = 0;
    }
    public int getMoneyInTheBank(){
        return moneyInTheBank;
    }

    // checking if machine is ready to win
    public boolean readyToWin(){
        return numbersOfTries>5 && (numbersOfTries %5 == 0);
    }
    //checking if machine is ready to a big win
    public boolean readyToWinBigTime(){
        return numbersOfTries>10;
    }
    //playing
    public String playGame(int MoneyPaid){
        if (MoneyPaid>=1 && Casino.playerBalance>=MoneyPaid){
            Casino.casinoBalance += MoneyPaid; //add payment in casino bank
            Casino.casinoBalance -= MoneyPaid; //player balance decrease
            moneyInTheBank += MoneyPaid;
            numbersOfTries++; //increase numbers of tries

            //checking wining condition
            if (readyToWin()){
                return "Congratulation you win a small prize";
            } else if (readyToWinBigTime()) {
                return "Wow you win a big prize";
            }else {
                return "Try again. Better luck next time";
            }
        }else {
            return "Please insert at least 1 euro to play the game";
        }
    }

}
