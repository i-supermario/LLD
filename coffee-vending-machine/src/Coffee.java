

import java.util.List;
import java.util.Map;

public class Coffee {
  private String name;
  private int price;
  private Map<String, Integer> recipe;

  Coffee(String name,int price){
    this.name = name;
    this.price = price;
  }

  public void setRecipe(Map<String, Integer> recipe) {
    this.recipe = recipe;
  }

  public Map<String, Integer> getRecipe() {
    return recipe;
  }

  public String getName(){
    return name;
  }

  public int getPrice(){
    return price;
  }

    
}
