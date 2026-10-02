package unguided;

public class Main {
    public static void main(String[] args) {

        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        int indexKosong = pengolah.cariIndexKosong();
        System.out.println("\nIndex hari kosong (dimulai dari 0): " + indexKosong);

        pengolah.isiDataKosong();

        System.out.println("\n=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();
        System.out.printf("%nRata-rata : %.2f\u00B0C%n", pengolah.hitungRataRata());
        System.out.println("\nIsi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.print("[");
        for (int i = 0; i < suhuHarian.length; i++) {
            System.out.printf("%.1f", suhuHarian[i]);
            if (i < suhuHarian.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");
    }
}
