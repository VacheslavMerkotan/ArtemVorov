package Metod;

public class Metod {
    public static void main(String[] args) {
        byte b = 127; //Byte
        short s = 32000;//Short
        char c = 98;//Character
        int i = 355555678;//Integer
        long l = 3547899003567L;//Long
        boolean bool = false;//Boolean
        float f = 23.5F;//Float
        double d = 23.6788876554;//Double
        String str = "276";
        int num = Integer.parseInt(str);

        int res = sum(20,30);
        System.out.println(res);

        int res1 = sum(36,274);
        System.out.println(res1);

        System.out.println(sum(256,9876));
        System.out.println(convert("Text"));

      printTwoTims(" 10 ");


    }
     public static int sum(int number1, int number2) {
        int res = number1 + number2;
        return res;
    }

    private static String convert(String str) {
        String res = str + " end ";
        return res;
    }
    private static void printTwoTims(String str) {
        System.out.println(str);
        System.out.println(str);
    }

}
