package JavaBasicsMate;

import java.util.Arrays;

/*
* У цьому завданні ти навчишся заповнювати масив елементами.
* Реалізуй метод countTheMonkeys() так, щоби він повертав масив
* типу int, який містить значення від 1 до count.
* Зверни увагу: якщо count = 0, поверни порожній масив.
* */

public class CountTheMonkeys {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countTheMonkeys(5)));
    }

    public static int[] countTheMonkeys(int count) {
        // write your code below this line
        if (count > 0) {
            int[] monkeys = new int[count];
            for (int i = 0; i < count; i++) {
                monkeys[i] = i + 1;
            }
            return monkeys;
        }
        return new int[0];
        // write your code above this line
    }
}
