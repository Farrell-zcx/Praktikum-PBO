package guided.guided3;

public class DemoMultiCatch {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            int x = args.length;
            int y = 100 / x;
            int[] arr = {10, 11};
            y = arr[x];
            System.out.println("Tidak terjadi eksepsi");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi eksepsi karena pembagian dengan nol");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi eksepsi karena indeks di luar kapasitas array");
        }
        System.out.println("Setelah blok try catch");
    }
}
