public class For_ayuarium extends Fisch{
    int life_time;
    String color;
    public For_ayuarium(String type, double weight, int price, int life_time,String color) {
        super(type, weight, price);
        this.life_time=life_time;
        this.color=color;
    }

    public String  printInfo() {
        return("Fisch for ayarium"+"-"+"Type- "+ type+", "+" Weight- "+  weight+", "+" Price- "+ price+", "+" Life time- "+life_time+", "+" Color- "+  color+"\n");

    }



    public int getLife_time() {
        return life_time;
    }

    public void setLife_time(int life_time) {
        this.life_time = life_time;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
