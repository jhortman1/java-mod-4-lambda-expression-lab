import java.util.function.IntUnaryOperator;

public class Main {
	// write the nextOddNum here
    public static OddNumberFinder nextOddNum = (x) -> x += (x % 2 == 0) ? 1 : 2;

    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
    }
    @FunctionalInterface
    interface OddNumberFinder{
        int applyAsInt(int num);
    }
}
