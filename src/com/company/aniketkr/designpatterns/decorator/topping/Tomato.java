package com.company.aniketkr.designpatterns.decorator.topping;

import com.company.aniketkr.designpatterns.decorator.Pizza;
import java.util.List;

public class Tomato extends ToppingDecorator {

  public Tomato(Pizza newPizza) {
    super(newPizza);
  }

  @Override
  public double getCost() {
    return tempPizza.getCost() + 16;
  }

  @Override
  public List<String> getToppings() {
    List<String> toppings = tempPizza.getToppings();
    toppings.add("Tomato");
    return toppings;
  }
}
