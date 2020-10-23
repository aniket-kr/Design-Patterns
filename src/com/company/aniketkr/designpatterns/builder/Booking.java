package com.company.aniketkr.designpatterns.builder;

public class Booking {

  private final BookingType bookingType;

  public Booking(BookingType bookingType) {
    this.bookingType = bookingType;
  }

  public BookingType getBookingType() {
    return bookingType;
  }

  public enum BookingType {
    INDIVIDUAL, COACHING, EVENT_HOSTING
  }
}
