package effectivejava.chapter2;

/**
 * Autoboxing blurs but does not erase the distinction
 * between primitive and boxed primitive types
 */
public class Item6 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long s = sum();
        System.out.println(String.format("TimeTaken %d millis for sum: %d", (System.currentTimeMillis()-startTime), s));
    }
    // Hideously slow! Can you spot the object creation?
    private static long sum() {
        //Long sum = 0L; // 7872 millis
        long sum = 0L; // 1077 millis
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }
}
