import java.util.Scanner;
public class Main {
    static Nudgemon[] allNudgemon = new Nudgemon[9];
    static Scanner s = new Scanner(System.in);
    static Nudgemon[] hotbar = new Nudgemon[6];
    static Nudgemon[] storage = new Nudgemon[10];
    public static void main(String[] args) {
        allNudgemon[0] = new Nudgemon(1, "Torchicken", "Fire");
        allNudgemon[1] = new Nudgemon(2, "Mudkipper", "Water");
        allNudgemon[2] = new Nudgemon(3, "Trekko", "Grass");
        allNudgemon[3] = new Nudgemon (4, "Burnmander", "Fire");
        allNudgemon[4] = new Nudgemon(5, "Spritzle", "Water");
        allNudgemon[5] = new Nudgemon (6, "Bulbasore", "Grass");
        allNudgemon[6] = new Nudgemon(7,"Fireeon", "Fire");
        allNudgemon[7] = new Nudgemon(8, "Watereon", "Water");
        allNudgemon[8] = new Nudgemon (9, "Weirdish", "Grass");
        // starting sequence
        System.out.print("Hello trainer! My name is Professor Ginkgo. What's yours? \nMy name is: ");
        String playerName = s.nextLine();
        System.out.println("Alright, " + playerName + "! Time to pick your starter pokemon. Would you like: \n 1. Torchicken, the fire type? \n 2. Mudkipper, the water type? \n 3. Trekko, the grass type?");
        int starter = s.nextInt();
        if (starter == 1 || starter == 2 || starter == 3){
            hotbar[0] = allNudgemon[starter-1];
            System.out.println("You got " + hotbar[0].species + "!");
        }
        System.out.println("Good luck on your journey!");
        hotbar[1] = allNudgemon[4];
        System.out.println("What would you like to do now? \n 1. Explore! \n 2. Check hotbar. \n 3. Exchange Pokemon w/ Prof. Ginkgo. \n 4. Quit.");
        //explore
        int eventNum = (int) (Math.random()*3+1);
        eventNum = 1;
        if (eventNum == 1){
            battle();
        } else if (eventNum == 3){
            exchange();
        } else if (eventNum == 2) {
            feed();
        }

    }
    public static void battle(){
        int battleIndex = (int) (Math.random()*9);
        Nudgemon battleNudgemon = allNudgemon[battleIndex];
        Nudgemon partner = hotbar[0];
        Boolean loss = false;
        Boolean win = false;
        int numFainted = 0;
        int numHotbar = 0;
        System.out.println("Uh oh! You are being challenged by a " + battleNudgemon.species + "!");
        System.out.println("Go, " + partner.species+ "!");
        while (battleNudgemon.health != 0 && !loss){
            for (int i = 0; hotbar[i] != null; i++){
                if (hotbar[i].health == 0){
                    numFainted++;
                }
                numHotbar++;
            }
            if (numFainted == numHotbar){
                System.out.println("All of your Nudgemon have fainted! You lost!");
                loss = true;
            }
            if (battleNudgemon.health == 0){
                System.out.println("Your opponent has fainted! Would you like to catch it? Y/N");
                String catchDecision = s.nextLine;
                if (catchDecision.equals("Y") || catchDecision.equals("y")){
                    i = 0;
                    while (hotbar[i] != null && i <=5){
                        i++;
                    }
                    if (i < 5){
                        hotbar[i+1] = battleNudgemon;
                        System.out.println("You've caught " + battleNudgemon.species + "!")
                    }
                    else {
                        System.out.println("Your hotbar is full. Would you like to discard a Nudgemon? Y/N");
                        String discardDecision = s.nextLine;
                        if (discardDecision.equals("Y") || discardDecision.equals("y")){
                            System.out.println("You are carrying:");      
                            for (int i = 0; hotbar[i] != null; i++){
                            System.out.println(i+1 + ". " + hotbar[i].species);
                        }
                            System.out.println("Which Nudgemon would you like to discard?");
                            int discardIndex = s.nextInt;
                            hotbar[discardIndex - 1] = battleNudgemon;
                            System.out.println("You have caught " + battleNudgemon.species + "!")
                    }
                        if(discardDecision.equals("N") || discardDecision.equals("n")){
                            System.out.println(battleNudgemon.species + " has run away!");
                        }
                }
                
            }
            }

            if (!loss){
                System.out.println("What would you like to do? \n 1. Fight \n 2. Switch Nudgemon");
                int battleChoice = s.nextInt();
                int opponentDamage = 10;
                int partnerDamage = 10;
                if (battleChoice == 1){
                    if(partner.type.equals("Fire")){
                        System.out.println(partner.species+ " did Flamethrower!");
                        if (battleNudgemon.type.equals("Grass")) {
                            opponentDamage = 20;
                            System.out.println("It's super effective!");
                            System.out.println(battleNudgemon.species + " did Razor Blade! \n It's not very effective...");
                            partnerDamage = 5;
                            }
                        else if (battleNudgemon.type.equals("Water")){
                            opponentDamage = 5;
                            System.out.println("It's not very effective...");
                            System.out.println(battleNudgemon.species + " did Water Gun! \n It's super effective!");
                            partnerDamage = 20;
                        }
                        else{
                            System.out.println(battleNudgemon.species + " did Flamethrower!");
                        }

                    }
                    if(partner.type.equals("Water")){
                        System.out.println(partner.species + " did Water Gun!");
                        if (battleNudgemon.type.equals("Fire")) {
                            opponentDamage = 20;
                            System.out.println("It's super effective!");
                            System.out.println(battleNudgemon.species + " did Flamethrower! \n It's not very effective...");
                            partnerDamage = 5;
                        }
                        else if (battleNudgemon.type.equals("Grass")){
                            opponentDamage = 5;
                            System.out.println("It's not very effective...");
                            System.out.println(battleNudgemon.species + " did Razor Leaf! \n It's super effective!");
                            partnerDamage = 20;
                        }
                        else{
                            System.out.println(battleNudgemon.species + " did Water Gun!");
                        }

                    }
                    if(partner.type.equals("Grass")){
                        System.out.println(partner.species + " did Razor Leaf!");
                        if (battleNudgemon.type.equals("Water")) {
                            opponentDamage = 20;
                            System.out.println("It's super effective!");
                            System.out.println(battleNudgemon.species + " did Water Gun! \n It's not very effective...");
                            partnerDamage = 5;
                        }
                        else if (battleNudgemon.type.equals("Fire")){
                            opponentDamage = 5;
                            System.out.println("It's not very effective...");
                            System.out.println(battleNudgemon.species + " did Flamethrower! \n It's super effective!");
                            partnerDamage = 20;
                        }
                        else{
                            System.out.println(battleNudgemon.species + " did Razor Leaf!");
                        }

                    }
                    battleNudgemon.health = battleNudgemon.health - opponentDamage;
                    System.out.println("Opponent's Health: " + battleNudgemon.health + "/100");
                    partner.health = partner.health - partnerDamage;
                    System.out.println("Partner's Health: " + partner.health + "/100");
                }
                if (battleChoice == 2 || partner.health == 0){
                    System.out.println("You are carrying: ");
                    for (int i = 0; hotbar[i] != null; i++){
                        System.out.println(i+1 + ". " + hotbar[i].species);
                }
                    System.out.println("Which Nudgemon would you like to take out?");
                    int indexSwitch = s.nextInt();
                    while (hotbar[indexSwitch-1].health == 0){
                        System.out.println("This Nudgemon has fainted!");
                        System.out.println("Which Nudgemon would you like to take out?");
                        indexSwitch = s.nextInt();
                    }
                    System.out.println("Come back, " + partner.species + "!");
                    partner = hotbar[indexSwitch-1];
                    System.out.println("Go, " + partner.species + "!");
        }
            }
 
        }

    }
    public static void feed(){

    }

    public static void exchange(){
        System.out.println("What would you like to do? \n 1. Switch Nudgemon \n 2. Check stored Nudgemon \n 3. Discard stored Nudgemon");
        int exchangeChoice = s.nextInt();
        if (exchangeChoice == 1){
            System.out.println("In your hotbar, you have: ");
            for (int i = 0; hotbar[i] != null; i++){
                System.out.println(i+1 + ". " + hotbar[i].species);
            }
        }
    }
    }

