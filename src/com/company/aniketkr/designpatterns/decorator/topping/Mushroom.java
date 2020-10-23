package com.company.aniketkr.designpatterns.decorator.topping;

import com.company.aniketkr.designpatterns.decorator.Pizza;
import java.util.List;

public class Mushroom extends ToppingDecorator {

  public Mushroom(Pizza newPizza) {
    super(newPizza);
  }

  @Override
  public double getCost() {
    return tempPizza.getCost() + 19;
  }

  @Override
  public List<String> getToppings() {
    List<String> toppings = tempPizza.getToppings();
    toppings.add("Mushroom");
    return toppings;
  }
}
