//package JavaChallenges;
//
//import java.util.*;
//
//import static java.lang.Integer.parseInt;
//import static jdk.nashorn.internal.objects.NativeFunction.function;
//
//class Main {
//
//    public static String ParseTime(String[] time) {
//        String[] timeParts = time.split(":", 2);
//        int hours = parseInt(timeParts[0]);
//        int minutes = parseInt(timeParts[1].substr(0, 2));
//        String AMPM = timeParts[1].substr(2, 2).toUpperCase();
//        int totalMinutes = hours * 60 + minutes;
//        if (AMPM == "PM" && hours < 12)
//            totalMinutes += 12 * 60;
//
//        return { hours: hours, minutes: minutes, AMPM: AMPM, totalMinutes: totalMinutes };
//    }
//
//    public static int FormatTime(int time) {
//        return (time < 10) ? '0' + time : time;
//    }
//
//    public static String MostFreeTime(String[] strArr) {
//        String[] startTimes = {};
//        String[] endTime = {};
//        for (int i = 0; i < strArr.length; i++) {
//            String period = strArr[i];
//            String[] times = period.split("-");
//            String[] time1 = ParseTime(times[0]);
//            String[] time2 = ParseTime(times[1]);
//            time1.endTime = time2;
//            startTimes.push(time1);
//        }
//        startTimes.sort(function (a, b){ return a.totalMinutes - b.totalMinutes})
//
//        //to find difference between times
//        int diff = 0;
//        int mostDiff = 0;
//        for (int i = 0; i < (startTimes.length - 1); i++) {
//            int endTimeOfEvent = startTimes[i].endTime;
//            String startTimeOfNextEvent = startTimes[i + 1];
//            diff = startTimeOfNextEvent.totalMinutes - endTimeOfEvent.totalMinutes;
//            if (diff > mostDiff)
//                mostDiff = diff;
//        }
//
//        int output;
//        if (mostDiff < 60)
//            output = '00:' + FormatTime(mostDiff);
//        else {
//            int hours = (mostDiff / 60);
//            int minutes = mostDiff % 60;
//            output = FormatTime(hours) + ':' + FormatTime(minutes);
//        }
//        return output;
//    }
//}
//
//}
//
//public class Moretimefree{
//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        Main main = new Main();
//        System.out.print(main.MostFreeTime(s.findInLine()));
//    }
//
//}
