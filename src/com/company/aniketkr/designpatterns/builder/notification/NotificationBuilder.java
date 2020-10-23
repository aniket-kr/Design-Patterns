package com.company.aniketkr.designpatterns.builder.notification;

import com.company.aniketkr.designpatterns.builder.Booking;
import com.company.aniketkr.designpatterns.builder.notification.personal.CoachNotification;
import com.company.aniketkr.designpatterns.builder.notification.personal.FacilityManagerNotification;
import com.company.aniketkr.designpatterns.builder.notification.personal.MemberNotification;
import com.company.aniketkr.designpatterns.builder.notification.personal.SecurityNotification;

public class NotificationBuilder {

  public static Notification build(Booking booking) {
    return switch (booking.getBookingType()) {
      case INDIVIDUAL -> buildIndividualNotification(booking);
      case COACHING -> buildCoachingNotification(booking);
      case EVENT_HOSTING -> buildHostingNotification(booking);
    };
  }

  private static Notification buildIndividualNotification(Booking booking) {
    Notification notification = new Notification();

    notification.addNotificationParty(new SecurityNotification());
    notification.addNotificationParty(new MemberNotification());

    return notification;
  }

  private static Notification buildCoachingNotification(Booking booking) {
    Notification notification = new Notification();

    notification.addNotificationParty(new SecurityNotification());
    notification.addNotificationParty(new MemberNotification());
    notification.addNotificationParty(new CoachNotification());

    return notification;
  }

  private static Notification buildHostingNotification(Booking booking) {
    Notification notification = new Notification();

    notification.addNotificationParty(new SecurityNotification());
    notification.addNotificationParty(new MemberNotification());
    notification.addNotificationParty(new FacilityManagerNotification());

    return notification;
  }
}