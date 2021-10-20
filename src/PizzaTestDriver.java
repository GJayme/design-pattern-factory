import California.CaliforniaPizzaStore;
import Chicago.ChicagoPizzaStore;
import Factory.Pizza;
import Factory.PizzaStore;
import NewYork.NYPizzaStore;

public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Gabriel order a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Elvis order a " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("cheese");
        System.out.println("Daniel order a " + pizza.getName() + "\n");
    }
}
