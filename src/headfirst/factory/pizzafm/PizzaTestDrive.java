package headfirst.factory.pizzafm;

public class PizzaTestDrive { 
 public static void main(String[] args) {
  PizzaStore nyStore = new NYPizzaStore();
  Pizza pizza = nyStore.orderPizza("cheese");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  pizza = nyStore.orderPizza("potato");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 }
}
