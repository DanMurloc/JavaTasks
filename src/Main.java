import javax.xml.transform.Source;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] array = Search.generatedArray(100000000);
        Arrays.sort(array);
        var se = new Search();
        long time = System.currentTimeMillis();
        se.bruteForceIndex(array,0.5);
        System.out.print("time 1: ");
        System.out.println(System.currentTimeMillis()-time);
        time = System.currentTimeMillis();
        System.out.print("time 2: ");
        se.binarySearchRecursively(array,0.5);
        System.out.println(System.currentTimeMillis()-time);

    }
}