import java.util.SortedMap;
import java.util.TreeMap;

public class Bins {

    private final int maxBinValue;
    private int minBinValue;

    private SortedMap<Integer, Integer> bin = new TreeMap<Integer, Integer>();

    public Bins(int minBinValue, int maxBinValue)
    {
        this.minBinValue = minBinValue;
        this.maxBinValue = maxBinValue;
        for (int i = minBinValue; i <= maxBinValue ; i++) {
            bin.put(i, 0);
        }

    }

    public int getMaxBinValue() {
        return maxBinValue;
    }

    public int getMinBinValue() {
        return minBinValue;
    }

    public Integer getBin(int key) {
        return bin.get(key);
    }

    public void incrementBin(int key) {
        Integer currentValue = getBin(key);
        bin.put(key,++currentValue);
    }
}
