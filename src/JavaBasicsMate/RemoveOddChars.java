package JavaBasicsMate;

/*
* В цьому завданні реалізуй метод removeOddChars(), який приймає рядок і
* видаляє в ньому всі непарні символи, а потім повертає результат.
* Зверни увагу: непарні символи у рядку розташовані на непарних індексах
* */
public class RemoveOddChars {
    public static String removeOddChars(String originalString) {
        StringBuilder result = new StringBuilder();
        if (originalString == null || originalString.length() == 0)
            return "";
        for (int i = 0; i < originalString.length(); i++) {
            if (i % 2 == 0) {
                result.append(originalString.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOddChars("test"));
        System.out.println(removeOddChars("1234"));
        System.out.println(removeOddChars("(())"));
        System.out.println(removeOddChars(""));
    }
}
