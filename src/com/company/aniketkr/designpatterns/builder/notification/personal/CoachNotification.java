package com.company.aniketkr.designpatterns.builder.notification.personal;

public class CoachNotification implements PersonalNotification {

  @Override
  public void sendNotification(String message) {
    System.out.println("(SMS) Coach: " + message);
    System.out.println("(Email) Coach: " + message);
  }
}
