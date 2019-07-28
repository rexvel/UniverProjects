package Practise_week7;
import  java.util.ArrayList;

public class arr {

    public static void main(String args[]) {


        ArrayList catNames = new ArrayList();

        ArrayList <Integer>numList = new ArrayList();

        numList.add(51);
        numList.add(14);
        numList.add(11);
        numList.add(12);
        numList.add(31);
        numList.add(21);
       /* catNames.add("Васька");
        catNames.add("biba");
        System.out.println(catNames.contains("biba"));*/
        System.out.println("Origin: "+ numList.toString());
        numList.removeIf(i ->(i > 10&& i <40));

        System.out.println("After: "+ numList.toString());
    }
}
