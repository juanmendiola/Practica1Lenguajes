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
    public void Cambiollantas() {
        System.out.println("Comenzando cambio de llanatas");
    }
    private void Mantenimientogeneral() {
        System.out.println("Inicio de mantenimiento general");
    }
    public void printInfo() {
        System.out.println("Role: " + role);
        System.out.println("Number of members: " + members);
    }

    public static void main(String[] args) {
        // Create 20 members using role to classify
        PitCrewTeam[] pitCrewMembers = new PitCrewTeam[20];
        pitCrewMembers[0] = new PitCrewTeam("Tyre gunner", 4);
        pitCrewMembers[1] = new PitCrewTeam("Tyre off", 4);
        pitCrewMembers[2] = new PitCrewTeam("Tyre on", 4);
        pitCrewMembers[3] = new PitCrewTeam("Front jack", 2);
        pitCrewMembers[4] = new PitCrewTeam("Rear jack", 2);
        pitCrewMembers[5] = new PitCrewTeam("Side jack", 2);
        pitCrewMembers[6] = new PitCrewTeam("Front wing flap adjust", 2);
        pitCrewMembers[7] = new PitCrewTeam("Lollipop man", 1);

        // Print information of each member
        for (PitCrewTeam member : pitCrewMembers) {
            member.printInfo();
            System.out.println();
        }
    }
}
