import java.util.Scanner;

public class BaseConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите градусы Цельсия(°C) для конвертации");
        int n = sc.nextInt();
        System.out.println("Во что конвертировать? <<K>>(Кельвин) или <<F>>(Фаренгейт)");
        String kf= sc.next();
        System.out.println(convert(n,kf));
    }
    private static String convert(int n, String convertTo) {

        double tmp;

        if (convertTo.equals("K")){
            tmp = n + 273;
        }else if (convertTo.equals("F")){
            tmp = (n * 1.8) + 32;
        }else{
            return "Ошибка, выбран не верный формат конвертируемой температуры";
        }
        return String.format("%.1f ",tmp) + convertTo;
    }
}
