package guided.guided1;

public abstract class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
// setiap pegawai pasti punya gaji, tapi rumusnya beda beda
    public abstract double earnings();
}
