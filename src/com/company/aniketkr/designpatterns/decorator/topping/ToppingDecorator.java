package com.company.aniketkr.designpatterns.decorator.topping;

import com.company.aniketkr.designpatterns.decorator.Pizza;

public abstract class ToppingDecorator implements Pizza {

  protected Pizza tempPizza;

  public ToppingDecorator(Pizza newPizza) {
    this.tempPizza = newPizza;
  }
}
