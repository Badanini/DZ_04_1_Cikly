public class Task_03 {
    public static void main(String[] args) {
        for (int number = 10; number < 1000000; number++) {
            int a, b, c, d, e, f, chislo, stepen=0;
            chislo = number;
            for (int i = 1; i < 7; i++) {
                chislo = chislo / 10;
                if (chislo <= 0) {
                    stepen = i;
                    break;
                } else ;
            }
            a = number % 10 / 1;
            b = number % 100 / 10;
            c = number % 1000 / 100;
            d = number % 10000 / 1000;
            e = number % 100000 / 10000;
            f = number % 1000000 / 100000;
            if (number == Math.pow(f, stepen) + Math.pow(e, stepen) + Math.pow(d, stepen) + Math.pow(c, stepen) + Math.pow(b, stepen) + Math.pow(a, stepen)) {
                System.out.println(number);
            } else ;
        }
    }
}
