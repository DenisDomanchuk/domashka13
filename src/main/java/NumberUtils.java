import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum = number + sum;
        }
        return sum;
    }


    public List<Integer> getMultiplyOddNumber(List<Integer> numbers) {
        List<Integer> multiplyNums = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                multiplyNums.add(numbers.get(i));
            }

        }
        return multiplyNums;
    }
}
