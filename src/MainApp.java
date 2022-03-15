import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name,damageType,helpfulSkill,expertise,wizardType;
        int health=0,lives=0,damageLevel=0,skillLevel=0,sneakLevel=0,numSpells=0,yearsPracticing=0;

        //flags used to check user inputs regarding health, lives, damage level, skill level, sneak level, number of spells and years practicing
        boolean flag100 = false, flag20 = false, flag3 = false;

        System.out.println("<< Hello and welcome! >>" +
                "\n<< This program will allow you to create different characters." +
                "\n<< You have the ability to choose from a villain or a hero." +
                "\n<< Hero characters are medics and wizards while villain" +
                "\n<< characters are thieves and warlocks.\n" +
                "\n<< After creating your player(s), you are allowed to remove them" +
                "\n<< from the list, view the list, and perform certain actions.");

        boolean flag = true;                              //controls loop
        ArrayList<Player> players = new ArrayList<>();    //stores Player objects
        while(flag) {                                     //continue running while flag is true
            printMenu();                                  //prints main menu
            int selection = scan.nextInt();               //gets user menu selection
            scan.nextLine();                              //clears buffer

            switch (selection) {
                case 1:
                    //checks to see if list is empty before printing
                    if (players.isEmpty()) {
                        System.out.println("There are no players in the list.");
                    } else {
                        System.out.println("\n<< Players in the list >>");
                        printObjects(players);
                    }
                    break;
                case 2:
                    boolean flag2 = true;
                    while (flag2) {
                        System.out.println("\nChoose a player type to add:" +
                                "\n1. Thief \n2. Warlock \n3. Medic \n4. Wizard");
                        int selection2 = scan.nextInt();
                        scan.nextLine();
                        System.out.println();

                        switch (selection2) {
                            case 1:
                                System.out.print("Enter thief name: ");
                                name = scan.nextLine();

                                flag100 = false; //reset for reuse
                                while(!flag100){ //getting player health
                                    System.out.print("Enter health [1-100]: ");
                                    health = scan.nextInt();
                                    flag100 = checkLimit(health,0,100);

                                    if(!flag100) {
                                        System.out.println("Health value needs to be between 1 and 100.");
                                    }
                                }

                                flag3 = false; //reset for reuse
                                while(!flag3){    //getting player number of lives
                                    System.out.print("Enter number of lives [1-3]: ");
                                    lives = scan.nextInt();
                                    scan.nextLine();
                                    flag3 = checkLimit(lives,0,3);

                                    if(!flag3) {
                                        System.out.println("Number of lives needs to be between 1 and 3.");
                                    }
                                }

                                System.out.print(("Enter damage type: ")); //getting player damage type
                                damageType = scan.nextLine();

                                flag100 = false; //reset for reuse
                                while(!flag100) {   //getting player damage level
                                    System.out.print("Enter damage level [1-100]: ");
                                    damageLevel = scan.nextInt();
                                    scan.nextLine();
                                    flag100 = checkLimit(damageLevel,0,100);

                                    if(!flag100) {
                                        System.out.println("Damage level needs to be between 1 and 100.");
                                    }
                                }

                                flag20 = false; //reset for reuse
                                while(!flag20) {   //getting player sneak level
                                    System.out.print("Enter sneak level [1-20]: ");
                                    sneakLevel = scan.nextInt();
                                    scan.nextLine();
                                    flag20 = checkLimit(sneakLevel,0,20);

                                    if(!flag20) {
                                        System.out.println("Sneak level needs to be between 1 and 20.");
                                    }
                                }

                                System.out.println("Are you a master?\nEnter 1 for yes \nEnter 2 for no"); //getting player mastery
                                int masterNum = scan.nextInt();
                                scan.nextLine();
                                boolean mastery = true;
                                switch (masterNum) {
                                    case 1:
                                        players.add(new Thief(name, lives, health, damageType, damageLevel, sneakLevel, mastery));
                                        break;
                                    case 2:
                                        mastery = false;
                                        players.add(new Thief(name, lives, health, damageType, damageLevel, sneakLevel, mastery));
                                        break;
                                    default:
                                        System.out.println("Please enter a valid number.");
                                }

                                System.out.println("Thief " + name + " has been created.");
                                flag2=false;
                                break;
                            case 2:
                                System.out.print("Enter Warlock name: "); //getting player name
                                name = scan.nextLine();

                                flag100 = false; //reset for reuse
                                while(!flag100){    //getting player health
                                    System.out.print("Enter health [1-100]: ");
                                    health = scan.nextInt();
                                    scan.nextLine();
                                    flag100 = checkLimit(health,0,100);

                                    if(!flag100) {
                                        System.out.println("Health value needs to be between 1 and 100.");
                                    }
                                }

                                flag3 = false; //reset for reuse
                                while(!flag3){    //getting player number of lives
                                    System.out.print("Enter number of lives [1-3]: ");
                                    lives = scan.nextInt();
                                    scan.nextLine();
                                    flag3 = checkLimit(lives,0,3);

                                    if(!flag3) {
                                        System.out.println("Number of lives needs to be between 1 and 3.");
                                    }
                                }

                                System.out.print(("Enter damage type: ")); //getting player damage type
                                damageType = scan.nextLine();


                                flag100 = false; //reset for reuse
                                while(!flag100){    //getting player damage level
                                    System.out.print("Enter damage level [1-100]: ");
                                    damageLevel = scan.nextInt();
                                    scan.nextLine();
                                    flag100 = checkLimit(damageLevel,0,100);

                                    if(!flag100) {
                                        System.out.println("Damage level needs to be between 1 and 100.");
                                    }
                                }

                                flag20 = false; //reset for reuse
                                while(!flag20) {   //getting player num of spells
                                    System.out.print("Enter number of spells [1-20]: ");
                                    numSpells = scan.nextInt();
                                    scan.nextLine();
                                    flag20 = checkLimit(numSpells, 0, 20);

                                    if (!flag20) {
                                        System.out.println("Number of spells needs to be between 1 and 20.");
                                    }
                                }

                                System.out.println("Are you deadly?\nEnter 1 for yes\nEnter 2 for no"); //getting player deadly value
                                int deadlyNum = scan.nextInt();
                                scan.nextLine();
                                boolean isDeadly=true;
                                switch (deadlyNum) {
                                    case 1:
                                        players.add(new Warlock(name, lives, health, damageType, damageLevel, numSpells,isDeadly));
                                        break;
                                    case 2:
                                        isDeadly=false;
                                        players.add(new Warlock(name, lives, health, damageType, damageLevel, numSpells,isDeadly));
                                        break;
                                    default:
                                        System.out.println("Please enter a valid number.");
                                }

                                System.out.println("Warlock " + name + " has been created.");
                                flag2=false;
                                break;
                            case 3:
                                System.out.print("Enter Medic name: ");
                                name = scan.nextLine();

                                flag100 = false; //reset for reuse
                                while(!flag100){ //getting player health
                                    System.out.print("Enter health [1-100]: ");
                                    health = scan.nextInt();
                                    scan.nextLine();
                                    flag100 = checkLimit(health,0,100);

                                    if(!flag100) {
                                        System.out.println("Health value needs to be between 1 and 100.");
                                    }
                                }

                                flag3 = false; //reset for reuse
                                while(!flag3){ //getting player number of lives
                                    System.out.print("Enter number of lives [1-3]: ");
                                    lives = scan.nextInt();
                                    scan.nextLine();
                                    flag3 = checkLimit(lives,0,3);

                                    if(!flag3) {
                                        System.out.println("Number of lives needs to be between 1 and 3.");
                                    }
                                }

                                System.out.print("Enter helpful skill: "); //getting player's helpful skill
                                helpfulSkill = scan.nextLine();

                                flag20 = false; //reset for reuse
                                while(!flag20) {   //getting player skill level
                                    System.out.print("Enter skill level [1-20]: ");
                                    skillLevel = scan.nextInt();
                                    scan.nextLine();
                                    flag20 = checkLimit(skillLevel, 0, 20);

                                    if (!flag20) {
                                        System.out.println("Skill level needs to be between 1 and 20.");
                                    }
                                }

                                System.out.print("Enter expertise: "); //getting player's expertise
                                expertise = scan.nextLine();

                                players.add(new Medic(name, lives, health, helpfulSkill, skillLevel, expertise));
                                System.out.println("Medic " + name + " has been created.");
                                flag2=false;
                                break;
                            case 4:
                                System.out.print("Enter Wizard name: ");
                                name = scan.nextLine();

                                flag100 = false; //reset for reuse
                                while(!flag100){ //getting player health
                                    System.out.print("Enter health [1-100]: ");
                                    health = scan.nextInt();
                                    scan.nextLine();
                                    flag100 = checkLimit(health,0,100);

                                    if(!flag100) {
                                        System.out.println("Health value needs to be between 1 and 100.");
                                    }
                                }

                                flag3 = false; //reset for reuse
                                while(!flag3){ //getting player number of lives
                                    System.out.print("Enter number of lives [1-3]: ");
                                    lives = scan.nextInt();
                                    scan.nextLine();
                                    flag3 = checkLimit(lives,0,3);

                                    if(!flag3) {
                                        System.out.println("Number of lives needs to be between 1 and 3.");
                                    }
                                }

                                //getting player's helpful skill
                                System.out.print("Enter helpful skill: ");
                                helpfulSkill = scan.nextLine();

                                flag20 = false; //reset for reuse
                                while(!flag20) { //getting player skill level
                                    System.out.print("Enter skill level [1-20]: ");
                                    skillLevel = scan.nextInt();
                                    scan.nextLine();
                                    flag20 = checkLimit(skillLevel, 0, 20);

                                    if (!flag20) {
                                        System.out.println("Skill level needs to be between 1 and 20.");
                                    }
                                }

                                //getting player's wizard type
                                System.out.print("Enter wizard type: ");
                                wizardType = scan.nextLine();

                                flag20 = false; //reset for reuse
                                while(!flag20) { //getting player years practicing
                                    System.out.print("Enter number of years practicing [1-20]: ");
                                    yearsPracticing = scan.nextInt();
                                    scan.nextLine();
                                    flag20 = checkLimit(yearsPracticing, 0, 20);

                                    if (!flag20) {
                                        System.out.println("Years practicing needs to be between 1 and 20.");
                                    }
                                }

                                players.add(new Wizard(name, lives, health, helpfulSkill, skillLevel, wizardType, yearsPracticing));
                                System.out.println("Wizard " + name + " has been created.");
                                flag2=false;
                                break;
                            default:
                                System.out.println("Please enter a valid number.\n");
                        }
                    }
                    break;
                case 3:
                    //checks to see if list is empty before removing
                    if (players.isEmpty()) {
                        System.out.println("There are no players in the list.");
                    } else {
                        System.out.print("\nEnter the name of the player to be removed: ");
                        String removeName = scan.nextLine();
                        removeName = removeName.toLowerCase();
                        boolean found = false;

                        //loops through arraylist to find player
                        for (int i = 0; i < players.size(); i++) {
                            String playerName = players.get(i).getName();
                            playerName = playerName.toLowerCase();
                            if (removeName.equals(playerName)) {
                                players.remove(i);
                                System.out.println("Player successfully removed.");
                                found = true;
                            }
                        }
                        //looped through arraylist but player not found
                        if (!found) {
                            System.out.println("Player not found.");
                        }
                    }
                    break;
                case 4:
                    //check to see if list if empty before doing an action
                    if (players.isEmpty()) {
                        System.out.println("There are no players in the list.");
                    } else {
                        System.out.print("\nEnter the name of the player to do an action: ");
                        String actionName = scan.nextLine();
                        actionName = actionName.toLowerCase();
                        boolean found = false;

                        //loops through arraylist to find player
                        for (int i = 0; i < players.size(); i++) {
                            String playerName = players.get(i).getName();
                            playerName = playerName.toLowerCase();

                            if (actionName.equals(playerName)) {
                                found = true;
                                boolean flag4 = true;
                                //if player is wizard or warlock do this
                                if(players.get(i) instanceof Wizard || players.get(i) instanceof Warlock) {
                                    boolean wiz = false;
                                    if(players.get(i) instanceof Wizard) {
                                        wiz = true;
                                    } else {
                                        wiz = false;
                                    }
                                    while(flag4) {
                                        printCase4Special(); //prints menu for wizard & warlock types
                                        int action = scan.nextInt();
                                        scan.nextLine();
                                        switch (action) {
                                            case 1:
                                                System.out.print("\n" + playerName + " the ");
                                                players.get(i).ready();
                                                System.out.println();
                                                flag4 = false;
                                                break;
                                            case 2:
                                                System.out.print("\n" + playerName + " the ");
                                                players.get(i).speak();
                                                System.out.println();
                                                flag4 = false;
                                                break;
                                            case 3:
                                                System.out.print("\n" + playerName + " the ");
                                                players.get(i).move();
                                                System.out.println();
                                                flag4 = false;
                                                break;
                                            case 4:
                                                System.out.print("\n" + playerName + " the ");

                                                if(wiz) {
                                                    Wizard tempWiz = (Wizard)players.get(i);
                                                    tempWiz.teleport();
                                                } else {
                                                    Warlock tempWar = (Warlock)players.get(i);
                                                    tempWar.teleport();
                                                }

                                                System.out.println();
                                                flag4 = false;
                                                break;
                                            case 5:
                                                System.out.print("\n" + playerName + " the ");

                                                if(wiz) {
                                                    Wizard tempWiz = (Wizard)players.get(i);
                                                    tempWiz.fly();
                                                } else {
                                                    Warlock tempWar = (Warlock)players.get(i);
                                                    tempWar.fly();
                                                }
                                                System.out.println();
                                                flag4 = false;
                                                break;
                                            default:
                                                System.out.println("Please enter a valid number.\n");
                                        }
                                    }
                                } else {
                                    //non-wizard and non-warlock cases
                                    while (flag4) {
                                        printCase4(); //prints menu for non-wizard / non-warlock type
                                        int action = scan.nextInt();
                                        scan.nextLine();
                                        switch (action) {
                                            case 1:
                                                System.out.print("\n" + playerName + " the ");
                                                players.get(i).ready();
                                                System.out.println();
                                                flag4 = false;
                                                break;
                                            case 2:
                                                System.out.print("\n" + playerName + " the ");
                                                players.get(i).speak();
                                                System.out.println();
                                                flag4 = false;
                                                break;
                                            case 3:
                                                System.out.print("\n" + playerName + " the ");
                                                players.get(i).move();
                                                System.out.println();
                                                flag4 = false;
                                                break;
                                            default:
                                                System.out.println("Please enter a valid number.\n");
                                        }
                                    }
                                }
                            }
                        }
                        //looped through arraylist but player not found
                        if (!found) {
                            System.out.println("Player does not exist.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("\nGoodbye!");
                    flag = false;
                    break;
                default:
                    System.out.println("Please enter a valid number.");
            }
        }
    }

    //Prints the program's main menu
    public static void printMenu() {
        System.out.println("\n<< Choose an option >>");
        System.out.println("1. View Players");
        System.out.println("2. Add Player");
        System.out.println("3. Remove Player");
        System.out.println("4. Perform an Action");
        System.out.println("5. End Program");
    }

    //Prints the sorted array list
    public static void printObjects(ArrayList<Player> pList) {
        Collections.sort(pList);
        for (int i = 0; i < pList.size(); i++) {
            System.out.println(pList.get(i));
            System.out.println();
        }
    }

    //Prints the menu for creating non-wizard and non-warlock type player
    public static void printCase4() {
        System.out.println("\n<< What would you like to do? >>" +
                "\n1. ready" +
                "\n2. speak" +
                "\n3. move");
    }

    //Prints the menu for creating wizard or warlock type player
    public static void printCase4Special() {
        System.out.println("\n<< What would you like to do? >>" +
                "\n1. ready" +
                "\n2. speak" +
                "\n3. move" +
                "\n4. teleport" +
                "\n5. fly");
    }

    /**
     * A method for calculating whether a number is within its stated limits
     * @param num the number being checked
     * @param lowLimit the lower limit of the number
     * @param highLimit the high limit of the number
     * @return true of num is within the limit and false otherwise
     */
    public static boolean checkLimit(int num,int lowLimit, int highLimit) {
        if (num>lowLimit && num< (highLimit+1)) {
            return true;
        } else {
            return false;
        }
    }
}
