package guided.guided2;

public class Invoice implements Payable {
    private String partName;
    private int quantity;
    private  double pricePerItem;

    public Invoice(String partName, int quantity, double pricePerItem){
        this.partName = partName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartName(){
        return this.partName;
    }

    public void setPartName(String partName){
        this.partName = partName;
    }

    // hitung tagihan
    @Override
    public double getPaymentAmount(){
        return this.quantity * this.pricePerItem;
    }
}
