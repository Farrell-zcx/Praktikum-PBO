package guided.guided2;

public class Manager extends Employes {
    private String alamat;

    public Manager(String nama, String alamat) {
        super(nama);
        this.alamat = alamat;
    }
    public void tampilInformasi(){
        super.TampilNama();
        System.out.println("Alamat: " + alamat);
        System.out.println("Department: " + super.department);
    }
}
