public class ArrayTask {

    public static void main(String[] args) {

        int[] s = new int[9];
        int max = 20;
        int v = -2;
        int b = 21;
        int n = 0;

        for (int i = 0; i < s.length; i++) {
            s[i] = name(max);
            System.out.print(s[i] + " ");
            if (v <= s[i]) {
                v = s[i];
            }
            if ( b >= s[i]){
               b=s[i];
            }
            n+=s[i];
        }

        System.out.println();
        System.out.println(v + " является максимальным элементом в массиве ");
        System.out.println(b + " является минимальным  элементом в массиве ");
        System.out.println(n/s.length + " является средним арифметическим элементом в массиве ");
    }
    public static int name(int max) {
        return (int) (Math.random() * max - 1);
    }
}
