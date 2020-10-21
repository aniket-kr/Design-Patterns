package com.company.aniketkr.designpatterns.abstractfactory;

import com.company.aniketkr.designpatterns.abstractfactory.device.Device;
import com.company.aniketkr.designpatterns.abstractfactory.device.DeviceType;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {

  /*
   * The best way to think about Abstract Factory Pattern is to think of it as
   * a factory of factories. It is useful when responsibility of object
   * instantiation needs to be divided up ino further sub factories.
   *
   * Here, a "Device" is used to mean to both a laptop and a phone. The
   * responsibility of instantiation of "Device" subclasses has been divided up
   * into "LaptopFactory" and "PhoneFactory". Both factories are subclasses
   * of the larger abstract factory "AbstractDeviceFactory".
   *
   * The pattern is such that the client only ever has to deal with the toplevel
   * wrapper factory, "FactoryGenerator" in this case. Using enums and abstract
   * factory pattern, the task of 'DYNAMIC OBJECT INSTANTIATION' can be divided
   * up into further sub classes for better classification.
   *
   * The disadvantage to such a pattern is that things can get very complicated,
   * very quickly.Also, every new subclass needs to be added to the factory
   * chain.
   */

  public static Scanner getInput(String message) {
    System.out.print(message);
    return new Scanner(System.in, StandardCharsets.UTF_8);
  }

  public static void main(String[] args) {
    do {
      // Dynamic runtime instantiation
      FactoryType factory = switch (getInput("Phone[1] or a Laptop[2]? ").nextInt()) {
        case 1 -> FactoryType.PHONE_FACTORY;
        case 2 -> FactoryType.LAPTOP_FACTORY;
        default -> throw new IllegalArgumentException("Bad Input Value");
      };

      DeviceType device = switch (getInput("Brand: HP[1],Apple[2],OnePlus[3],Nokia[4]? ").nextInt()) {
        case 1 -> DeviceType.HP;
        case 2 -> DeviceType.APPLE;
        case 3 -> DeviceType.ONE_PLUS;
        case 4 -> DeviceType.NOKIA;
        default -> throw new IllegalArgumentException("Bad Input Value");
      };

      Device foundDevice = FactoryGenerator.getFactory(factory).getDevice(device);

      System.out.println("We found the following device: " + foundDevice);

    } while (!getInput("Go again?[Y/n] ").next().equalsIgnoreCase("n"));
  }
}
