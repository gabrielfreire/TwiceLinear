import java.util.*;

/**
 * Created by gabriel on 17/01/2017.
 */
public class TwiceLinear {

    public static void main(String[] args) {
        System.out.println(dbLinear(100));
    }

    public static int dbLinear(int n){

        SortedSet<Integer> u = new TreeSet<Integer>();
        u.add(1);
        for(int i = 0; i < n; i++){
            int x = u.first();
            u.add(x * 2 + 1);
            u.add(x * 3 + 1);
            u.remove(x);
        }
        System.out.println(u);
        return u.first();
    }
}
