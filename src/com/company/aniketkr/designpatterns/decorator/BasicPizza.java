package com.company.aniketkr.designpatterns.decorator;

import com.company.aniketkr.designpatterns.decorator.topping.ToppingDecorator;
import java.util.ArrayList;
import java.util.List;

public class BasicPizza implements Pizza {

  @Override
  public double getCost() {
    return 80;
  }

  @Override
  public List<String> getToppings() {
    List<String> toppings = new ArrayList<>();
    toppings.add("Thin Dough Pizza Base");
    return toppings;
  }
}
