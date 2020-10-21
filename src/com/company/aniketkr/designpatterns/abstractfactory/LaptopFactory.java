package com.company.aniketkr.designpatterns.abstractfactory;

import com.company.aniketkr.designpatterns.abstractfactory.device.Device;
import com.company.aniketkr.designpatterns.abstractfactory.device.DeviceType;
import com.company.aniketkr.designpatterns.abstractfactory.device.Hp;

public class LaptopFactory extends AbstractDeviceFactory {

  @Override
  public Device getDevice(DeviceType deviceType) {
    return switch (deviceType) {
      case HP -> new Hp(16, "Intel", "AMD");
      default -> null;
    };
  }
}
