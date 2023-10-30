package comparator;

import java.util.Comparator;

public class CatAgeComparator implements Comparator<ComparativeCatWithAge> {

    @Override
    public int compare(ComparativeCatWithAge cat1, ComparativeCatWithAge cat2) {
        return cat1.getAge() - cat2.getAge();
    }
}
