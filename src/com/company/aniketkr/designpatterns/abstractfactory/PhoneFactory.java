package com.company.aniketkr.designpatterns.abstractfactory;

import com.company.aniketkr.designpatterns.abstractfactory.device.Apple;
import com.company.aniketkr.designpatterns.abstractfactory.device.Device;
import com.company.aniketkr.designpatterns.abstractfactory.device.DeviceType;
import com.company.aniketkr.designpatterns.abstractfactory.device.Nokia;
import com.company.aniketkr.designpatterns.abstractfactory.device.OnePlus;

public class PhoneFactory extends AbstractDeviceFactory {

  @Override
  public Device getDevice(DeviceType deviceType) {
    return switch (deviceType) {
      case APPLE -> new Apple(4, "ARM");
      case NOKIA -> new Nokia(12, "Qualcomm");
      case ONE_PLUS -> new OnePlus(4, "MediaTek");
      default -> null;
    };
  }
}
