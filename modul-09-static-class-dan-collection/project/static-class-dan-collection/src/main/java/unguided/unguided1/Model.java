package unguided.unguided1;

public class Model implements Comparable<Model> {
    private String nama;
    private double akurasi;
    private int waktuTraining;
    private static int jumlahEksperimen = 0;

    public Model(String nama, double akurasi, int waktuTraining) {
        this.nama = nama;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++;
    }

    public String getNama() {
        return this.nama;
    }

    public double getAkurasi() {
        return this.akurasi;
    }

    public int getWaktuTraining() {
        return this.waktuTraining;
    }

    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    @Override
    public int compareTo(Model other) {
        return Double.compare(other.akurasi, this.akurasi);
    }

    @Override
    public String toString() {
        return "Model=" + this.nama + ", akurasi=" + this.akurasi + ", waktu=" + this.waktuTraining + " detik";
    }
}

