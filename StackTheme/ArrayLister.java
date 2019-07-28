package StackTheme;

import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ArrayList;

import java.util.Scanner;

class Stack1 {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack1(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void addElementToStack(int element) {
        stackArray[++top] = element;
    }

    public int deleteElementFromStack() {
        return stackArray[top--];
    }

    public int readTop() {
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

 class ClassicStack {

     public static void main(String[] args) {


         ArrayList<String> Numbers = new ArrayList<String>();


         boolean done = false;
         Scanner keyboard = new Scanner(System.in);
         Stack1 theStack = new Stack1(10);


         while (!done) {

                 System.out.println("Type an entry:");
                 String entry = keyboard.nextLine();
                 Numbers.add(entry);



                 System.out.print("More items for the list? ");
                 String ans = keyboard.nextLine();


                 if (!ans.equalsIgnoreCase("yes")) done = true;
                 System.out.println("The list contains:");


                 String[] stringArray = Numbers.toArray(new String[0]);

                 for(int i=0;i<stringArray.length;i++){
                     System.out.println(stringArray[i]);
                 }



             }
         }
     }
