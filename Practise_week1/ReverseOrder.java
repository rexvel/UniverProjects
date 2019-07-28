
/******************************************************************************
 * Name: Romanenko Illya
 * NetID: romanenko.im
 * Precept: week 12
 *
 * Description:програма,яка виконує алгоритм,який змнінює порядок елементів в масиві в оберненому порядку.
 *
 *****************************************************************************/

package week1;

public class ReverseOrder {
    public static void main(String[] args) {
        int temp;
        int N = 60;
        int Array[] = new int[N];

        for (int i = 0; i < N; i++) {

            Array[i] = (int) (Math.random() * 60 );

            System.out.print(Array[i]+"num"+i+" ");
            System.out.println(" ");
    }
        for (int i = 0; i < N/2; i++) {


            temp = Array[N - i - 1];
            Array[N - i - 1] = Array[i];
            Array[i] = temp;
        }

        for (int i=0; i<Array.length; i++){
            System.out.print(Array[i]+" ");
        }
    }
}
