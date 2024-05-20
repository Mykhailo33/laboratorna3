import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення границь діапазону
        System.out.print("Введіть початкову границю діапазону: ");
        double start = scanner.nextDouble();
        System.out.print("Введіть кінцеву границю діапазону: ");
        double end = scanner.nextDouble();

        // Початок підрахунку
        double step = 0.1;
        double x = start;
        int count = 0;

        while (x <= end) {
            double result = Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2) - 10 * x;
            if (result >= start && result <= end) {
                count++;
            }
            x += step;
        }

        // Виведення результату
        if (count > 0) {
            System.out.println("Кількість значень функції у заданому діапазоні: " + count);
        } else {
            System.out.println("Немає значень функції у заданому діапазоні.");
        }
    }
}
