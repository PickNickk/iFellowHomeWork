import java.util.Scanner;

public class clockTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите часы и минуты(12-часового формата):");
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(clockAngle(h,m)+" Угол между часовой и минутной стрелкой.");

    }
    private static double clockAngle(int h, int m){

        if ((h < 0 || h > 12) || (m < 0 || m > 60)) {
        throw new IllegalArgumentException("Введенные часы или минуты находятся за пределами допустимого диапазона.");
        }

        double e = Math.abs(30 * h + 0.5 * m - 6 * m);

        if (e > 180) {
            return 360 - e;
        }
        return e;
    }
}
