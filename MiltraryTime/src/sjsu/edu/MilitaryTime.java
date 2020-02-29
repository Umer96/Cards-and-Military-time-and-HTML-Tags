package sjsu.edu;

import java.util.Scanner;

public class MilitaryTime {

    public static void Time (int firstTime, int secondTime) {
        int firstHours = firstTime / 100;
        int firstMinutes = firstTime % 100;
        int firstHoursInSeconds = firstHours * (60*60);
        int firstMinutesInSeconds = firstMinutes * 60;
        int totalFirstInSeconds = firstHoursInSeconds + firstMinutesInSeconds;

        int secondHours = secondTime / 100;
        int secondMinutes = secondTime % 100;
        int secondHoursInSeconds = secondHours * (60*60);
        int secondMinutesInSeconds = secondMinutes * 60;
        int totalSecondTimeInSeconds = secondHoursInSeconds + secondMinutesInSeconds;

        if (firstTime <= secondTime) {
            int differenceInSeconds = totalSecondTimeInSeconds - totalFirstInSeconds;

            int timeInHours = differenceInSeconds / (60*60);
            int timeInSeconds = differenceInSeconds % (60*60);
            int timeInMinutes = timeInSeconds / 60;

            System.out.println(timeInHours+" hours"+" "+ timeInMinutes+" minutes");
        }
        else  { //(firstTime >= secondTime)
            int TwentyFourHoursInSeconds = 24 * 60 * 60;
            int differenceInSeconds =  TwentyFourHoursInSeconds + (totalSecondTimeInSeconds - totalFirstInSeconds);
            int timeInHours = differenceInSeconds / (60*60);
            int timeInSeconds = differenceInSeconds % (60*60);
            int timeInMinutes = timeInSeconds / 60;

            System.out.println(timeInHours+" hours"+" "+ timeInMinutes+" minutes");

        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner  (System.in);

        System.out.println("Please enter the first time: ");
        int firstTime = in.nextInt();

        System.out.println("Please enter the second time: ");
        int secondTime = in.nextInt();
        if ((firstTime % 100) >= 60 || (secondTime % 100) >= 60){
            System.out.println("You made a mistake. Please enter the correct time.");
        }
        else if (firstTime < 0 || firstTime > 2400  && secondTime < 0 || secondTime > 2400) {
            System.out.println("Incorrect time. Please enter the correct time");
        }
        else {
            Time(firstTime, secondTime);
        }

    }
}