package homework.fourth;

public class Pizza {
  private String crust;
  private String sauce;
  private String cheese;
  private String tomato;
  private String mushrooms;
  private String bacon;

  private Pizza(PizzaBuilder pizzaBuilder) {
    this.crust = pizzaBuilder.crust;
    this.sauce = pizzaBuilder.sauce;
    this.cheese = pizzaBuilder.cheese;
    this.tomato = pizzaBuilder.tomato;
    this.mushrooms = pizzaBuilder.mushrooms;
    this.bacon = pizzaBuilder.bacon;
  }

  public static class PizzaBuilder{
    private String crust;
    private String sauce;
    private String cheese;
    private String tomato;
    private String mushrooms;
    private String bacon;

    public PizzaBuilder(String crust, String sauce, String cheese){
      this.crust = crust;
      this.sauce = sauce;
      this.cheese = cheese;
    }

    public PizzaBuilder addTomatos(String tomato){
      this.tomato = tomato;
      return this;
    }
    public PizzaBuilder addMushrooms(String mushrooms){
      this.mushrooms = mushrooms;
      return this;
    }
    public PizzaBuilder addBacon(String bacon){
      this.bacon = bacon;
      return this;
    }
    public Pizza build(){
      return new Pizza(this);
    }
  }

  @Override
  public String toString() {
    return "Pizza{" +
            "crust='" + crust + '\'' +
            ", sauce='" + sauce + '\'' +
            ", cheese='" + cheese + '\'' +
            ", tomato='" + tomato + '\'' +
            ", mushrooms='" + mushrooms + '\'' +
            ", bacon='" + bacon + '\'' +
            '}';
  }
}
