package comparator;

import java.util.Comparator;

public class CatNameComparatorDESC implements Comparator<ComparativeCatWithAge> {

    @Override
    public int compare(ComparativeCatWithAge o1, ComparativeCatWithAge o2) {
        return o1.getName().compareTo(o2.getName()) * -1;
    }
}
