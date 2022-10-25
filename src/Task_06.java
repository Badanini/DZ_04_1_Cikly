public class Task_06 {
    public static void main(String[] args) {
        int i = 0, a, b, c, d, e, f, g, h;
        for (int n = 10000000; n < 100000000; n++) {
            if (n % 12345 == 0) {
                a = n % 100000000 / 10000000;
                b = n % 10000000 / 1000000;
                c = n % 1000000 / 100000;
                d = n % 100000 / 10000;
                e = n % 10000 / 1000;
                f = n % 1000 / 100;
                g = n % 100 / 10;
                h = n % 10 / 1;
                if (a != b && a != c && a != d && a != e && a != f && a != g && a != h &&
                        b != c && b != d && b != e && b != f && b != g && b != h &&
                        c != d && c != e && c != f && c != g & c != h &&
                        d != e && d != f && d != g && d != h &&
                        e != f && e != g && e != h &&
                        f != g && f != h &&
                        g != h) {
                    System.out.println(n);
                    i++;
                } else ;
            }
        }
        System.out.println(i + " восьмизначных чисел с неповторяющимися цифрами и делящиеся на 12345 без остатка");
    }
}
