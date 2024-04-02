public class F1Team {
    private String name;
    private int foundationYear;

    public F1Team(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }
}