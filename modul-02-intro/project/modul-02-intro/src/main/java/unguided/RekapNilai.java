package unguided;

public class RekapNilai {
    public static void main(String[] args) {
        final double KKM = 75.0;

        String[] nama = {"Andi", "Budi", "Citra"};
        double[][] nilai = {
            {80.0, 85.0},
            {70.0, 65.0},
            {90.0, 90.0}
        };

        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM + "\n");

        for (int i = 0; i < nama.length; i++) {
            double rataRata = (nilai[i][0] + nilai[i][1]) / 2.0;
            String status = (rataRata >= KKM) ? "LULUS" : "REMEDIAL";

            System.out.println("Mahasiswa " + (i + 1) + ": " + nama[i]);
            System.out.println("Nilai Modul 1 : " + nilai[i][0]);
            System.out.println("Nilai Modul 2 : " + nilai[i][1]);
            System.out.println("Rata-rata     : " + rataRata);
            System.out.println("Status        : " + status);

            if (i < nama.length - 1) {
                System.out.println();
            }
        }
    }
}
