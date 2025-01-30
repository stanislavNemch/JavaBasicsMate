package JavaBasicsMate;

/*
* Get Century from the Given Year
* В цьому завданні дано рік year.
* Твоє завдання: в методі getCentury() поверни століття,
* в якому знаходиться цей рік. Перше століття починається
* з року 1 і продовжується до року 100 включно, друге -
* з року 101 і до року 200 включно і так далі.
* Наприклад:
* getCentury(1705); // 18
* getCentury(1900); // 19
* getCentury(1601); // 17
* getCentury(2000); // 20

* */

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(getCentury(1705)); // 18
        System.out.println(getCentury(1900)); // 19
        System.out.println(getCentury(1601)); // 17
        System.out.println(getCentury(2000)); // 20
    }

    public static int getCentury(int year) {
        return (year + 99) / 100;
    }
}
