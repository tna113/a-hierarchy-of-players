public class Wizard extends Hero implements Transportable {
    private String wizardType;
    private int yearsPracticing;

    public Wizard() {
        super("Wizard",3,100,"none",0);
    }

    public Wizard(String name, int lives, int health, String helpfulSkill, int skillLevel, String wizardType, int yearsPracticing) {
        super(name, lives, health, helpfulSkill, skillLevel);
        this.wizardType = wizardType;
        this.yearsPracticing = yearsPracticing;
    }

    public String getWizardType() {
        return wizardType;
    }

    public int getYearsPracticing() {
        return yearsPracticing;
    }

    public void setWizardType(String wizardType) {
        this.wizardType = wizardType;
    }

    public void setYearsPracticing(int yearsPracticing) {
        this.yearsPracticing = yearsPracticing;
    }

    @Override
    public void ready() { System.out.println("Wizard is ready."); }

    @Override
    public void speak() {
        System.out.println("Wizard is speaking.");
    }

    @Override
    public void move() {
        System.out.println("Wizard is moving.");
    }

    @Override
    public void teleport() {
        System.out.println("Wizard is teleporting!");
    }

    @Override
    public void fly() {
        System.out.println("Wizard is flying!");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nWizard Type: " + wizardType +
                "\nYears Practicing: " + yearsPracticing;
    }
}
