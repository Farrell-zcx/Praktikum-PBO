package unguided.model;

public class Dataset {
    // Atribut private (enkapsulasi)
    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    // Konstanta
    public static final double BATAS_MISSING = 5.0;

    // Variabel milik class (static)
    private static int totalDataset = 0;

    // Constructor 1: Tanpa parameter
    public Dataset() {
        this.nama = "Tanpa Nama";
        this.jumlahBaris = 0;
        this.jumlahKolom = 0;
        this.jumlahMissing = 0;
        totalDataset++;
    }

    // Constructor 2: Hanya parameter nama
    public Dataset(String nama) {
        this.nama = nama;
        this.jumlahBaris = 0;
        this.jumlahKolom = 0;
        this.jumlahMissing = 0;
        totalDataset++;
    }

    // Constructor 3: Lengkap
    public Dataset(String nama, int jumlahBaris, int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        setJumlahBaris(jumlahBaris);
        setJumlahKolom(jumlahKolom);
        setJumlahMissing(jumlahMissing);
        totalDataset++;
    }

    // Method static untuk mengambil total objek Dataset yang dibuat
    public static int getTotalDataset() {
        return totalDataset;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahBaris() {
        return jumlahBaris;
    }

    // Nilai tidak berubah jika tidak valid / negatif
    public void setJumlahBaris(int jumlahBaris) {
        if (jumlahBaris >= 0) {
            this.jumlahBaris = jumlahBaris;
        }
    }

    public int getJumlahKolom() {
        return jumlahKolom;
    }

    // Nilai tidak berubah jika tidak valid / negatif
    public void setJumlahKolom(int jumlahKolom) {
        if (jumlahKolom >= 0) {
            this.jumlahKolom = jumlahKolom;
        }
    }

    public int getJumlahMissing() {
        return jumlahMissing;
    }

    // Nilai tidak berubah jika tidak valid / negatif
    public void setJumlahMissing(int jumlahMissing) {
        if (jumlahMissing >= 0) {
            this.jumlahMissing = jumlahMissing;
        }
    }

    // Menghitung persentase missing dibanding total sel (baris x kolom)
    public double getPersentaseMissing() {
        int totalSel = this.jumlahBaris * this.jumlahKolom;
        if (totalSel == 0) {
            return 0.0;
        }
        return ((double) this.jumlahMissing / totalSel) * 100.0;
    }

    // Mengecek apakah dataset perlu dibersihkan
    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }
}
