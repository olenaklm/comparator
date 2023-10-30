package comparator;

import java.util.Comparator;

public class CatNameAgeComparator implements Comparator<ComparativeCatWithAge> {
    @Override
    public int compare(ComparativeCatWithAge cat1, ComparativeCatWithAge cat2) {
        int result;
        result = cat1.getName().compareTo(cat2.getName());
        if( result == 0 ) {
            result = cat1.getAge() - cat2.getAge();
            if ( result == 0 ) {
                result = cat1.getWeight() - cat2.getWeight();
            }
        }

        return result;
    }
}
