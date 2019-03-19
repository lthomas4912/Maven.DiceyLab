
import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {





    @Test
    public void testConstructor()
    {
        //Given
        int numberOfDice = 2;
        int numberOfThrows = 10;
        Simulation simulation = new Simulation(numberOfDice, numberOfThrows);

        //When
        int actualNumberOfDice = simulation.getNumberOfDice();
        int actualNumberOfThrows = simulation.getNumberOfThrows();

        //Then
        Assert.assertEquals(numberOfDice, actualNumberOfDice);
        Assert.assertEquals(numberOfThrows, actualNumberOfThrows);
    }


}
