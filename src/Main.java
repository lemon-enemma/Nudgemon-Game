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
        allNudgemon[3] = new Nudgemon (4, "Eeveeon", "Fire");
        allNudgemon[4] = new Nudgemon(5, "Geobro", "Water");
        allNudgemon[5] = new Nudgemon (6, "Articuny", "Grass");
        allNudgemon[6] = new Nudgemon(7,"Pikachoo", "Fire");
        allNudgemon[7] = new Nudgemon(8, "Dugduo", "Water");
        allNudgemon[8] = new Nudgemon (9, "Dogerpie", "Grass");
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

        System.out.println("What would you like to do now? \n 1. Explore! \n 2. Check hotbar. \n 3. Exchange Pokemon w/ Prof. Ginkgo. \n 4. Quit.");
        //explore
        int eventNum = (int)(Math.random() * 3 + 1);
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
        System.out.println("Uh oh! You are being challenged by a " + battleNudgemon.species + "!");
        System.out.println("Go, " + partner.species+ "!");
        while (battleNudgemon.health != 0 || partner.health != 0){
            System.out.println("What would you like to do? \n 1. Fight \n 2. Run \n 3. Switch Nudgemon");
            int battleChoice = s.nextInt();
            if (battleChoice == 1 && partner.type ==)
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