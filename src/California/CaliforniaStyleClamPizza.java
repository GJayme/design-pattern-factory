package California;

import Factory.Pizza;

public class CaliforniaStyleClamPizza extends Pizza {
    public CaliforniaStyleClamPizza() {
        name = "California Style Clam";
        dough = "Extra Thinck Crust Dough";
        sauce = "Fish Sauce";

        toppings.add("Potato and tomato");
    }

    public void cut() {
        System.out.println("Cutting the pizza into cicle slices");
    }
}
