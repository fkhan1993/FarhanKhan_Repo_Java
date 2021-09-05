package Homework13;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import java.lang.String;

public class Homework13 {
    // Due Date : Sept 05, 2021

    /**
     * Question:
     * Create a method that will take an int as input.
     * Return the timeline (hour am/pm) with 2 hours interval from the current hour
     */
    public static void main(String[] args) {
        int interval = 120; //minutes interval
        List timesList = new ArrayList(); // time array
        String[] ap = {"AM", "PM"}; // AM-PM
        String timeFormat;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; ) {
                if (h < 12) {
                    timeFormat = String.format("%02d:%02d %s", h, m, "AM");
                } else {
                    timeFormat = String.format("%02d:%02d %s", h, m, "PM");
                }
                timesList.add(timeFormat);
                m = m + interval;
            }

        }
        //To match the time
        timeFormat = String.format("%02d:%02d %s", 0, 0, "AM");
        timesList.add(timeFormat);
        //print timings
        for (Object time : timesList) {
            System.out.println(time);
        }

    }

    // sout(generateTimeline(5));
    // 9pm 11pm 1am 3am 5am


    // sout(generateTimeline(5));   // running code around 8:12am
    // 8am 10am 12pm 2pm 4pm

    // sout(generateTimeline(10));   // running code around 3:45pm
    // 3pm 5pm 7pm 9pm 11pm 1am 3am 5am 7am 9am
}
