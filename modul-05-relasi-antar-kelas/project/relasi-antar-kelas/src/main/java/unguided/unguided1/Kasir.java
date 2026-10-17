package unguided.unguided1;

public class Kasir {
    private String namaKasir;

    // Constructor
    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    // Getter
    public String getNamaKasir() {
        return this.namaKasir;
    }
    
    public void prosesPembayaran(Pesanan pesanan) {
        double totalSubtotal = 0;
        double totalPajak = 0;

        ItemPesanan[] daftarItem = pesanan.getDaftarItem();
        int jumlahItem = pesanan.getJumlahItem();

        for (int i = 0; i < jumlahItem; i++) {
            RincianHarga rincian = daftarItem[i].getRincian();
            totalSubtotal += rincian.getHargaDasar();
            totalPajak += rincian.getPajak();
        }

        double totalBayar = totalSubtotal + totalPajak;

        System.out.println("\n=== STRUK PEMBAYARAN KASIR ===");
        System.out.println("Kasir Bertugas : " + this.namaKasir);
        System.out.println("Pesanan        : Meja " + pesanan.getNomorMeja());
        System.out.println("Jumlah Item    : " + jumlahItem);
        System.out.println("Total Subtotal : Rp " + totalSubtotal);
        System.out.println("Total Pajak    : Rp " + totalPajak);
        System.out.println("TOTAL BAYAR    : Rp " + totalBayar);
        System.out.println("==============================");
    }
}
