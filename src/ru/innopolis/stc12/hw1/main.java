package ru.innopolis.stc12.hw1;

public class main {
    public static void main(String[] args) {
        MathBox mathBox = new MathBox();

        System.out.println(mathBox.factorial1(0));
        System.out.println(mathBox.factorial1(5));
        System.out.println(mathBox.factorial(0));
        System.out.println(mathBox.factorial(5));

        System.out.println(mathBox.diff(145, 35));

        System.out.println(mathBox.summa(165, 387));

        System.out.println(mathBox.dividerExceptionInside(12, 0));

        System.out.println(mathBox.dividerExceptionInside(12.0, 0.0));

        try {
            System.out.println(mathBox.divider(12, 0));
        } catch (MyException e) {
            e.printStackTrace();

        }

        System.out.println(mathBox.summa("Маша+", "Саша"));

    }
}