import java.util.Scanner;
public class Main {
    static Nudgemon[] allNudgemon = new Nudgemon[10];
    static Scanner s = new Scanner(System.in);
    static Nudgemon[] hotbar = new Nudgemon[6];
    public static void main(String[] args) {
        allNudgemon[0] = new Nudgemon(1, "Torchicken", "Fire");
        allNudgemon[1] = new Nudgemon(2, "Mudkipper", "Water");
        allNudgemon[2] = new Nudgemon(3, "Trekko", "Grass");
        allNudgemon[3] = new Nudgemon (4, "Eeveeon", "Normal");
        allNudgemon[4] = new Nudgemon(5, "Geobro", "Rock");
        allNudgemon[5] = new Nudgemon (6, "Articunoe", "Flying");
        allNudgemon[6] = new Nudgemon(7,"Pikachoo", "Electric");
        allNudgemon[7] = new Nudgemon(8, "Dugduo", "Ground");
        allNudgemon[8] = new Nudgemon (9, "Dogerpie", "Bug");
        allNudgemon[9] = new Nudgemon(10, "Obamasnow", "Ice");
        // starting sequence
        System.out.print("Hello trainer! My name is Professor Ginkgo. What's yours? \nMy name is: ");
        String playerName = s.nextLine();
        System.out.println("Alright, " + playerName + "! Time to pick your starter pokemon. Would you like: \n 1. Torchicken? \n 2. Mudkipper? \n 3. Trekko?");
        int starter = s.nextInt();
        if (starter == 1 || starter == 2 || starter == 3){
            hotbar[0] = allNudgemon[starter-1];
            System.out.println("You got " + hotbar[0].species + "!");
        }
        System.out.println("Good luck on your journey!");
        System.out.println("What would you like to do now? \n 1. Explore! \n 2. Check hotbar. \n 3. Exchange Pokemon w/ Prof. Ginkgo.");
        battle();

        //explore
        int eventNum = (int)(Math.random() * 3 + 1);
    }
    public static void battle(){
        int battleIndex = (int) (Math.random()*9);
        Nudgemon battleNudgemon = allNudgemon[battleIndex];
        System.out.println("Uh oh! You are being challenged by a wild " + battleNudgemon.species + "!");
        System.out.println("Go, " + hotbar[0].species + "!");
        System.out.println("What would you like to do? \n 1. Fight \n 2. Run \n 3. Switch Nudgemon");

    }
}