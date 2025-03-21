package ArrayListCombiner;

import Employee.Employee;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner {
    public static <E> void extendCombiner(ArrayList<E> first, ArrayList<? extends  E> second) {
        first.addAll(second);
    }

    public static <E> void superCombiner(ArrayList<? super  E> first, ArrayList<E> second) {
        first.addAll(second);
    }
}
