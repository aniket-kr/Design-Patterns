package com.company.aniketkr.designpatterns.decorator;

import com.company.aniketkr.designpatterns.decorator.topping.Cheese;
import com.company.aniketkr.designpatterns.decorator.topping.Mushroom;
import com.company.aniketkr.designpatterns.decorator.topping.Tomato;

public class Client {

  /*
   * The decorator pattern helps when dynamic addition of features is required
   * at runtime.
   *
   * Basically, all the example pizzas down below in the "pizzas" array could be
   * subclasses of a 'base' Pizza class. Problems with that approach:
   *  1. Everytime a new "type" of pizza is required to be created, a new
   *     subclass will have to be defined. If a "CheeseTomatoPizza" exists but
   *     a customer asks for mushroom toppings too, then a
   *     "CheeseTomatoMushroomPizza" fill have to be defined. This approach
   *     lacks flexibility.
   *  2. For this particular approach, if the cost of mushroom toppings
   *     changes, then all subclasses of "Pizza" that use mushroom toppings,
   *     namely "MushroomPizza", "CheeseTomatoMushroomPizza" and
   *     "CheesyMushroomDelightPizza" will also have to be changed manually
   *     one-by-one.
   *
   * The other approach is to use the decorator pattern. The decorator pattern
   * effectively makes creating subclasses to a given superclass at runtime. All
   * the pizzas in Pizza[] are in fact subclasses of "Pizza". It also deals with
   * changes in price (or field values) very flexibly.
   */

  public static void main(String[] args) {
    Pizza[] pizzas = { //
        new Cheese(new Tomato(new BasicPizza())),  // CheeseTomatoPizza
        new Mushroom(new BasicPizza()),  // MushroomPizza
        new Tomato(new Cheese(new Mushroom(new BasicPizza()))),  // CheeseTomatoMushroomPizza
        new Cheese(new Mushroom(new Mushroom(new BasicPizza()))),  // CheesyMushroomDelightPizza
    };

    for (Pizza pizza : pizzas) {

      System.out.printf("Pizza Cost: ₹%.2f, Ingredients: %s%n", //
          pizza.getCost(), //
          pizza.getToppings() //
      );
    }
  }
}
