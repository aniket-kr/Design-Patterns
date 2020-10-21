package com.company.aniketkr.designpatterns.strategy;

import com.company.aniketkr.designpatterns.strategy.flyingability.Flys;


public abstract class Animal {
  private Flys flyingType;

  private String name;
  private byte age;

  /* **************************************************************************
   * Section: Getters and Setters
   ************************************************************************** */

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name != null && !name.isBlank()) {
      this.name = name;
    } else {
      throw new IllegalArgumentException("param 'name' is either null or blank");
    }
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age >= 0 && age <= 100) {  // range: [0, 100]
      this.age = (byte) age;
    } else {
      throw new IllegalArgumentException("param 'age' must be in range [0, 100]");
    }
  }

  public Flys getFlyingType() {
    return flyingType;
  }

  public void setFlyingType(Flys flyingType) {
    if (flyingType != null) {
      this.flyingType = flyingType;
    } else {
      throw new IllegalArgumentException("param 'flyingType' must not be null");
    }
  }

  /* **************************************************************************
   * Section: Instance Methods
   ************************************************************************** */

  public abstract String makeSound();

  public String tryToFly() {
    return flyingType.fly();
  }
}
