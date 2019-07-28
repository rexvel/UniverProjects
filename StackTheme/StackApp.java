package  StackTheme;
import java.util.Scanner;


class StackX
{
    private int maxSize; // Размер массива
    private long[] stackArray;
    private int top; // Вершина стека
    //--------------------------------------------------------------
    public StackX(int s) // Конструктор
    {
        maxSize = s; // Определение размера стека
        stackArray = new long[maxSize]; // Создание массива
        top = -1; // Пока нет ни одного элемента
    }
    //--------------------------------------------------------------
    public void push(long j) // Размещение элемента на вершине стека
    {
        stackArray[++top] = j; // Увеличение top, вставка элемента
    }
    //--------------------------------------------------------------
    public long pop() // Извлечение элемента с вершины стека
    {
        return stackArray[top--]; // Извлечение элемента, уменьшение top
    }
    //--------------------------------------------------------------
    public long peek() // Чтение элемента с вершины стека
    {
        return stackArray[top];
    }
    //--------------------------------------------------------------
    public boolean isEmpty() // True, если стек пуст
    {
        return (top == -1);
    }
    //--------------------------------------------------------------
    public boolean isFull() // True, если стек полон
    {
        return (top == maxSize-1);
    }
//--------------------------------------------------------------
} // Конец класса StackX
////////////////////////////////////////////////////////////////
class StackApp
{
    public static void main(String[] args)
    {
        boolean done=false;
        while(!done) {
            System.out.println("Okay dude,so what is your choice:true or false?");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            boolean bull = Boolean.valueOf(input);

            if (!bull) {
                System.out.println("Stack ordered array");
                reverseorder(false);
            }
            else  {
                reverseorder2(bull);
            }
            System.out.println("Another one chance?");
            String ans = in.nextLine();
            if (!ans.equalsIgnoreCase("yes")) done = true;
            else if(!ans.equalsIgnoreCase("no")) done = false;
            System.out.println("Quit from the current programm");


        }
    }

    public static void reverseorder(boolean bull){

        Scanner in = new Scanner(System.in);
        boolean bool = false;
        int c=0;
        System.out.println("How many numbers might be in a stack?");
        int count = in.nextInt();
        System.out.println(count+" Numbers in the stack");
        StackX theStack = new StackX(count); // Создание нового стека
        while(!bool){
            long num = in.nextLong();
            theStack.push(num);
            c++;
            if (c==count)
                break;

        }
        while( !theStack.isEmpty() ) // Пока стек не станет пустым
        { // Удалить элемент из стека
            long value = theStack.pop();
            System.out.print(value); // Вывод содержимого
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void reverseorder2(boolean bull){

        Scanner in = new Scanner(System.in);
        System.out.println("Input amount of numbers in array ");

        int size = in.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();


        System.out.println("");
    }





}