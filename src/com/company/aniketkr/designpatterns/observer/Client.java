package com.company.aniketkr.designpatterns.observer;

public class Client {

  /*
   * The observer pattern is used to define a sort of one to many relation. If
   * the subject (object being observed) is updated, then it pushes updates
   * to every single observer that is subscribed to the subject. This pattern
   * is heavily used in user interface and binding controls. With a little
   * renovation, it can be used for event driven programming.
   */

  public static void main(String[] args) {
    Subject<String> newsAgency1 = new Subject<>("AGENCY-1");
    Subject<String> newsAgency2 = new Subject<>("AGENCY-2");

    ObserverImpl<String> newsStudio1 = new ObserverImpl<>("STUDIO-1");
    ObserverImpl<String> newsStudio2 = new ObserverImpl<>("STUDIO-2");
    ObserverImpl<String> newsStudio3 = new ObserverImpl<>("STUDIO-3");
    ObserverImpl<String> newsStudio4 = new ObserverImpl<>("STUDIO-4");
    ObserverImpl<String> newsStudio5 = new ObserverImpl<>("STUDIO-5");
    ObserverImpl<String> newsStudio6 = new ObserverImpl<>("STUDIO-6");


    // Subscriptions
    newsAgency1.addObserver(newsStudio1);
    newsAgency1.addObserver(newsStudio2);
    newsAgency1.addObserver(newsStudio3);
    newsAgency1.addObserver(newsStudio5);
    newsAgency1.addObserver(newsStudio6);

    newsAgency2.addObserver(newsStudio2);
    newsAgency2.addObserver(newsStudio3);
    newsAgency2.addObserver(newsStudio4);
    newsAgency2.addObserver(newsStudio6);

    System.out.println(newsAgency1);
    System.out.println(newsAgency2);

    // Push news
    newsAgency1.pushUpdate("NEWS from Agency-1.");
    newsAgency2.pushUpdate("NEWS from Agency-2.");

    // Change state
    System.out.println();
    System.out.printf("Removing '%s' from receiving updates.%n", newsStudio2);

    newsAgency1.removeObserver(newsStudio2);
    newsAgency2.removeObserver(newsStudio2);

    System.out.println(newsAgency1);
    System.out.println(newsAgency2);

    // Push another round of news
    newsAgency1.pushUpdate("Earthquake near 'AGENCY-2'.");
    newsAgency2.pushUpdate("Flooding in low-lying port areas.");
  }
}
