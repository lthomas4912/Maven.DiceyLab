public class Simulation {

    private int numberOfDice;
    private int numberOfThrows;
    private Dice dice;
    private Bins bin;

    public Simulation(int numberOfDice, int numberOfThrows) {
        this.numberOfDice = numberOfDice;
        this.numberOfThrows = numberOfThrows;
        this.bin = new Bins(numberOfDice, numberOfDice*6);
        this.dice = new Dice(numberOfDice);
    }

    public int getNumberOfDice() {
        return numberOfDice;

    }

    public int getNumberOfThrows() {
        return numberOfThrows;
    }

    public void runSimulation() {
        for (int i = 0; i < numberOfThrows; i++) {
            Integer value = dice.tossAndSum();
            this.bin.incrementBin(value);
        }
    }

    public String printResults() {
        String results = "";
        float percentage;

        for (int i = numberOfDice; i <= (numberOfDice*6); i++) {
            percentage = (float)bin.getBin(i)/(float)this.numberOfThrows;

            results += String.format("%2d :%9d: %.2f ", i, bin.getBin(i), percentage);
            results += printStars((int) Math.floor((bin.getBin(i)/(numberOfThrows/100))));
            results += "\n";
        }
        return results;
    }

    public String printStars(int numberOfStars) {
        String stars = "";

        for (int i = 0; i < numberOfStars; i++) {
            stars += "*";
        }

        return stars;
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 100);

        simulation.runSimulation();

        System.out.println(simulation.printResults());
    }


}
