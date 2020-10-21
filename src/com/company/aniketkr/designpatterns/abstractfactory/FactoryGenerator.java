package com.company.aniketkr.designpatterns.abstractfactory;

public class FactoryGenerator {

  public static AbstractDeviceFactory getFactory(FactoryType factoryType) {
    return switch (factoryType) {
      case LAPTOP_FACTORY -> new LaptopFactory();
      case PHONE_FACTORY -> new PhoneFactory();
    };
  }
}
