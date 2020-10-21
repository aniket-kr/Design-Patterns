package com.company.aniketkr.designpatterns.abstractfactory.device;

public class Hp extends Device {
  private String gpuBrand;

  public Hp(int ram, String cpuBrand, String gpuBrand) {
    setRam(ram);
    setCpuBrand(cpuBrand);
    setGpuBrand(gpuBrand);
  }

  @Override
  public void setRam(int ramInGb) {
    super.setRam(ramInGb, 2, 256);
  }

  public String getGpuBrand() {
    return gpuBrand;
  }

  public void setGpuBrand(String gpuBrand) {
    if (gpuBrand != null && !gpuBrand.isBlank()) {
      this.gpuBrand = gpuBrand;
    } else {
      throw new IllegalArgumentException("param 'gpuBrand' is either null or black");
    }
  }

  @Override
  public String toString() {
    return String.format("HP (%dGB RAM, %s CPU, %s GPU)", getRam(), getCpuBrand(), getGpuBrand());
  }
}

