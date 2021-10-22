package Chicago;

import Factory.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam";
        dough = "Extra Thinck Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded fish ");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
