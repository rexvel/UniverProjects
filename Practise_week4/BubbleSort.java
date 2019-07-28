/*

package Practise_week4;


import java.awt.*;

class  BubbleSort {
        public static void fillArrRandom(int arr[], int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (a + Math.random() * (b - a) + 1);
        }
    }

    public void selectionSort(int arr [])
    {
        int out, in, min;
        for(out=0; out<arr.length-1; out++) // Внешний цикл
        {
            min = out; // Минимум
            for(in=out+1; in<arr.length; in++) // Внутренний цикл
                if(a[in] < a[min] ) // Если значение min больше,
                    min = in; // значит, найден новый минимум
            swap(out, min); // swap them
        }
    }
    //--------------------------------------------------------------
    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public static void TableOutput(int ThelowesNum, int ThebiggestNum, int step) {
        System.out.println("Num " + "\t" + "Amount" + "\t\t\t\t" + "Time");

        int AmountofPoints = (ThebiggestNum - ThelowesNum) / step;
        int k = 0;

        int data[][] = new int[AmountofPoints + 1][2];


        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println();
        }

        long StartTime, EndTime;
        int FinalTime;


        for (int i = ThelowesNum; i <= ThebiggestNum; i += step) {
            int arr[] = new int[i];
            StartTime = System.nanoTime();
            fillArrRandom(arr, 0, 9);
            bubbleSort(arr);
            EndTime = System.nanoTime();
            FinalTime = (int) (EndTime - StartTime) / 100000;
            k++;
            System.out.println(k + "\t\t" + arr.length + "\t\t\t\t" + FinalTime);
            data[k - 1][0] = arr.length;
            data[k - 1][1] = FinalTime;
        }

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println(data.length + " Data length");
            System.out.println();
            System.out.println(data[i].length + " i.length");

        }
    }

    private static void Graphic(double[] t, int[] n) {

            // Виведенння осей графкіку
        StdDraw.setXscale(-2, 12);
        StdDraw.setYscale(-2, 12);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.01);
        StdDraw.line(0, 0, 0, 10);
        StdDraw.line(0, 0, 10, 0);



        //обрахунок координат х
        double[] ng = new double[n.length + 1];
        for (int i = 1; i <= n.length; i++) {
            ng[i] = 11 / n.length * i;
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.setPenRadius(0.02);
            StdDraw.point(ng[i], 0);
        }



        //обрахунок координат у
        double[] tg = new double[t.length + 1];
        for (int i = 0; i < t.length; i++) {
            tg[i] = 10.0 / Math.ceil(t[t.length - 1]) * Math.ceil(t[i]);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.setPenRadius(0.02);
            StdDraw.point(0, tg[i]);
        }


        //Намалювання ліній

        //Намалювання точок
        for (int i = 0; i < t.length; i++) {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.setPenRadius(0.02);
            StdDraw.point(ng[i + 1], tg[i]);
        }

        for (int i = 0; i < t.length; i++) {
            if (i != 0) {
                StdDraw.setPenRadius(0.005);
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.line(ng[i], tg[i - 1], ng[i + 1], tg[i]);
            }
        }
    }


    public static void main(String[] args) {

        long res;
        double[] t = new double[7];
        int[] n = {1_00, 10_00, 25_00, 50_00, 75_00, 100_00, 200_00};

        for (int i = 0; i < 7; i++) {
            int maxSize = n[i]; // Размер массива
            ArrayBub arr; // Ссылка на массив
            arr = new ArrayBub(maxSize); // Создание массива

            for (int j = 0; j < maxSize; j++) {
                arr.insert((long) (Math.random() * n[i]));

            }
            long t1, t2;
            t1 = System.nanoTime();
            arr.bubbleSort();
            t2 = System.nanoTime();
            res = (t2 - t1);
            t[i] = res / 1e6;
            System.out.println("№ " + (i + 1) + "    " + n[i] + "    " + t[i]);
            Graphic(t, n);

        }
    }
}*/
