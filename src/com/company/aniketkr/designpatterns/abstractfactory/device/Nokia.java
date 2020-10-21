package com.company.aniketkr.designpatterns.abstractfactory.device;

public class Nokia extends Device {

  public Nokia(int ram, String cpuBrand) {
    setRam(ram);
    setCpuBrand(cpuBrand);
  }

  @Override
  public void setRam(int ramInGb) {
    super.setRam(ramInGb, 0, 16);
  }

  @Override
  public String toString() {
    return String.format("Nokia (%dGB RAM, %s CPU)", getRam(), getCpuBrand());
  }
}
