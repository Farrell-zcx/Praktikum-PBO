package unguided.unguided1;

public class ItemPesanan {
    private String namaItem;
    private RincianHarga rincian;

    // Constructor
    public ItemPesanan(String namaItem, double hargaDasar) {
        this.namaItem = namaItem;
        this.rincian = new RincianHarga(hargaDasar);
    }

    // Getter
    public String getNamaItem() {
        return this.namaItem;
    }

    public RincianHarga getRincian() {
        return this.rincian;
    }
}
