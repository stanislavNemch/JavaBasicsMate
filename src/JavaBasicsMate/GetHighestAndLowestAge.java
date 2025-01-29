package JavaBasicsMate;
/*
* У цьому завданні ти знайдеш найбільше та найменше значення елементів масиву.
* Ми створили масив ages, який містить значення віку твоїх сусідів.
* Твоє завдання: реалізуй метод getHighestAndLowestAge() так, щоби він
* повернув масив типу int, який містить найбільший та найменший вік із масиву ages.
* Зверни увагу: першим значенням елементу нового масиву має бути найбільший вік.
* */

public class GetHighestAndLowestAge {
    public static void main(String[] args) {
        int[] ages = {23, 45, 67, 38, 12, 98, 34, 56, 78, 90};
        int[] result = getHighestAndLowestAge(ages);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] getHighestAndLowestAge(int[] ages) {
        // write your code below this line
        if (ages.length > 0) {
            int max = ages[0];
            int min = ages[0];
            for (int i = 1; i < ages.length; i++) {
                if (ages[i] > max) {
                    max = ages[i];
                }
                if (ages[i] < min) {
                    min = ages[i];
                }
            }
            return new int[]{max, min};
        }
        return new int[0];
        // write your code above this line
    }
}
