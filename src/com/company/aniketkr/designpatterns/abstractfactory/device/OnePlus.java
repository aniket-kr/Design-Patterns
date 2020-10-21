package com.company.aniketkr.designpatterns.abstractfactory.device;

public class OnePlus extends Device {

  public OnePlus(int ram, String cpuBrand) {
    setRam(ram);
    setCpuBrand(cpuBrand);
  }

  @Override
  public void setRam(int ramInGb) {
    super.setRam(ramInGb, 0, 32);
  }

  @Override
  public String toString() {
    return String.format("OnePlus (%dGB RAM, %s CPU)", getRam(), getCpuBrand());
  }
}

