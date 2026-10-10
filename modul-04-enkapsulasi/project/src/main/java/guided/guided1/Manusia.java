package guided.guided1;

public class Manusia {
    // definisi atribut
    private String nama;
    private int umur;

    // constructor
    public Manusia(){};
    public Manusia(String nama){
        this.nama = nama;
    }
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    

    // method setter
    public void setNama(String a) {
        nama = a;
    }

    public void setUmur(int a) {
        umur = a;
    }

    // method getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}
