package JavaBasicsMate;
/*
* Тепер ти створиш новий масив зі значеннями елементів, які націло діляться
* на вказане число.
* Ми оголосили метод getDivisibleNumbers(), який приймає два параметри:
* масив int[] numbers та дільник int divider.
* Твоє завдання: реалізуй метод так, щоби він повертав масив тільки з тими
* числами, які націло діляться на число divider та є додатними. Візьми до уваги,
* що порядок додатних чисел, які націло діляться на divider у поверненому
* масиві, має бути таким самим, як і у вихідному масиві.
* Наприклад, з такими вхідними даними:
* int[] numbers = {2, 5, 8, 0, 7, 1, -4};
* int divider = 2;
* Результат буде таким:
* int[] result = {2, 8};
* // тільки числа 2 і 8 додатні та діляться націло на 2
* */

public class DivisibleNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 0, 7, 1, -4};
        int divider = 2;
        int[] result = getDivisibleNumbers(numbers, divider);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] getDivisibleNumbers(int[] numbers, int divider) {
        //write your code below this line
        int count = 0;
        for (int number : numbers) {
            if (number > 0 && number % divider == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number > 0 && number % divider == 0) {
                result[index] = number;
                index++;
            }
        }
        return result;
        //write your code above this line
    }
}
