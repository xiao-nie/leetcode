package cn.javae.leetcode;

/**
 * @author nie
 * @date 2022/11/24 20:49
 **/
public class IntegerToRoman012 {

    public static void main(String[] args) {
        String sss = intToRoman(1994);
        System.out.println("sss = " + sss);
    }

    public static String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        int a1 = 0;
        if (num > 999) {
            a1 = num / 1000;
            s.append(get(a1, "M", null, null));
            num = num % 1000;
        }
        if (num > 99) {
            a1 = num / 100 % 10;
            s.append(get(a1, "C", "D", "M"));
            num = num % 100;
        }
        if (num > 9) {
            a1 = num / 10 % 10;
            s.append(get(num / 10 % 10, "X", "L", "C"));
            num = num % 10;
        }
        a1 = num % 10;
        s.append(get(a1, "I", "V", "X"));
        return s.toString();
    }

    public static String get(int a, String one, String five, String ten) {
        if (a == 0) {
            return "";
        }
        StringBuilder s = new StringBuilder();
        if (a < 4) {
            for (int i = 0; i < a; i++) {
                s.append(one);
            }
            return s.toString();
        } else if (a == 4) {
            return s.append(one).append(five).toString();
        } else if (a < 9) {
            s.append(five);
            for (int i = 0; i < a - 5; i++) {
                s.append(one);
            }
            return s.toString();
        } else {
            return s.append(one).append(ten).toString();
        }
    }

}
