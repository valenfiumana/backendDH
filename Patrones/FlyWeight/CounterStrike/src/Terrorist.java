public class Terrorist implements Player {
    private final String TASK; // Intrinsic Attribute
    private String weapon; // Extrinsic Attribute

    public Terrorist() {
        TASK = "PLANT A BOMB";
    }
    public void assignWeapon(String weapon) {
        this.weapon = weapon; // Assign a weapon
    }
    public void mission() {
        //Work on the Mission
        System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }
}

