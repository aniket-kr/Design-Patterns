package com.company.aniketkr.designpatterns.observer;

public class ObserverImpl<DataT> implements Observer<DataT> {
  private final String label;

  public ObserverImpl(String label) {
    this.label = label;
  }

  @Override
  public void update(DataT data) {
    System.out.printf("Updated '%s': %s%n", label, data);
  }

  @Override
  public String toString() {
    return label;
  }
}
