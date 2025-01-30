package JavaBasicsMate;

/*
*Convert Boolean Array to String Array
* Ми створили масив булевих значень values та передали його
* в метод getStringArray().
* У цьому завданні тобі потрібно реалізувати цей метод так,
* щоби він повертав новий масив типу String, у якому булеві
* значення true замінені на "Yes", а false - на "No".
* Наприклад:
* getStringArray(new boolean[] {true, false}); // ["Yes", "No"]
* getStringArray(new boolean[] {false}); // ["No"]
* getStringArray(new boolean[] {}); // []
* */

import java.util.Arrays;

public class ConvertBooleans {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStringArray(new boolean[]{true, false})));
        System.out.println(Arrays.toString(getStringArray(new boolean[]{false})));
        System.out.println(Arrays.toString(getStringArray(new boolean[]{})));
    }

    public static String[] getStringArray(boolean[] values) {
        // WRITE YOUR CODE BELOW THIS LINE
        if (values.length > 0) {
            String[] result = new String[values.length];
            for (int i = 0; i < values.length; i++) {
                if (values[i]) {
                    result[i] = "Yes";
                } else {
                    result[i] = "No";
                }
            }
            return result;
        }
        return new String[]{};
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
