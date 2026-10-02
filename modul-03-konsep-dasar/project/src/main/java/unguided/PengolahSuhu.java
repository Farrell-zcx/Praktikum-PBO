package unguided;


public class PengolahSuhu {
    private static final double NILAI_KOSONG = -1.0;
    private double[] suhuHarian;

    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.printf("Hari %d : %.1f\u00B0C%n", (i + 1), suhuHarian[i]);
            }
        }
    }
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }
    public void isiDataKosong() {
        int index = cariIndexKosong();
        if (index != -1) {
            suhuHarian[index] = (suhuHarian[index - 1] + suhuHarian[index + 1]) / 2;
        }
    }
    public double hitungRataRata() {
        double total = 0;
        for (double suhu : suhuHarian) {
            total += suhu;
        }
        return total / suhuHarian.length;
    }
}
