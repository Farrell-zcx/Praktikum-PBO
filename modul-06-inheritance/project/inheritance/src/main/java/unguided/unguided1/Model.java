package unguided.unguided1;

public class Model {
    private String namaModel;
    private int jumlahDataLatih;

    public Model(String namaModel, int jumlahDataLatih) {
        this.namaModel = namaModel;
        this.jumlahDataLatih = jumlahDataLatih;
    }

    public String getNamaModel() {
        return this.namaModel;
    }

    public int getJumlahDataLatih() {
        return this.jumlahDataLatih;
    }

    public void tampilkanInfo() {
        System.out.println("Model: " + this.namaModel + " | Data latih: " + this.jumlahDataLatih);
    }

    public int hitungBiaya() {
        return this.jumlahDataLatih * 2;
    }

    public int hitungBiaya(int epoch) {
        return this.jumlahDataLatih * epoch;
    }
}
