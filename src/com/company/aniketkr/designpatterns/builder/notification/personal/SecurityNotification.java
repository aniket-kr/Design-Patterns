package com.company.aniketkr.designpatterns.builder.notification.personal;

public class SecurityNotification implements PersonalNotification {

  @Override
  public void sendNotification(String message) {
    System.out.println("(SMS) Security: " + message);
  }
}
