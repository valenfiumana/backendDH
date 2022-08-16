public class CounterTerrorist implements Player {
private final String TASK; // Intrinsic Attribute
private String weapon; // Extrinsic Attribute

public CounterTerrorist() {
    TASK = "DIFFUSE BOMB";
}
public void assignWeapon(String weapon) {
    this.weapon = weapon;
}
public void mission() {
    System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
}
}