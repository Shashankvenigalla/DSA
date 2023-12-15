public class p10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int a = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (a));
                a++;
            }
            System.out.println();
        }
    }
}
