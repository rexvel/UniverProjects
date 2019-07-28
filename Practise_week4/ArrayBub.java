package Practise_week4;


class Array
{
    private long[] a; //
    private int nElems; //


    public Array(int max) //
    {
        a = new long[max]; //
        nElems = 0; //

    }

    public void insert(long value) //
    {
        a[nElems] = value; //
        nElems++; //
    }

    public long in(int value)
    {
        long s=a[value] ;
        return s;
    }


    public void bubbleSort()
    {
        int out, in;
        for(out=nElems-1; out>1; out--) //
            for(in=0; in<out; in++) //
                if( a[in] > a[in+1] ) //
                    swap(in, in+1); //
    }

    public void selectionSort()
    {
        int out, in, min;
        for(out=0; out<nElems-1; out++) //
        {
            min = out; // �������
            for(in=out+1; in<nElems; in++) //
                if(a[in] < a[min] ) //
                    min = in; //
            swap(out, min); // swap them
        }
    }

    public void insertionSort()
    {
        int in, out;
        for(out=1; out<nElems; out++) // out -
        {
            long temp = a[out]; //
            in = out;
            while(in>0 && a[in-1] >= temp)
            {
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
    }

    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

class SortIn
{
    public static void main(String[] args)
    {
        long res;
        //
        double[] tb1= new double[7];
        double[] ts1= new double[7];
        double[] ti1= new double[7];


        double[] tb2= new double[7];
        double[] ts2= new double[7];
        double[] ti2= new double[7];


        double[] tb3= new double[7];
        double[] ts3= new double[7];
        double[] ti3= new double[7];

        int[] n= {2_500,5_000,7_500,10_000,15_000,17_500,50000};
        double tmax=0;

        for(int i=0;i<7;i++) {
            int maxSize = n[i]; //
            Array arrb1,arrs1,arri1,arrb2,arrs2,arri2,arrb3,arrs3,arri3; //

            arrb1 = new Array(maxSize);
            arrs1 = new Array(maxSize);
            arri1 = new Array(maxSize);

            arrb2 = new Array(maxSize);
            arrs2 = new Array(maxSize);
            arri2 = new Array(maxSize);

            arrb3 = new Array(maxSize);
            arrs3 = new Array(maxSize);
            arri3 = new Array(maxSize);


            for(int j=0;j<maxSize;j++)
            {

                //випадкові ,з діапазону
                arrb1.insert((long) (Math.random()*n[i]));
                arrs1.insert(arrb1.in(j));
                arri1.insert(arrb1.in(j));

                //майже відсортовані
                arrb2.insert((long) j);
                arrs2.insert(arrb2.in(j));
                arri2.insert(arrb2.in(j));

                //Відсортовані в оберненому порядку
                arrb3.insert((long) maxSize-j);
                arrs3.insert(arrb3.in(j));
                arri3.insert(arrb3.in(j));

            }
            long t1,t2;

            //Bubble
            t1=System.nanoTime();
            arrb1.bubbleSort();
            t2=System.nanoTime();
            res=(t2-t1);
            tb1[i]=res/1e6;
                if(tb1[i]>tmax) {
                tmax=tb1[i];}

            t1=System.nanoTime();
            arrb2.bubbleSort();
            t2=System.nanoTime();
            res=(t2-t1);
            tb2[i]=res/1e6;
            if(tb2[i]>tmax) {
                tmax=tb2[i];}

            t1=System.nanoTime();
            arrb3.bubbleSort();
            t2=System.nanoTime();
            res=(t2-t1);
            tb3[i]=res/1e6;
            if(tb3[i]>tmax) {
                tmax=tb3[i];}


            //Selection
            t1=System.nanoTime();
            arrs1.selectionSort();
            t2=System.nanoTime();
            res=(t2-t1);
            ts1[i]=res/1e6;
            if(ts1[i]>tmax) {
                tmax=ts1[i];}

            t1=System.nanoTime();
            arrs2.selectionSort();
            t2=System.nanoTime();
            res=(t2-t1);
            ts2[i]=res/1e6;
            if(ts2[i]>tmax) {
                tmax=ts2[i];}

            t1=System.nanoTime();
            arrs3.selectionSort();
            t2=System.nanoTime();
            res=(t2-t1);
            ts3[i]=res/1e6;
            if(ts3[i]>tmax) {
                tmax=ts3[i];}



            //Insertion
            t1=System.nanoTime();
            arri1.insertionSort();
            t2=System.nanoTime();
            res=(t2-t1);
            ti1[i]=res/1e6;
            if(ti1[i]>tmax) {
                tmax=ti1[i];}

            t1=System.nanoTime();
            arri2.insertionSort();
            t2=System.nanoTime();
            res=(t2-t1);
            ti2[i]=res/1e6;
            if(ti2[i]>tmax) {
                tmax=ti2[i];}

            t1=System.nanoTime();
            arri3.insertionSort();
            t2=System.nanoTime();
            res=(t2-t1);
            ti3[i]=res/1e6;
            if(ti3[i]>tmax) {
                tmax=ti3[i];}
        }

        Graphic(tb1, n, tmax, 1);   //1 - blue color
        Graphic(ts1, n, tmax, 2);   //2 -  green color
        Graphic(ti1, n, tmax, 3);   //3 - orange color*/


        Graphic1(tb2, n, tmax, 1);   //1 - blue color
        Graphic1(ts2, n, tmax, 2);   //2 -  green color
        Graphic1(ti2, n, tmax, 3);   //3 - orange color


        Graphic2(tb3, n, tmax, 1);   //1 - blue color
        Graphic2(ts3, n, tmax, 2);   //2 -  green color
        Graphic2(ti3, n, tmax, 3);   //3 - orange color

        System.out.println("Випадкові");
        System.out.println("N"+"\t"+"Bubble Sort,ms"+"\t"+"Selection Sort,ms"+"\t"+"Insertion Sort,ms"+"\t");
        for(int i=0;i<7;i++) {
            System.out.println((i+1)+"\t"+n[i]+"\t"+tb1[i]+"\t"+ts1[i]+"\t"+ti1[i]+"\t");
        }
        System.out.println();
        System.out.println();
        System.out.println("Майже відсортований масив");
        System.out.println("N"+"\t"+"Bubble Sort,ms"+"\t"+"Selection Sort,ms"+"\t"+"Insertion Sort,ms"+"\t");
        for(int i=0;i<7;i++) {
            System.out.println((i+1)+"\t"+n[i]+"\t"+tb2[i]+"\t"+ts2[i]+"\t"+ti2[i]+"\t");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("В оберненому порядку");
        System.out.println("N"+"\t"+"Bubble Sort,ms"+"\t"+"Selection Sort,ms"+"\t"+"Insertion Sort,ms"+"\t");
        for(int i=0;i<7;i++) {
            System.out.println((i+1)+"\t"+n[i]+"\t"+tb3[i]+"\t"+ts3[i]+"\t"+ti3[i]+"\t");
        }
        System.out.println();
        System.out.println();
    }

    private static void Graphic(double[] t, int[] n, double mt, int color) {
        StdDraw.setXscale(-2, 12);
        StdDraw.setYscale(-2,20);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.01);
        StdDraw.line(0, 0, 0, 30    );
         StdDraw.line(0, 0, 11, 0);
        StdDraw.line(0 ,12, 11 ,12);

        double[] ng=new double[n.length+1];
        for(int i=1;i<=n.length;i++) {
            ng[i]=10.0/n.length*i;
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.setPenRadius(0.02);
            StdDraw.point( ng[i],0);
        }


        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(-1,9.5,"T");
        StdDraw.text(11,  -1 ,"N");
        StdDraw.text(11,10,"Bubble");
        StdDraw.text(11,1,"Insert");
        StdDraw.text(11,2,"Selection");


        double[] tg=new double[t.length+1];
        for(int i=0;i<t.length;i++) {
            tg[i]=10.0/mt*Math.ceil(t[i]);
        }
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(0.02);
        StdDraw.point( 0, 0);
        StdDraw.point( 0, 10);

        for(int i=0;i<t.length;i++) {
            if(i!=0) {
                StdDraw.setPenRadius(0.005);
                if(color==1) {
                    StdDraw.setPenColor(StdDraw.BLACK);}
                if(color==2) {
                    StdDraw.setPenColor(StdDraw.GREEN)
                    ;}
                if(color==3) {
                    StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);}
                StdDraw.line(ng[i], tg[i-1], ng[i+1], tg[i]);
            }
        }
        for(int i=0;i<t.length;i++) {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.setPenRadius(0.02);
            StdDraw.point( ng[i+1], tg[i]);
        }
    }



    private static void Graphic1(double[] t, int[] n, double mt, int color) {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.01);

        StdDraw.line(0, 0, 0, 30    );
        StdDraw.setPenRadius(0.009);
        StdDraw.line(0 ,16, 11 ,16);

        double[] ng=new double[n.length+1];
        for(int i=1;i<=n.length;i++) {
            ng[i]=10.0/n.length*i;
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.setPenRadius(0.02);
            StdDraw.point( ng[i],0);
        }


        StdDraw.setPenColor(StdDraw.BLACK);
        /*StdDraw.text(-1,9.5,"T");
        StdDraw.text(11,  -1 ,"N");
        StdDraw.text(11,10,"Bubble");
        StdDraw.text(11,1,"Insert");
        StdDraw.text(11,2,"Selection");
*/

        double[] tg=new double[t.length+1];
        for(int i=0;i<t.length;i++) {
            tg[i]=10.0/mt*Math.ceil(t[i]);
        }
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(0.02);
        StdDraw.point( 0, 0);
        StdDraw.point( 0, 10);

        for(int i=0;i<t.length;i++) {
            if(i!=0) {
                StdDraw.setPenRadius(0.005);
                if(color==1) {
                    StdDraw.setPenColor(StdDraw.BLACK);}
                if(color==2) {
                    StdDraw.setPenColor(StdDraw.GREEN)
                    ;}
                if(color==3) {
                    StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);}
                StdDraw.line(ng[i], tg[i-1]+12, ng[i+1], tg[i]+12);
            }
        }
        for(int i=0;i<t.length;i++) {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.setPenRadius(0.02);
            StdDraw.point( ng[i+1], tg[i]+12);
        }
    }


