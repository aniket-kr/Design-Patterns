package com.company.aniketkr.designpatterns.strategy;

import com.company.aniketkr.designpatterns.strategy.flyingability.CannotFly;

public class Dog extends Animal {

  public Dog(String name, int age) {
    super();

    setFlyingType(new CannotFly());
    setName(name);
    setAge(age);
  }

  @Override
  public String makeSound() {
    return "Woof! Woof!!";
  }
}
