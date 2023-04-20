import java.util.Random;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Triangle {
    Map<String, Integer> treemap = new TreeMap<String, Integer>();
    public static String triangle(int a, int b, int c){
        if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
            if (a==b || a==c || b==c) {
                if (a==c && a==b)
                    return ("equilateral triangle.\n");
                else if (a==c||b==c)
                    return ("isosceles triangle.\n");
            }
            else
                return ("triangle.\n");
        }
        else
            return ("non-triangle.\n");
        return "No Result\n";
    }
}