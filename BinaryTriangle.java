public class BinaryTriangle {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n; i++) {

            int value;

            // Decide starting value
            if (i % 2 == 0)
                value = 0;
            else
                value = 1;

            for (int j = 1; j <= i; j++) {

                System.out.print(value + " ");

                // Toggle value
                value = 1 - value;
            }

            System.out.println();
        }
    }
}
