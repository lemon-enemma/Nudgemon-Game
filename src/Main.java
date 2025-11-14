import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Nudgemon[] allNudgemon = new Nudgemon[9];
        allNudgemon[0] = new Nudgemon(1, "Torchicken", "Fire");
        allNudgemon[1] = new Nudgemon(2, "Mudkipper", "Water");
        allNudgemon[2] = new Nudgemon(3, "Trekko", "Grass");
        // starting sequence
        System.out.print("Hello trainer! My name is Professor Ginkgo. What's yours? \nMy name is: ");
        String playerName = s.nextLine();
        System.out.println("Alright, " + playerName + "! Time to pick your starter pokemon. Would you like: \n 1. Torchic? \n 2. Mudkip? \n 3. Treeko?");

    }
}