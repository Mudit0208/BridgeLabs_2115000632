import java.util.HashMap;
import java.util.Map;

public class CacheResultExample {

    @FunctionalInterface
    interface Cacheable {
        int compute(int input);
    }

    static class CacheResult {
        private static final Map<Integer, Integer> cache = new HashMap<>();

        public static int getCachedResult(int input) {
            return cache.getOrDefault(input, -1);
        }

        public static void storeResult(int input, int result) {
            cache.put(input, result);
        }
    }

    public static class ExpensiveComputation {

        @CacheResult
        public int computeExpensiveResult(int input) {
            int cachedResult = CacheResult.getCachedResult(input);
            if (cachedResult != -1) {
                return cachedResult;
            }

            int result = input * input; // Example of expensive computation
            CacheResult.storeResult(input, result);
            return result;
        }
    }

    public static void main(String[] args) {
        ExpensiveComputation expensiveComputation = new ExpensiveComputation();

        System.out.println(expensiveComputation.computeExpensiveResult(5));
        System.out.println(expensiveComputation.computeExpensiveResult(5));
        System.out.println(expensiveComputation.computeExpensiveResult(10));
    }
}
