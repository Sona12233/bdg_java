package enumeration.ex2;

public enum Weekdays {
    MONDAY, TUEDSAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    public int numberOfWeekday(Weekdays weekdays){
        return weekdays.ordinal() + 1;
    }
}
