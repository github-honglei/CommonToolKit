package com.hllearn.convert;

import java.time.*;

public class DateHelper {

    /**
     * get year of system time
     * @return
     */
    public static int getYear(){
        return LocalDate.now().getYear();
    }

    /**
     * get month of system time
     * @return
     */
    public static int getMonth(){
        return LocalDate.now().getMonthValue();
    }

    /**
     * get day of system time
     * @return
     */
    public static int getDay(){
        return LocalDate.now().getDayOfMonth();
    }

    /**
     * timestamp(long) to LocalDateTime
     * @param timestamp
     * @return
     */
    public static LocalDateTime toLocalDateTime(long timestamp){
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    /**
     *  get year of timestamp
     * @param timestamp
     * @return
     */
    public static int getYear(long timestamp) {
        LocalDateTime dateTime = toLocalDateTime(timestamp);
        return dateTime.getYear();
    }

    /**
     * get month of timestamp
     * @param timestamp
     * @return
     */
    public static int getMonth(long timestamp){
        LocalDateTime dateTime = toLocalDateTime(timestamp);
        return dateTime.getMonthValue();
    }

    /**
     * get day of timestamp
     * @param timestamp
     * @return
     */
    public static int getDay(long timestamp){
        LocalDateTime dateTime = toLocalDateTime(timestamp);
        return dateTime.getDayOfMonth();
    }

    /**
     * get two time inveval
     * @param fir
     * @param sec
     * @param timeUnit
     * @return
     */
    public static long getInterval(LocalDateTime fir, LocalDateTime sec, TimeUnit timeUnit) {
        Duration duration = Duration.between(fir, sec);
        long inteval = 0;
        switch (timeUnit) {
            case Days:
                inteval = duration.toDays();
                break;
            case Hours:
                inteval = duration.toHours();
                break;
            case Minutes:
                inteval = duration.toMinutes();
                break;
            case Millis:
                inteval = duration.toMillis();
                break;
            case Nanos:
                inteval = duration.toNanos();
                break;
        }
        return inteval;
    }
}
