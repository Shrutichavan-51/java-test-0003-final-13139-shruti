public class ConcentricSquare {
    public static void main(String[] args) {

        int n = 4;
        int s = 2 * n - 1;

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {

                int a = i;
                int b = j;
                int c = s - 1 - i;
                int d = s - 1 - j;

                int x = n - Math.min(Math.min(a, b), Math.min(c, d));

                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}