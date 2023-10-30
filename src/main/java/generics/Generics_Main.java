package generics;

import java.util.List;

public class Generics_Main {
    public static void main(String[] args) {
        MyDataSimple<Integer> dataSimple = new MyDataSimple<>(1);
        MyDataSimple<Integer> dataSimple2 = new MyDataSimple<>(3);

        int resultInteger = dataSimple.getT() + dataSimple2.getT();
        System.out.println("resultInteger: " + resultInteger);

        MyDataSimple<String> dataSimple3 = new MyDataSimple<>("one");
        MyDataSimple<String> dataSimple4 = new MyDataSimple<>("three");

        String resultString = dataSimple3.getT() + dataSimple4.getT();
        System.out.println("resultString: " + resultString);

        MyDataComplex<Integer, String, Number, Double, Boolean, Object> dataComplex = new MyDataComplex();
    }
}
