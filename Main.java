public class Main {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n; i++) {

            int val = i % 2;   // decide starting value

            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = 1 - val;   // toggle between 0 and 1
            }

            System.out.println();
        }
    }
}
