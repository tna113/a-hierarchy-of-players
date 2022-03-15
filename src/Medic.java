public class Medic extends Hero {
    private String expertise;

    public Medic() {
        super("Medic", 3, 100, "none",0);
    }

    public Medic(String name, int lives, int health, String helpfulSkill, int skillLevel, String expertise) {
        super(name, lives, health, helpfulSkill, skillLevel);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public void ready() {
        System.out.println("Medic is ready.");
    }

    @Override
    public void speak() {
        System.out.println("Medic is speaking.");
    }

    @Override
    public void move() {
        System.out.println("Medic is moving.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nExpertise: " + expertise;
    }
}
