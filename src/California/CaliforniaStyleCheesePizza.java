package California;

import Factory.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        name = "California Style Sauce and Cheese";
        dough = "Extra Thinck Crust Dough";
        sauce = "Barbecue Sauce";

        toppings.add("M&Ms");
    }

    public void cut() {
        System.out.println("Cutting the pizza into cicle slices");
    }
}
