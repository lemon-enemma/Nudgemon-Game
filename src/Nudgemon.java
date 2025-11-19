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
        else if (loveRating >= 70){
            System.out.println("Your bond with " + species + " is getting strong! Keep taking care of it!");
        }
        else if (loveRating >= 50){
            System.out.println("Your bond with " + species + " is somewhat strong. Let's make some good progress with it!");
        }
        else{
            System.out.println("Hmmm...I sense that your bond with " + species + " is quite weak. Try to feed it whenever you can.");
        }
    }




}
