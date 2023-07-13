import java.time.Month;
import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        int day = 0;
        int month;
        int hour;
        int minutes;
        String monthString;
        String dayMonth;
        String pDay= "";
        String pYear = "Please enter the year you were born (1950-2015)";
        String pMonth = "Please enter the month you were born as a number (1-12)";
        String pHour = "Please enter the hour you were born (1-24)";
        String pMinute = "Please enter the minute you were born (1-59)";
        year = SafeInput.getRangedInt(in, pYear, 1950,2015);
        month= SafeInput.getRangedInt(in,pMonth, 1, 12);
        monthString = Month.of(month).name();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                dayMonth = "(1-31)";
                pDay = "Please enter the day you were born " + dayMonth + "";
                day = SafeInput.getRangedInt(in, pDay, 1, 31);
            }
            case 4, 6, 9, 11 -> {
                dayMonth = "(1-30)";
                pDay = "Please enter the day you were born " + dayMonth + "";
                day = SafeInput.getRangedInt(in, pDay, 1, 30);
            }
            case 2 -> {
                dayMonth = "(1-29)";
                pDay = "Please enter the day you were born " + dayMonth + "";
                day = SafeInput.getRangedInt(in, pDay, 1, 30);
            }
        }
        hour = SafeInput.getRangedInt(in,pHour, 1,24);
        minutes= SafeInput.getRangedInt(in,pMinute, 1, 59);
        System.out.println("You were born on "+monthString+", "+day+" "+year+" at "+hour+":"+minutes);

    }

}

