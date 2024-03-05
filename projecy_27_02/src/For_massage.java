public class For_massage extends Fisch{
    boolean use_in_massage;
    public For_massage(String type, double weight, int price,boolean use_in_massage) {
        super(type, weight, price);
        this.use_in_massage=use_in_massage;
    }
    public String  printInfo() {
        return("Fisch for massage"+"-"+"Type- "+ type+", "+" Weight- "+  weight+", "+" Price- "+ price+", "+" Use in massage- "+use_in_massage+"\n");

    }

    public boolean isUse_in_massage() {
        return use_in_massage;
    }

    public void setUse_in_massage(boolean use_in_massage) {
        this.use_in_massage = use_in_massage;
    }
}
