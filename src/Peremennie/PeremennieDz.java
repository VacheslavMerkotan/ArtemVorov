package Peremennie;

public class PeremennieDz {
    public static void main(String[] args) {
        byte b = -120;
        short s = 31888;
        int i = 328884567;
        long l = 123456789L;
        char c = 'G';
        boolean booll = true;
        float f = 1234.634567F;
        double d = 12345.5678;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.println(booll);
        System.out.println(f);
        System.out.println(d);

        int number1 = 10;
        int number2 = 18;
        int number3 = 21;
        int num;
        // number1 = 18
        // number2 = 21
        // number3 = 10

        num = number1;
        number1 = number2;
        number2 = number3;
        number3 = num;
        System.out.println("Переменная number1 = " + number1);
        System.out.println("Переменная number2 = " + number2);
        System.out.println("Переменная number3 = " + number3);

    }
}
