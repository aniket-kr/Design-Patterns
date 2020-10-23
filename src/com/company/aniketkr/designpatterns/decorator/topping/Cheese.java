package com.company.aniketkr.designpatterns.decorator.topping;

import com.company.aniketkr.designpatterns.decorator.Pizza;
import java.util.List;

public class Cheese extends ToppingDecorator {

  public Cheese(Pizza newPizza) {
    super(newPizza);
  }

  @Override
  public double getCost() {
    return tempPizza.getCost() + 32;
  }

  @Override
  public List<String> getToppings() {
    List<String> toppings = tempPizza.getToppings();
    toppings.add("Cheese");
    return toppings;
  }
}
