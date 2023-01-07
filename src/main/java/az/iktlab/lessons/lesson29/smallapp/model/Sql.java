package az.iktlab.lessons.lesson29.smallapp.model;

public enum Sql {

    FIND_MAX_ID("select max(id) as max_id from person;");

    private final String value;

    Sql(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
