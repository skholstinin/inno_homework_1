package ru.innopolis.stc12.hw1;
//import java.lang.String;

public class MathBox {

    public MathBox() {

    }


    public int summa(Integer a, Integer b) {
        return a + b;
    }

    ;

    public String summa(String a, String b) {
        String result;
        result = a + b;
        return result;
    }

    ;

    public int diff(Integer a, Integer b) {
        return a - b;
    }

    public long factorial(Integer a) {
        long y = 1;
        for (; a > 0; a--) {
            y *= a;
        }
        return y;
    }

    ;

    public long factorial1(Integer a) {
        return (a == 0) ? 1 : a * factorial1(a - 1);
    }

    public double dividerExceptionInside(Integer a, Integer b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("You can't divide it by zero");
            return 0;
        }
    }

    ;

    public double dividerExceptionInside(Double a, Double b) {
        double result = 0;
        try {
            result = a / b;
        } catch (Exception e) {

        }
        ;
        return result;
    }

    ;

    public double divider(Integer a, Integer b) throws MyException {
        if (b == 0) {
            throw new MyException("You can't divide it by zero");
        } else
            return a / b;
    }

    ;

}
