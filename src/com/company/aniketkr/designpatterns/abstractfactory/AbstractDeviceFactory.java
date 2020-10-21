package com.company.aniketkr.designpatterns.abstractfactory;

import com.company.aniketkr.designpatterns.abstractfactory.device.Device;
import com.company.aniketkr.designpatterns.abstractfactory.device.DeviceType;

public abstract class AbstractDeviceFactory {

  public abstract Device getDevice(DeviceType deviceType);
}
