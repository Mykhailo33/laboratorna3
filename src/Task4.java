public class Task4 {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        while (hours <= 2) {
            while (minutes < 60) {
                while (seconds < 60) {
                    System.out.println(hours + "h " + minutes + "min " + seconds + "sec");
                    seconds++;
                }
                minutes++;
                seconds = 0; // Скидання секунд до початку нової хвилини
            }
            hours++;
            minutes = 0; // Скидання секунд до початку нової години
        }
    }
}

