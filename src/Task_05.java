import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число");
        long chislo, obratnoechislo, ostatok, n = scanner.nextLong();
        chislo = n;
        obratnoechislo = 0;
        for (int i = 1; i > 0; i++) {    //через цикл разворачиваем число наоборот
            ostatok = chislo % 10;
            obratnoechislo = obratnoechislo * 10 + ostatok;
            chislo = chislo / 10;
            if (chislo == 0) {
                break;
            } else ;
        }
        if (obratnoechislo == n) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}