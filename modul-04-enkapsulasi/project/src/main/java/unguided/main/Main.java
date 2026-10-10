package unguided.main;

import unguided.model.Dataset;
import unguided.laporan.LaporanDataset;

public class Main {
    public static void main(String[] args) {
        // Objek 1: Constructor tanpa parameter, lalu isi memakai setter
        Dataset dataset1 = new Dataset();
        dataset1.setNama("Titanic");
        dataset1.setJumlahBaris(891);
        dataset1.setJumlahKolom(12);
        dataset1.setJumlahMissing(866);

        // Objek 2: Constructor 1 parameter
        Dataset dataset2 = new Dataset("Wine Quality");

        // Objek 3: Constructor lengkap
        Dataset dataset3 = new Dataset("Iris", 150, 5, 0);

        // Simpan ketiganya dalam array
        Dataset[] daftarDataset = { dataset1, dataset2, dataset3 };

        LaporanDataset laporan = new LaporanDataset();
        for (Dataset d : daftarDataset) {
            laporan.cetak(d);
        }

        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}
