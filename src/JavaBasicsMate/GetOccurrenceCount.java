package JavaBasicsMate;

/*
* У цьому завданні ти навчишся підраховувати кількість входжень елементу в масив.
* Реалізуй метод getOccurrenceCount() так, щоби він повертав кількість разів,
* яку targetColor зустрічається в масиві colors.
* Наприклад:
* getOccurrenceCount(new String[] {"blue", "blue", "blue"}, "blue"); // 3
* getOccurrenceCount(new String[] {"blue", "green", "red"}, "red"); // 1
* getOccurrenceCount(new String[] {"blue", "green", "red"}, "white"); // 0
* getOccurrenceCount(new String[] {"blue", "green", "red"}, null); // 0
* getOccurrenceCount(new String[0], "blue"); // 0
* */

public class GetOccurrenceCount {
    public static int getOccurrenceCount(String[] colors, String targetColor) {
        int count = 0;

        if (colors == null || targetColor == null) {
            return 0;
        }

        for (String color : colors) {
            if (color.equals(targetColor)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getOccurrenceCount(new String[] {"blue", "blue", "blue"}, "blue")); // 3
        System.out.println(getOccurrenceCount(new String[] {"blue", "green", "red"}, "red")); // 1
        System.out.println(getOccurrenceCount(new String[] {"blue", "green", "red"}, "white")); // 0
        System.out.println(getOccurrenceCount(new String[] {"blue", "green", "red"}, null)); // 0
        System.out.println(getOccurrenceCount(new String[0], "blue")); // 0
    }
}
