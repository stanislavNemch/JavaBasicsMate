package JavaBasicsMate;

import java.util.Arrays;

/*
* У цьому завданні ти згадаєш як створити масив та попрацюєш із методами класу String.
* Ми створили метод markStringEnds(), який приймає рядок originalString.
* Твоє завдання: реалізуй метод так, щоби він повертав масив типу String
* з двох елементів: originalString з першим символом у верхньому регістрі та
* originalString з останнім символом у верхньому регістрі.
* */
public class MarkStringEnds {
    public static String[] markStringEnds(String originalString) {

        if ((originalString == null) || (originalString.length() == 0)){
            return new String[0];
        }

        int lastIndex = originalString.length() - 1;

        if (originalString.length() == 1){
            return new String[]{originalString.toUpperCase(), originalString.toUpperCase()};
        }

        return new String[]{originalString.substring(0, 1).toUpperCase() + originalString.substring(1),
                            originalString.substring(0, lastIndex) + originalString.substring(lastIndex).toUpperCase()};
    }

    public static void main(String[] args) {
        String[] result = markStringEnds("o");
        System.out.printf(Arrays.toString(result));

        System.out.println("\n-----------------");

        result = markStringEnds("hello");
        System.out.printf(Arrays.toString(result));

        System.out.println("\n-----------------");

        result = markStringEnds("example");
        System.out.printf(Arrays.toString(result));

        System.out.println("\n-----------------");

        result = markStringEnds("ALICE");
        System.out.printf(Arrays.toString(result));

        System.out.println("\n-----------------");

        result = markStringEnds("wow!");
        System.out.printf(Arrays.toString(result));
    }
}
