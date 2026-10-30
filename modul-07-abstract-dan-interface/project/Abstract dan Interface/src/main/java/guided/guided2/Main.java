package guided.guided2;

public class Main {
    public static void main(String[] args) {
        Payable[] items = new Payable[2];
        items[0] = new Invoice("Monitor LED", 2, 1500000);
        items[1] = new SalariedEmployee("Budi", 5000000);

// Dynamic dispatch: java otomatis meengeksekusi rumus yang tepat sesuai objek
        for(Payable item : items){
            System.out.println("Total Pembayaran: Rp" + item.getPaymentAmount());
        }
    }
}
