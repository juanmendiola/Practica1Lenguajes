public class main {
    public static void main(String[] args) {
        // Crear 20 personas definiendo a cada una por su propio rol o roles
        PitCrewTeam member1 = new TeamDriverA("Role1", 1, "DriverA");
        PitCrewTeam member2 = new TeamDriverA("Role2", 1, "DriverA");
        PitCrewTeam member3 = new TeamDriverB("Role3", 1, "DriverB");
        PitCrewTeam member4 = new TeamDriverB("Role4", 1, "DriverB");
        
        // Imprimir información de cada miembro
        member1.printInfo();
        member2.printInfo();
        member3.printInfo();
        member4.printInfo();
    }
}