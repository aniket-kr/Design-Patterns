package com.company.aniketkr.designpatterns.strategy;

import com.company.aniketkr.designpatterns.strategy.flyingability.CanFly;

public class Bird extends Animal {

  public Bird(String name, int age) {
    super();

    setFlyingType(new CanFly());
    setName(name);
    setAge(age);
  }

  @Override
  public String makeSound() {
    return "Tweet! Chirp!!";
  }
}
