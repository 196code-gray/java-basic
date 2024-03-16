package static2.ex;

public class MathArrayUtils {
    static int sum(int[] values){
        int result = 0;
        for (int i : values) result += i;
        return result;
    }
    static double average(int[] val){
        return (double) sum(val) / val.length;
    }
    static int min(int[] val){
        int result = Integer.MAX_VALUE;
        for (int i : val) {
            result = Math.min(result, i);
        }
        return result;
    }
    static int max(int[] val){
        int result = Integer.MIN_VALUE;
        for (int i : val) result = Math.max(result, i);
        return result;
    }
}
