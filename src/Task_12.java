import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        int day = 0;
        System.out.println("Спортсмен в первый день пробежал 50 км\nВведите интересующий вас пробег в км");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        double x = 50;
        do {
            x += x * 0.1;
            day += 1;
        } while (x <= y);
        System.out.println("На " + day + " день, пробег спортсмена составит не менее " + y + " км");
    }
}
