public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (SoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }

    }
    public static boolean SoNguyenTo(int n) {

        if (n < 2) return false;
        for (int i = 2; i < (n - 1); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
