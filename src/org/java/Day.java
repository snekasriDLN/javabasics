package org.java;

public class Day {
public static void main(String args[]) {
Date d1 = new Date();
d1.setDay(1);
d1.setMonth(6);
d1.setYear(2018);
d1.displayDate();
Date d2 = new Date(1,2018,6);
d2.displayDate();
}
}

