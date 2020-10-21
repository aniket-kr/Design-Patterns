package com.company.aniketkr.designpatterns.strategy;

import com.company.aniketkr.designpatterns.strategy.flyingability.CannotFly;

public class Client {

  /*
   * The Strategy pattern helps in "de-coupling" behaviour from related objects.
   *
   * The basic idea is to encapsulate behaviour, in this case in an interface
   * (Flys), and then define different types that implement that behaviour in
   * different ways (CanFly, CannotFly, and maybe a BackwardsFly). This helps us
   * redefine behaviour dynamically without having to touch the implementing
   * classes.
   */

  public static void main(String[] args) {
    Animal cooper = new Dog("Cooper", 5);
    Animal chirps = new Bird("Chirps", 1);

    System.out.println("Copper, the dog,  makes sound: " + cooper.makeSound());
    System.out.println("Chirps, the bird, makes sound: " + chirps.makeSound());
    System.out.println();
    System.out.println("Copper tries to fly: " + cooper.tryToFly());
    System.out.println("Chirps tries to fly: " + chirps.tryToFly());

    System.out.println("Chirps becomes injured and can't fly now..");

    chirps.setFlyingType(new CannotFly());  // notice how behaviour can be changed dynamically too

    System.out.println("Chirps tries to fly: " + chirps.tryToFly());
  }
}
