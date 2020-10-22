package com.company.aniketkr.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject<DataT> {
  private final String label;
  private final List<Observer<? super DataT>> observerList;

  public Subject(String label) {
    this.label = label;
    this.observerList = new ArrayList<>();
  }

  public void addObserver(Observer<? super DataT> observer) {
    observerList.add(observer);
  }

  public void removeObserver(Observer<? super DataT> observer) {
    observerList.remove(observer);
  }

  public void pushUpdate(DataT newData) {
    System.out.printf("Sending update from %s: %s%n", label, newData);
    this.observerList.forEach(observer -> observer.update(newData));
  }

  @Override
  public String toString() {
    return String.format("(%s) %s", label, observerList);
  }
}


