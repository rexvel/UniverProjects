package week3;

public class BubbleSort
{

    private long [] a;// link on array
    private int elem ;  // counts elements in array






    public void selectionSort() {
        int out, in, min;


        for (out = elem - 1; out > 1; out--)
            for (in = 0; in < out; in++) {

                if (a[in] > a[in + 1]) {
                    swap(in,in+1);
                }
            }
    }
    private  void swap (int one ,int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }



    public void display() // Вывод содержимого массива
    {
        for(int j=0; j<elem; j++) // Для каждого элемента
            System.out.print(a[j] + " "); // Вывод
        System.out.println("");
    }



    public BubbleSort(int max) // Конструктор
    {
        a = new long[max]; // Создание массива
        elem = 0; // Пока нет ни одного элемента
    }


    public void insert(long value) // Вставка элемента в массив
    {

        a[elem] = value; // Собственно вставка
        elem++; // Увеличение размера
    }








    public static void main (String [] args){


        BubbleSort arr;
        arr = new BubbleSort(100);


        arr.insert(12);
        arr.insert(32);
        arr.insert(12);
        arr.insert(122);
        arr.insert(121);
        arr.insert(19);
        arr.insert(120);

        arr.selectionSort();;
        arr.display();



    }
}
