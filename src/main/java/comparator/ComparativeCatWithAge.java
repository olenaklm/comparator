package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Example 10
public class ComparativeCatWithAge implements Comparable<ComparativeCatWithAge> {
    String name;
    int age;
    int weight;

    public ComparativeCatWithAge(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ComparativeCatWithAge{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

        @Override
    public int compareTo(ComparativeCatWithAge cat) {
        return (age - cat.getAge());
    }

//    @Override
//    public int compareTo(ComparativeCatWithAge cat) {
//        return cat.getAge() - age;
//    }


    public static void main(String[] args) {
        List<ComparativeCatWithAge> comparativeCatList = new ArrayList<>();

        ComparativeCatWithAge murkaNew2 = new ComparativeCatWithAge("Murka", 4, 1);
        ComparativeCatWithAge vaske = new ComparativeCatWithAge("Vaska", 5, 2);
        ComparativeCatWithAge murka = new ComparativeCatWithAge("Murka", 4, 3);
        ComparativeCatWithAge murkaNew = new ComparativeCatWithAge("Murka", 10, 1);
        ComparativeCatWithAge pushok = new ComparativeCatWithAge("Pushok", 7, 2);

        comparativeCatList.add(murkaNew2);
        comparativeCatList.add(murkaNew);
        comparativeCatList.add(vaske);
        comparativeCatList.add(murka);
        comparativeCatList.add(pushok);

        Collections.sort(comparativeCatList);

        for(ComparativeCatWithAge cat : comparativeCatList) {
            System.out.println(cat);
        }
        System.out.println("--------------------------------");

        // Example
        Collections.sort(comparativeCatList, new CatAgeComparator());

        for(ComparativeCatWithAge cat : comparativeCatList) {
            System.out.println(cat);
        }

        System.out.println("--------------------------------");
        Collections.sort(comparativeCatList, new CatNameComparator());

        for(ComparativeCatWithAge cat : comparativeCatList) {
            System.out.println(cat);
        }

        System.out.println("--------------------------------");
        Collections.sort(comparativeCatList, new CatNameAgeComparator());

        for(ComparativeCatWithAge cat : comparativeCatList) {
            System.out.println(cat);
        }

        System.out.println("--------------------------------");
        Collections.sort(comparativeCatList, new CatNameComparatorDESC());

        for(ComparativeCatWithAge cat : comparativeCatList) {
            System.out.println(cat);
        }

    }
}
