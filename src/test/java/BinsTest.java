import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void constructorTest1()
    {
        //Given
        Bins bin = new Bins(2, 12);

        //When
        int actualMin = bin.getMinBinValue();
        int actualMax = bin.getMaxBinValue();
        int expectedValue = 0;
        int actualValue = bin.getBin(6);

        //Then
        Assert.assertEquals(2, actualMin);
        Assert.assertEquals(12, actualMax);
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void constructorTest2()
    {
        //Given
        Bins bin = new Bins(50, 300);

        //When
        int actualMin = bin.getMinBinValue();
        int actualMax = bin.getMaxBinValue();
        Integer expectedValue = 0;
        Integer actualValue = bin.getBin(10);

        //Then
        Assert.assertEquals(50, actualMin);
        Assert.assertEquals(300, actualMax);
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testIncrementBin()
    {
        //Given
        Bins bin = new Bins(2, 12);
        bin.incrementBin(10);

        //When
        Integer expected = 1;
        Integer actual = bin.getBin(10);

        //Then
        Assert.assertEquals(expected, actual);
    }

}
