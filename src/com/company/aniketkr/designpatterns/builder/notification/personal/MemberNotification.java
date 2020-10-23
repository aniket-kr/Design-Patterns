package com.company.aniketkr.designpatterns.builder.notification.personal;

public class MemberNotification implements PersonalNotification {
  
  @Override
  public void sendNotification(String message) {
    System.out.println("(SMS) Member: " + message);
    System.out.println("(Email) Member: " + message);
  }
}
