package com.company.aniketkr.designpatterns.builder;

import com.company.aniketkr.designpatterns.builder.Booking.BookingType;
import com.company.aniketkr.designpatterns.builder.notification.Notification;
import com.company.aniketkr.designpatterns.builder.notification.NotificationBuilder;

public class Client {

  /*
   * SCENARIO
   * ========
   * As part of a larger application, "Tennis Court Booking System", after a
   * booking is made, a mandatory notification (via SMS and/or Email) is sent
   * out to all relevant parities. The parties involved being Security Office,
   * Member (who booked the session), Coach and Facility Manager.
   *
   * Three types of Bookings are allowed:
   *   1. Individual Session: Member is alone and only security office needs
   *                          to be informed to let the member into the premises
   *                          at the correct time.
   *
   *   2. Coaching Session: Member wants to a coach to be present with them. In
   *                        this case, security office, the member and the coach
   *                        need to be informed.
   *
   *   3. Event Hosting Session: This is assumed to be using a lot of facilities
   *                             of the business. The notification must be sent
   *                             out to security office, member (who booked) and
   *                             the facility manager for the premises.
   *
   * IMPLEMENTATION
   * ==============
   * As evident from the scenario above, the notification class must be
   * initialised differently based upon the type of booking made by the member.
   * The complex logic of instantiation of 'Notification' instance is handled
   * by the 'NotificationBuilder' class, so as to keep the client code neat.
   *
   * CONCLUSION
   * ==========
   * The Builder pattern is used to abstract and encapsulate complex
   * instantiation logic from the client code. This makes is easier to change
   * "configuration" in the future and centralises changes.
   * Another possible use case of the Builder pattern to define "default"
   * initialisations for objects with A LOT of fields/parameters.
   */

  public static void main(String[] args) {
    for (BookingType type : BookingType.values()) {
      Booking booking = new Booking(type);
      Notification notification = NotificationBuilder.build(booking);
      // Date and Time information could be pulled from the 'booking' object in a real case
      notification.sendNotification(booking.getBookingType() + " - 16:00 hrs at 19-11-2020");

      System.out.println();
      System.out.println();
    }
  }
}
