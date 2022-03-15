/**
 * This class models a Villain which is an extension of the Player class.
 * @author Thea Arias
 */

public abstract class Villain extends Player {
    /* The type of damage of the Villain */
    private String damageType;
    /* The level of damage of the Villain */
    private int damageLevel;

    /**
     * Creates a new Villain object with the default name as "Villain," default lives as 3 and default health as 100
     */
    protected Villain() {
        super("Villain", 3, 100);
    }

    /**
     * Creates a new Villain object with given parameters
     * @param name the name of the Villain
     * @param lives the number of lives of the Villain
     * @param health the health value of the Villain
     * @param damageType the damage type of the Villain
     * @param damageLevel the Villain's level of damage
     */
    protected Villain(String name, int lives, int health, String damageType, int damageLevel) {
        super(name, lives, health);
        this.damageType = damageType;
        this.damageLevel = damageLevel;
    }

    /**
     * Gets the damage type of this Villain
     * @return this Villain's damage type
     */
    public String getDamageType() {
        return damageType;
    }

    /**
     * Gets the damage level of this Villain
     * @return this Villain's damage level
     */
    public int getDamageLevel() {
        return damageLevel;
    }

    /**
     * Sets this Villain's damage type
     * @param damageType damage type of this Villain
     */
    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    /**
     * Sets this Villain's damage level
     * @param damageLevel this Villain's damage level
     */
    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }

    /**
     * @inheritDoc
     */
    @Override
    public abstract void ready();

    /**
     * @inheritDoc
     */
    @Override
    public abstract void speak();

    /**
     * @inheritDoc
     */
    @Override
    public abstract void move();

    /**
     * Gets a short output that includes all of this Villain's data members
     * @return parent (Player) class' data members concatenated with this Villain's damage type and damage level
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nDamage Type: " + damageType +
                "\nDamage Level: " + damageLevel;
    }
}
