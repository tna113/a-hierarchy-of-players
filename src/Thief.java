public class Thief extends Villain {
    private int sneakLevel;
    private boolean master;

    public Thief() {
        super("Thief", 3, 100, "none", 0);
    }

    public Thief(String name, int lives, int health, String damageType, int damageLevel, int sneakLevel, boolean master) {
        super(name, lives, health, damageType, damageLevel);
        this.sneakLevel = sneakLevel;
        this.master = master;
    }

    public int getSneakLevel() {
        return sneakLevel;
    }

    public boolean isMaster() {
        return master;
    }

    public void setSneakLevel(int sneakLevel) {
        this.sneakLevel = sneakLevel;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }

    @Override
    public void ready() {
        System.out.println("Thief is ready.");
    }

    @Override
    public void speak() {
        System.out.println("Thief is speaking.");
    }

    @Override
    public void move() {
        System.out.println("Thief is moving.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSneak Level: " + sneakLevel +
                "\nMaster: " + master;
    }
}
