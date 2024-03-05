import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {




        Scanner fisch= new Scanner(System.in);
        System.out.println(" Ievadi jūsu  zivis  veidu ");
        String veids=fisch.nextLine();
        System.out.println(" Ievadi jūsu  zivis  svaru ");
        int svars= Integer.parseInt(fisch.nextLine());
        System.out.println(" Ievadi jūsu  zivis  cenu uz kg ");
        int cena= Integer.parseInt(fisch.nextLine());

        For_food pike= new For_food(veids,svars,cena,false);
        For_ayuarium catfish=new For_ayuarium(veids,svars,cena, 10,"Blue");
        For_massage Garra= new For_massage(veids,svars,cena ,true);



        System.out.println("Ievadi ciparu no 1 līdz 3. 1 edienam,2 ir akvariuma, 3 ir masažam ");
        int a= fisch.nextInt();
        switch (a){
            case 1:
                System.out.println(pike.printInfo()+"\n");
                System.out.printf("Edienam būs piemerota līdaka");
                break;


            case 2:
                System.out.println(catfish.printInfo()+"\n");
                System.out.println("Akvariumam būs piemēroti jūras zivis, ar interesantu krasu ");
                break;



            case 3:
                System.out.println(Garra.printInfo()+"\n");
                System.out.println("Masažam būs piemeroti garra zivis");
                break;
            default:
                System.out.println("ievadi pareizo skaitli");
        }

        ArrayList<Fisch> Fisch=new ArrayList<>();
        Fisch.add(pike);
        Fisch.add(catfish);
        Fisch.add(Garra);




        for (Fisch i:Fisch) {
            i.writeFile(Fisch);

        }






    }
}