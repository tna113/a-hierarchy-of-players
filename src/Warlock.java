public class Warlock extends Villain implements Transportable {
    private int numOfSpells;
    private boolean deadly;

    public Warlock() {
        super("Warlock", 3, 100, "none", 0);
    }

    public Warlock(String name, int lives, int health, String damageType, int damageLevel, int numOfSpells, boolean deadly) {
        super(name, lives, health, damageType, damageLevel);
        this.numOfSpells = numOfSpells;
        this.deadly = deadly;
    }

    public int getNumOfSpells() {
        return numOfSpells;
    }

    public boolean isDeadly() {
        return deadly;
    }

    public void setNumOfSpells(int numOfSpells) {
        this.numOfSpells = numOfSpells;
    }

    public void setDeadly(boolean deadly) {
        this.deadly = deadly;
    }

    @Override
    public void ready() {
        System.out.println("Warlock is ready.");
    }

    @Override
    public void speak() {
        System.out.println("Warlock is speaking.");
    }

    @Override
    public void move() {
        System.out.println("Warlock is moving.");
    }

    @Override
    public void teleport() {
        System.out.println("Warlock is teleporting!");
    }

    @Override
    public void fly() {
        System.out.println("Warlock is flying!");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Spells: " + numOfSpells +
                "\nDeadly: " + deadly;
    }
}