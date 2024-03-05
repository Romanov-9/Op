import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Fisch {

    String type;
    double weight;
    int price;


    public Fisch(String type, double weight,int price) {
        this.type =type ;
        this.weight=weight;
        this.price =price;
    }
    public String  printInfo() {
        return("type- "+ type+", "+" Weight- "+  weight+", "+" Price- "+ price+"\n");

    }
    public void writeFile(ArrayList<Fisch> listtoWrite) {
        try {
            FileWriter fw = new FileWriter("Fish use.txt");
            for (Fisch i : listtoWrite) {
                fw.write(i.printInfo());

            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
