public class PitCrewTeam {
    private String role;
    private int members;

    public PitCrewTeam(String role, int members) {
        this.role = role;
        this.members = members;
    }

    // Getters and Setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    // Método para imprimir información sobre el equipo
    public void printInfo() {
        System.out.println("Role: " + role);
        System.out.println("Number of members: " + members);
    }
}