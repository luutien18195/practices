package com.designpattern.observer;

import com.designpattern.observer.groupchatservice.Group;
import com.designpattern.observer.groupchatservice.impl.User;
import com.designpattern.observer.mailservice.impl.CommonMail;
import com.designpattern.observer.mailservice.impl.MailServer;
import com.designpattern.observer.mailservice.impl.UserMail;
import com.designpattern.observer.weatherservice.impl.ConditionDisplay;
import com.designpattern.observer.weatherservice.impl.ForecastDisplay;
import com.designpattern.observer.weatherservice.impl.WeatherDataSubjectImpl;

import java.util.Observer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        /*
         *  WeatherDataSubjectImpl weatherData = new WeatherDataSubjectImpl();
         *  ConditionDisplay d1 = new ConditionDisplay(weatherData);
         *  ForecastDisplay d2 = new ForecastDisplay(weatherData);
         *  weatherData.setMeasurement(1,4,5);
         *  System.out.println("\n==============\n");
         *  weatherData.setMeasurement(5,23,57);
         */

        /*
         * MailServer mailServer = new MailServer();
         * mailServer.subscribe(new UserMail("Tien"));
         * mailServer.subscribe(new CommonMail("Dr.Joy"));
         * mailServer.setNews(
         *     "The Observer Pattern defines a one-to-many dependency between objects" +
         *     "so that when one object changes state," +
         *     "all of its dependents are notified and updated automatically.");
         * mailServer.sendAll();
         */

        Group group = new Group("GR001");
        int[] userIndexes = IntStream.range(0, 10).toArray();
        for (int i: userIndexes)
            new User(group, "Anonymous [" + i + "]");

        group.notifyAllChange(">> Hi everyone, have a nice day!");
    }
}
