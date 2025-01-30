package JavaBasicsMate;
/*
*Combine All Elements from Two Arrays
*У цьому завданні ти навчишся зʼєднувати масиви.
*Дано метод getCombinedArray(), який приймає два масиви чисел.
* Тобі потрібно повернути новий масив, у якому будуть знаходитися
* всі елементи з обох масивів.
* Наприклад:
* getCombinedArray(new int[] {1, 2}, new int[] {3, 4}); // [1, 2, 3, 4]
* \getCombinedArray(new int[] {56}, new int[] {-32}); // [56, -32]
* getCombinedArray(new int[] {}, new int[] {}); // []
* getCombinedArray(new int[] {}, new int[] {20, 10}); // [20, 10]
* */

import java.util.Arrays;

public class CombineArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        int[] arr3 = {56};
        int[] arr4 = {-32};
        int[] arr5 = {};
        int[] arr6 = {20, 10};

        System.out.println(Arrays.toString(getCombinedArray(arr1, arr2)));
        System.out.println(Arrays.toString(getCombinedArray(arr3, arr4)));
        System.out.println(Arrays.toString(getCombinedArray(arr5, arr5)));
        System.out.println(Arrays.toString(getCombinedArray(arr5, arr6)));
    }

    public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
        // WRITE YOUR CODE BELOW THIS LINE
        if (firstArray.length > 0 && secondArray.length > 0) {
            int[] combinedArray = new int[firstArray.length + secondArray.length];
            for (int i = 0; i < firstArray.length; i++) {
                combinedArray[i] = firstArray[i];
            }
            for (int i = 0; i < secondArray.length; i++) {
                combinedArray[firstArray.length + i] = secondArray[i];
            }
            return combinedArray;
        } else if (firstArray.length > 0) {
            return firstArray;
        } else if (secondArray.length > 0) {
            return secondArray;
        }
        return new int[0];
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
