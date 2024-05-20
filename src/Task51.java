import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення границь діапазону
        System.out.print("Введіть початкову границю діапазону: ");
        double start = scanner.nextDouble();
        System.out.print("Введіть кінцеву границю діапазону: ");
        double end = scanner.nextDouble();

        // Початок підрахунку
        double step = 0.1;
        int count = 0;

        for (double x = 0; x <= 2; x += step) {
            double fx = Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2) - 10 * x;
            if (fx >= start && fx <= end) {
                count++;
            }
        }

        // Виведення результату
        if (count > 0) {
            System.out.println("Кількість значень функції у заданому діапазоні: " + count);
        } else {
            System.out.println("Немає значень функції у заданому діапазоні.");
        }
    }
}