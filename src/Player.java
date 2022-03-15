/**
 * This class models a Player or character.
 * @author Thea Arias
 */

public class Player implements Comparable<Player>{
    /* The name of the Player */
    private String name;
    /* The number of lives that the Player has*/
    private int lives;
    /* The amount of health the Player has */
    private int health;

    /**
     * Creates a new Player object with all parameters set to 0 and "Player" as the default name
     */
    public Player() {
        this("Player",0,0);
    }

    /**
     * Creates a new Player object with given name, lives and health
     * @param name the name of the Player
     * @param lives the Player's number of lives
     * @param health the Player's health value
     */
    public Player(String name, int lives, int health) {
        this.name = name;
        this.lives = lives;
        this.health = health;
    }

    /**
     * Gets the name of the Player
     * @return the name of this Player
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the Player's lives
     * @return this Player's number of lives
     */
    public int getLives() {
        return lives;
    }

    /**
     * Gets the health value of the Player
     * @return this Player's heath value
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the name of the Player
     * @param name name of this Player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the Player's number of lives
     * @param lives number of lives this Player has
     */
    public void setLives(int lives) {
        this.lives = lives;
    }

    /**
     * Sets the Player's health value
     * @param health the value of this Player's health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets a short output that includes all of this Player's data members
     * @return name, lives and health value
     */
    @Override
    public String toString() {
        return "Player name: " + name +
                "\nLives: " + lives +
                "\nHealth: " + health;
    }

    /**
     * Outputs a small string stating that this Player is ready
     */
    public void ready(){ System.out.println("The player is ready."); }

    /**
     * Outputs a small string stating that this Player is speaking
     */
    public void speak(){
        System.out.println("The player is speaking.");
    }

    /**
     * Outputs a small string stating that this Player is moving
     */
    public void move(){
        System.out.println("The player is moving.");
    }

    /**
     * Compares this Player object's health value with another Player object's health value.
     * @param o the Player object being compared with
     * @return a +1 if this Player's health is greater than the second, a 0 if this Player's health is the same as the second and -1 otherwise
     */
    @Override
    public int compareTo(Player o) {
        if (this.getHealth() == o.getHealth()) {
            return 0;
        }
        else if (this.getHealth() > o.getHealth()) {
            return 1;
        } else {
            return -1;
        }
    }
}
