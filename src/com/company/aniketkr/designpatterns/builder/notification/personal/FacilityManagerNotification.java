package com.company.aniketkr.designpatterns.builder.notification.personal;

public class FacilityManagerNotification implements PersonalNotification {

  @Override
  public void sendNotification(String message) {
    System.out.println("(Email) Facility Manager: " + message);
  }
}