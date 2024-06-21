package StudyCase.Utils;

public enum Level {
    VIP("Sultan"),
    STANDARD("kere");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
