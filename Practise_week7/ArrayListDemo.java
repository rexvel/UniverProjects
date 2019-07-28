package Practise_week7;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;




public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();
        ArrayList<String>LocDate =new ArrayList<>();
        ArrayList<String>AddedTime=new ArrayList<>();

    System.out.println("Enter items for the list, when "+
        "prompted.");
        boolean done = false;
        Scanner keyboard = new Scanner(System.in);
        while (!done) {
            System.out.println("Type an entry:");
            String entry = keyboard.nextLine();
            toDoList.add(entry);
            System.out.println("Type approximately how much time will this activity take:");
            String time = keyboard.nextLine();

            LocDate.add(time.replaceAll("\\D+",""));
            AddedTime.add(String.valueOf(LocalTime.now()));

            System.out.print("More items for the list? ");
            String ans = keyboard.nextLine();


            if (!ans.equalsIgnoreCase ("yes")) done = true;
                    System.out.println("The list contains:");
            /**
             *
             * Закоментований цикл(базовий)
             */

              /*  for (int position = 0; position < listSize; position++)
            System.out.println(toDoList.get(position));*/

            int listSize = toDoList.size();
            /*   for(String elem :toDoList){
                System.out.println(elem+",");


            }*/
               for(int i=0; i<listSize;i++){
                   System.out.println( toDoList.get(i));
                   System.out.println(LocDate.get(i));
                   System.out.println(AddedTime.get(i));
                   int res = Integer.parseInt(LocDate.get(i));


               }



        }
    }
}