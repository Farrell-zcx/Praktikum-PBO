package unguided.unguided1;

public class RincianHarga {
    private double hargaDasar;
    private double pajak;

    // Constructor
    public RincianHarga(double hargaDasar) {
        this.hargaDasar = hargaDasar;
        this.pajak = hargaDasar * 0.10; // Pajak 10% dari harga dasar
    }

    // Getter
    public double getHargaDasar() {
        return this.hargaDasar;
    }

    public double getPajak() {
        return this.pajak;
    }

    public double getHargaTotal() {
        return this.hargaDasar + this.pajak;
    }
}
