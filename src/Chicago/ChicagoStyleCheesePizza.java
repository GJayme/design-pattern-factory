package Chicago;

import Factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Sauce and Cheese";
        dough = "Extra Thinck Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
