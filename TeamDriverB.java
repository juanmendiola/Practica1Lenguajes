public class TeamDriverB extends PitCrewTeam {
    private String driverName;

    public TeamDriverB(String role, int members, String driverName) {
        super(role, members);
        this.driverName = driverName;
    }

    // Getters and Setters
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    // Método para imprimir información sobre el piloto
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Driver name: " + driverName);
    }
}