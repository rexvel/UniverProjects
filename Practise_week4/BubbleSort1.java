package Practise_week4;

import java.sql.Time;

class Bubble1 {
        public static void Graph(double t[], int[] n) {

            //Set field of graphic
            StdDraw.setXscale(-2, 12);
            StdDraw.setYscale(-2, 12);
            StdDraw.text(11,11,"Bubble");
            //Creating axіs х
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.setPenRadius(0.005);
            StdDraw.line(0.0, 0.0, 10, 0);
            StdDraw.text(10, -1, "N");
            //Creating axis у
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.setPenRadius(0.005);
            StdDraw.line(0, 0, 0, 10);
            StdDraw.text(-1, 10, "Time");

            // calculation coordinate of x for each point
            double[] x = new double[n.length + 1];
            for (int i = 1; i <= n.length; i++) {
                x[i] = 11 / n.length * i;
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.setPenRadius(0.02);
                StdDraw.point(x[i], 0);
            }
            //calculation coordinate of  у for each point
            double[] tg = new double[t.length + 1];
            for (int i = 0; i < t.length; i++) {
                tg[i] = 10.0 / Math.ceil(t[t.length - 1]) * Math.ceil(t[i]);
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.setPenRadius(0.005);
                StdDraw.point(0, tg[i]);
            }
            for (int i = 0; i < t.length; i++) {
                StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
                StdDraw.setPenRadius(0.035);
                StdDraw.point(x[i+1], tg[i]);
            }
            for (int i = 1; i < t.length; i++) {
                    StdDraw.setPenRadius(0.01);
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.line(x[i], tg[i - 1], x[i + 1], tg[i]);

            }

        }
        public static void main(String[] args) {
/*
            long res;
            double[] t = new double[7];
            int[] n = {1_000, 15_00, 25_00, 50_00, 75_00, 100_00, 200_00};
            System.out.println("Number"+"\t"+ "Amount "+""+"\t"+ "Time");
            for (int i = 0; i < 7; i++) {
                int maxSize = n[i]; // Size of Array
                ArrayBub arr; // Link on Array
                arr = new ArrayBub(maxSize); // Creating of array

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
                Graph(t,n);*/

            }

        }

