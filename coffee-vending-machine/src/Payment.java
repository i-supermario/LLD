public class Payment {
    private String itemName;
    private Float amount;
    private boolean isPaid;

    Payment(String n, Float a, boolean i){
      this.itemName = n;
      this.amount = a;
      this.isPaid = i;
    }

    Payment(String n, Float a){
      this.itemName = n;
      this.amount = a;
      this.isPaid = false;
    }

    public void setPaid(boolean isPaid) {
      this.isPaid = isPaid;
    }
}
