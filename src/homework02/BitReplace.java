package homework02;

public class BitReplace {
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex - 1);
    }
}
