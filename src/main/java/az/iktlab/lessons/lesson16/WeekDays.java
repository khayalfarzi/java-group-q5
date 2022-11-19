package az.iktlab.lessons.lesson16;

public enum WeekDays {

    MONDAY(1, "Bazar Ertəsi"),
    TUESDAY(2, "Çərşənbə axşamı"),
    WEDNESDAY(3, "Çərşənbə"),
    THURSDAY(4, "Cumə axşamı"),
    FRIDAY(5, "Cumə"),
    SATURDAY(6, "Şənbə"),
    SUNDAY(7, "Bazar");

    private final int code;
    private final String nameInAz;

    WeekDays(int code, String nameInAz) {
        this.code = code;
        this.nameInAz = nameInAz;
    }

    public int getCode() {
        return code;
    }

    public String getNameInAz() {
        return nameInAz;
    }

    public static String getNameInAzByCode(int code) {
        for (WeekDays day : WeekDays.values()) {
            if (day.getCode() == code)
                return day.getNameInAz();
        }

        return null;
    }
}
