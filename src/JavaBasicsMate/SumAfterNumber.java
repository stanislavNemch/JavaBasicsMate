package JavaBasicsMate;
/*
* Get Sum of Numbers After Certain Number in an Array
* Дано масив чисел values і значення startValue. У цьому завданні
* знайди та поверни суму всіх чисел, які знаходяться
* в масиві після значення startValue.
* Зверни увагу:
* в результаті, сума не повинна містити значення startValue;
* якщо масив не містить startValue - поверни 0;
* якщо масив містить лише одне значення, яке дорівнює
* startValue - поверни 0.
* Наприклад:
* getSum(new int[] {1, 2, 3}, 1); // 2 + 3 = 5
* getSum(new int[] {10, 2, 50, 3, 4, 0}, 50); // 3 + 4 + 0 = 7
* getSum(new int[] {10, 2, 50, 3, 4, 0}, -100); // 0 (бо в масиві немає значення -100)
* getSum(new int[] {10}, 10); // 0
* */

public class SumAfterNumber {
    public static void main(String[] args) {
        System.out.println(getSum(new int[] {1, 2, 3}, 1)); // 2 + 3 = 5
        System.out.println(getSum(new int[] {10, 2, 50, 3, 4, 0}, 50)); // 3 + 4 + 0 = 7
        System.out.println(getSum(new int[] {10, 2, 50, 3, 4, 0}, -100)); // 0 (бо в масиві немає значення -100)
        System.out.println(getSum(new int[] {10}, 10)); // 0
        System.out.println(getSum(new int[] {3, 3, 3}, 3)); // 6
    }

    public static int getSum(int[] values, int startValue) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == startValue) {
                for (int j = i + 1; j < values.length; j++) {
                    sum += values[j];
                }
                break;
            }
        }
        return sum;
    }
}
