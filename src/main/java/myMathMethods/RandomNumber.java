package myMathMethods;

public class RandomNumber {

    public long randomLong(long first, long end) {
        return Math.round(first + (end - first) * Math.random());
    }
}
