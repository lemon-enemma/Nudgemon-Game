public class Nudgemon {
    public String species;
    public int nudgedexNumber;
    public String type;
    public int loveRating;

    public Nudgemon(int n, String s, String t){
        species = s;
        nudgedexNumber = n;
        type = t;
        loveRating = 0;
    }

    public void printInfo(){
        System.out.println("This Nudgemon is a " + species + ". Its type is " + type + ".");
        if (loveRating == 100){
            System.out.println(species + "loves you so much! You must take very good care of it.");
        }
        else if (loveRating >=90){
            System.out.println("You have a strong bond with " + species + ". Great job taking care of it!");
        }
    }

}
