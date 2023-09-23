package homework_48;

public enum DayOfWeekResolver {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean flag;

    DayOfWeekResolver(boolean flag) {
        this.flag = flag;
    }

    public String typeOfDay(Integer parNum){
        switch (parNum){
            case 1:
                return "Monday is a working day " + "( " + MONDAY.flag + " )";
            case 2:
                return "Tuesday is a working day " + "( " + TUESDAY.flag + " )";
            case 3:
                return "Wednesday is a working day " + "( " + WEDNESDAY.flag + " )";
            case 4:
                return "Thursday is a working day " + "( " + THURSDAY.flag + " )";
            case 5:
                return "Friday is a working day " + "( " + FRIDAY.flag + " )";
            case 6:
                return "Saturday is a day off " + "( " + SATURDAY.flag + " )";
            case 7:
                return "Sunday is a day off " + "( " + SUNDAY.flag + " )";
        }
        return "";
    }
}
