package com.company.aniketkr.designpatterns.abstractfactory.device;

public abstract class Device {
  private short ram;
  private String cpuBrand;

  /* **************************************************************************
   * Section: Getters and Setters
   ************************************************************************** */

  public int getRam() {
    return ram;
  }

  public abstract void setRam(int ramInGb);

  protected void setRam(int ramInGb, int lowExcl, int highIncl) {
    if (ramInGb > lowExcl && ramInGb <= highIncl) {  // RAM range: (low, high] GBs
      this.ram = (short) ramInGb;
    } else {
      throw new IllegalArgumentException(//
          String.format("param 'ramInGb' must be in range (%d, %d] GB", lowExcl, highIncl)//
      );
    }
  }

  public String getCpuBrand() {
    return cpuBrand;
  }

  public void setCpuBrand(String cpuBrand) {
    if (cpuBrand != null && !cpuBrand.isBlank()) {
      this.cpuBrand = cpuBrand;
    } else {
      throw new IllegalArgumentException("param 'cpuBrand' is either null or blank");
    }
  }

  /* **************************************************************************
   * Section: Instance Methods
   ************************************************************************** */

  @Override
  public abstract String toString();
}
