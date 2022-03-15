/**
 * This class models a Hero which is an extension of the Player class.
 * @author Thea Arias
 */

public abstract class Hero extends Player {
    /* A Hero's helpful skill */
    private String helpfulSkill;
    /* A Hero's skill level */
    private int skillLevel;

    /**
     * Creates a new Hero object with the deafult name as "Hero," default lives as 3 and default health as 100
     */
    protected Hero() {
        super("Hero", 3,100);
    }

    /**
     * Creates a new Hero object with given parameters
     * @param name this Hero's name
     * @param lives this Hero's number of lives
     * @param health this Hero's health value
     * @param helpfulSkill this Hero's helpful skill
     * @param skillLevel this Hero's skill level
     */
    protected Hero(String name, int lives, int health, String helpfulSkill, int skillLevel) {
        super(name, lives, health);
        this.helpfulSkill = helpfulSkill;
        this.skillLevel = skillLevel;
    }

    /**
     * Gets this Hero's helpful skill
     * @return this Hero's helpful skill
     */
    public String getHelpfulSkill() {
        return helpfulSkill;
    }

    /**
     * Gets this Hero's skill level
     * @return this Hero's skill level
     */
    public int getSkillLevel() {
        return skillLevel;
    }

    /**
     * Sets this Hero's helpful skill
     * @param helpfulSkill this Hero's helpful skill
     */
    public void setHelpfulSkill(String helpfulSkill) {
        this.helpfulSkill = helpfulSkill;
    }

    /**
     * Sets this Hero's skill level
     * @param skillLevel this Hero's skill level
     */
    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
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
     * Gets a short output that includes all of this Hero's data members
     * @return parent (Player) class' data members concatenated with this Hero's helpful skill and skill level
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nHelpful Skill: " + helpfulSkill +
                "\nSkill Level: " + skillLevel;
    }
}
