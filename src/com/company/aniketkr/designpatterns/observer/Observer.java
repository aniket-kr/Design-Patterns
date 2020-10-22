package com.company.aniketkr.designpatterns.observer;

import java.lang.annotation.Target;

@FunctionalInterface
public interface Observer<DataT> {

  void update(DataT data);
}
