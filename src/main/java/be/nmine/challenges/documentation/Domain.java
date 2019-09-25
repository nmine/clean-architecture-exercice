package be.nmine.challenges.documentation;

public enum Domain {
    ALLOCATION("just for example");

    private String value;

    Domain(String value) {
        this.value = value;
    }

    public String getFullName() {
        return value;
    }
}
