public class Task_09 {
    public static void main(String[] args) {
        int sum = 0;
        for (int n = 1; n <= 1000; n++) {
            if (n % 3 == 0 || n % 5 == 0) {
                sum = sum + n;
            } else ;
        }
        System.out.println("Сумма всех чисел кратных 3 или 5 от 0 до 1000 равна\n"+sum);
    }
}