package JavaBasicsMate;/*
* А тепер підрахуємо середнє значення елементів масиву.
* Реалізуй метод getAverageSalary() так, щоби він повертав
* середнє значення елементів масиву salaries.
* */

public class GetAverageSalary {
    public static void main(String[] args) {
        double res = getAverageSalary(new double[]{0});
        System.out.printf("Average salary: %.2f\n", res);
    }

    public static double getAverageSalary(double[] salaries) {
        // write your code below this line
        if (salaries.length > 0) {
            double sum = 0;
            for (int i = 0; i < salaries.length; i++) {
                sum += salaries[i];
            }
            return sum / salaries.length;
        }
        return 0.0;
        // write your code above this line
    }
}
