

public class Ingredient {
  private int quantity;
  private String name;

  Ingredient(int q, String n){
    this.quantity = q;
    this.name = n;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getName() {
    return name;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void reduceQuantitybyK(int k){
    this.quantity -= k;
    this.quantity = Math.max(quantity, 0);
  }

  public void addToQuantitybyK(int k){
    this.quantity += k;
  }

}
