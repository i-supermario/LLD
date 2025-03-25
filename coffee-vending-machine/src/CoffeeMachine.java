import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


public class CoffeeMachine {
  private Map<Integer,Coffee> Menu;
  private Map<String, Ingredient> stock;

  CoffeeMachine(Map<Integer,Coffee> Menu,Map<String,Ingredient> stock){
    this.Menu = Menu;
    this.stock = stock;
    initializeDefaultMenuAndIngrediets();
  }

  public void initializeDefaultMenuAndIngrediets(){
      Coffee BlackCoffee = new Coffee("Black Coffee",10);
      Map<String,Integer> recipe = new HashMap<>();
      recipe.put("Water", 5);
      recipe.put("CoffeePowder", 10);

      BlackCoffee.setRecipe(recipe);

      Coffee Tripti = new Coffee("Tripti Blend",20);
      recipe = new HashMap<>();
      recipe.put("CoffeePowder", 10);
      recipe.put("Milk", 10);
      recipe.put("Sugar", 5);
      Tripti.setRecipe(recipe);

      Menu.put(0,BlackCoffee);
      Menu.put(1,Tripti);

      addToIngredient("Water", 50);
      addToIngredient("CoffeePowder", 100);
      addToIngredient("Milk", 50);
      addToIngredient("Sugar", 30);
  }

  private boolean hasEnoughIngredients(Coffee coffee){

    for( Map.Entry<String,Integer> entry: coffee.getRecipe().entrySet()){
      if(stock.containsKey(entry.getKey())){
        if(stock.get(entry.getKey()).getQuantity() < entry.getValue()) return false;
      }
    }

    return true;

  }

  

  public void addToIngredient(String name, int q){

    stock.computeIfAbsent(name, l -> new Ingredient(0, name)).addToQuantitybyK(q);

  }

  public void removeFromIngredient(String name, int q){

    stock.get(name).reduceQuantitybyK(q);


  }

  public void displayMenu(){
    System.out.println("Menu:");
    for( Map.Entry<Integer, Coffee> entry: Menu.entrySet() ){
      System.out.printf("%d) %s ---- %d \n", entry.getKey()+1 ,entry.getValue().getName(), entry.getValue().getPrice());
    }
  }

  public Coffee getItem(int menuIndex){
    return Menu.get(menuIndex);
  }

  public boolean dispenseCoffee(int menuIndex){

    if(hasEnoughIngredients(Menu.get(menuIndex))) return true;
    return false;

  }


}
