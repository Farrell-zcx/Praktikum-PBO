package guided.guided3;

public abstract class Employee implements Payable {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
// setiap pegawai pasti punya gaji, tapi rumusnya beda beda
    public abstract double earnings();

    // saat ada penagihan, alihkan langsung ke metode kalkulasi gaji (earnings)
    @Override
    public double getPaymentAmount(){
        return this.earnings();
    }
}