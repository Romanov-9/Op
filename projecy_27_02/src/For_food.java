public class For_food extends Fisch{
    boolean presence_of_bones;

    public For_food(String type, double weight, int price,boolean presence_of_bones) {
        super(type, weight, price);
        this.presence_of_bones=presence_of_bones;
    }

    public String  printInfo() {
        return("Fisch for food"+"-"+"Type- "+ type+", "+" Weight- "+  weight+", "+" Price- "+ price+", "+" Prezence of bones- "+presence_of_bones+"\n");

    }

}
