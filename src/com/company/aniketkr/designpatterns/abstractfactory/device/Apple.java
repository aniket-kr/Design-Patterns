package com.company.aniketkr.designpatterns.abstractfactory.device;

public class Apple extends Device {

  public Apple(int ram, String cpuBrand) {
    setRam(ram);
    setCpuBrand(cpuBrand);
  }

  @Override
  public void setRam(int ramInGb) {
    super.setRam(ramInGb, 0, 16);
  }

  @Override
  public String toString() {
    return String.format("Apple (%dGB RAM, %s CPU)", getRam(), getCpuBrand());
  }
}

