/******************************************************************************
 * Name: Romanenko Illya
 * NetID: romanenko.im
 * Precept: week 12
 *
 * Description: пошук найменшого і найбільшого елементу масиву.
 *****************************************************************************/


package week1;



public class FindMinMax {
    public static void main(String [] args ){

        int N = 60;

        int Array[] = new int[N];


        for (int i = 0; i < N; i++) {

            Array[i] = (int) (Math.random() * (60-1)+1 );

            System.out.print(Array[i]+"num "+i+" ");
        }
        int min = Array[0] ;
        for (int i = 0; i < N; i++) {

            if   (Array[i]<min){

                min = Array[i];
            }

        }
        int max = Array[0];
        for (int i = 0;i<N;i++){
            if (Array[i] > max){

                max = Array[i];


            }

        }
        System.out.println();

        System.out.println( "The least number in HighArray  is:"+min);

        System.out.println("The largest number in HighArray is:"+ max);
    }

}
