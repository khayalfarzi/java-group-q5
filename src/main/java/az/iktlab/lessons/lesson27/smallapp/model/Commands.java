package az.iktlab.lessons.lesson27.smallapp.model;

public enum Commands {

    SP("Save person"),
    RU("Register user"),
    SHP("Show people"),
    EXIT("Exit");

    private final String description;

    Commands(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
