package comparator;

import java.util.Comparator;

public class CatNameComparator implements Comparator<ComparativeCatWithAge> {

    @Override
    public int compare(ComparativeCatWithAge cat1, ComparativeCatWithAge cat2) {
        return cat1.getName().compareTo(cat2.getName());
    }
}
