package item02;

import static item02.Pizza.Topping.*;
import static item02.NyPizza.Size.*;

public class PizzaImpl {
    public static void main(String[] args) {
            NyPizza pizza = new NyPizza.Builder(SMALL)
                        .addTopping(SAUSAGE).addTopping(ONION).build();
            Calzone calzone = new Calzone.Builder()
                        .addTopping(HAM).sauceInsisde().build();
    }
}
