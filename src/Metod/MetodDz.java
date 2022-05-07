package Metod;
/*
1) Создать метод sum, который должен суммировать 2 числа.
2) Создать метод multy, который должен умножить 2 числа.
3) Создать метод subt, который должен вычесть второе число из первого.
4) Создать метод div, который должен делить 2 числа.
/*
/*
1) Создать метод convert, который должен конвертировать евро в доллары. В метод должен приходить один аргумент (к-во евро). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/

public class MetodDz {
    public static void main(String[] args) {

        int result = sum(20,30);
        System.out.println(result);

        int result1 = multy(20,30);
        System.out.println(result1);

        int result2 = subt(20,30);
        System.out.println(result2);

        double result3 = div(20,9);
        System.out.println(result3);

        double result4 = convert(159, 1.06);
        System.out.println(result4);

        double result5 = procent(49987, 100, 45);
        System.out.println(result5);

        str("Hallo");

    }
    public static int sum(int num1, int num2) {
        //int result = (num1 + num2);
        return num1 + num2;
    }
    public static int multy(int num1, int num2) {
       //int result1 = (num1 * num2);
        return num1 * num2;
    }
    public static int subt(int num1, int num2) {
        //int result2 = (num1 - num2);
        return num1 - num2;
    }
    public static double div(double num1, double num2) {
        //double result3 = (num1 / num2);
        return num1 / num2;
    }
    public static double convert(double eur, double usd) {
        //double result4 = (eur * usd);
        return eur * usd;
    }
    public static double procent(double d1, double d2, double d3) {
        //double result5 = ((d1 / d2) * d3 + d1);
        return ((d1 / d2 * d3) + d1);
    }
    public static void str(String str) {
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);

    }


        /*
        int num1 = 20;
        int num2 = 30;
        sum(num1,num2);
        multy(num1,num2);
        subt(num1,num2);
    }
    public static void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void multy(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void subt(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    */
    }
