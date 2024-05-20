public class Task3 {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;

        while (hours <= 2) {
            while (minutes < 60) {
                System.out.println(hours + "h " + minutes + "min");
                minutes++;
            }
            hours++;
            minutes = 0; // Скидання хвилин до початку нової години
        }
    }
}
