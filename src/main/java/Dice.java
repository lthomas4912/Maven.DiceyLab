public class Dice {

    private int numberOfDice;

    public Dice(int numberOfDice)
    {
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum()
    {
        int sum = 0;
        int randomRoll = 0;

        for (int i = 0; i < numberOfDice; i++) {
            randomRoll = (int) (Math.random() * 6) + 1;
            sum += randomRoll;
        }

        return sum;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }
}
