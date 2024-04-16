package JavaBasicsMate;

/*
* Згадаємо як знаходити символи в рядку.
* У цьому завданні реалізуй метод getMiddleString(), що приймає рядок і
* повертає центральний символ у вигляді рядку.
* Зверни увагу: якщо довжина рядка парна, поверни два центральних символи.
* */
public class GetMiddleCharacter {
    public static String getMiddleString(String originalString) {
        int averageValue;

        if (originalString == null || originalString.length() == 0)
            return "";

        if (originalString.length() % 2 == 0) {
            averageValue = originalString.length() / 2;
            return originalString.substring(averageValue - 1, averageValue + 1);
        } else {
            averageValue = originalString.length() / 2;
            return originalString.substring(averageValue, averageValue + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getMiddleString("test"));
        System.out.println(getMiddleString("1234"));
        System.out.println(getMiddleString("(())"));
        System.out.println(getMiddleString(""));
    }
}