    private static void Graphic2(double[] t, int[] n, double mt, int color) {

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenRadius(0.009);
        StdDraw.line(0 ,16, 11 ,16);

        double[] ng=new double[n.length+1];
        for(int i=1;i<=n.length;i++) {
            ng[i]=10.0/n.length*i;
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.setPenRadius(0.02);
            StdDraw.point( ng[i],0);
        }


        StdDraw.setPenColor(StdDraw.BLACK);


        double[] tg=new double[t.length+1];
        for(int i=0;i<t.length;i++) {
            tg[i]=10.0/mt*Math.ceil(t[i]);
        }
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(0.02);
        StdDraw.point( 0, 0);
        StdDraw.point( 0, 10);

        for(int i=0;i<t.length;i++) {
            if(i!=0) {
                StdDraw.setPenRadius(0.005);
                if(color==1) {
                    StdDraw.setPenColor(StdDraw.BLACK);}
                if(color==2) {
                    StdDraw.setPenColor(StdDraw.GREEN)
                    ;}
                if(color==3) {
                    StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);}
                StdDraw.line(ng[i], tg[i-1]+16, ng[i+1], tg[i]+16);
            }
        }
        for(int i=0;i<t.length;i++) {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.setPenRadius(0.02);
            StdDraw.point( ng[i+1], tg[i]+16);
        }
    }
}




