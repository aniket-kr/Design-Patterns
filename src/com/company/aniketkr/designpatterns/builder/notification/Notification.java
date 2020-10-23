package com.company.aniketkr.designpatterns.builder.notification;

import java.util.ArrayList;
import java.util.List;
import com.company.aniketkr.designpatterns.builder.notification.personal.PersonalNotification;

public class Notification {
  private List<PersonalNotification> notificationParties;

  public Notification() {
    notificationParties = new ArrayList<>(4);
  }

  public void sendNotification(String message) {
    notificationParties.forEach(party -> party.sendNotification(message));
  }

  public void addNotificationParty(PersonalNotification notificationParty) {
    notificationParties.add(notificationParty);
  }
}
