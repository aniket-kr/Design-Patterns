package com.company.aniketkr.designpatterns.strategy.flyingability;

public class CannotFly implements Flys {

  @Override
  public String fly() {
    return "Doesn't have the ability to fly :(";
  }
}
