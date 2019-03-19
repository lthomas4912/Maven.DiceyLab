import org.junit.Assert;
import org.junit.Test;

public class DiceTest {


        @Test
        public void testTossAndSum1() {
            //Given 5 dice
            Dice dice = new Dice(5);

            //When
            int actual = dice.tossAndSum();

            //Then
            Assert.assertTrue(actual >= 6 && actual <= 30);
        }

        @Test
        public void testTossAndSum2() {
            //Given 100 dice
            Dice dice = new Dice(100);

            //When
            int actual = dice.tossAndSum();

            //Then
            Assert.assertTrue(actual >= 100 && actual <= 600);
        }

        @Test
        public void setNumberOfDice() {
            //Given
            Dice dice = new Dice(3);
            int expectedNumberOfDice = 3;

            //When
            int actual = dice.getNumberOfDice();

            //Then
            Assert.assertEquals(expectedNumberOfDice, actual);
        }
}
