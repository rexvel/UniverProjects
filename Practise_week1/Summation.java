// Инициализация одного объекта посредством другого
package  week1;
class Summation {
    int sum;

    // Создать объект на основе целочисленного значения
    Summation(int num) {
        sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;
    }

    Summation(Summation ob) {
        sum = ob.sum;
    }
}


        class SumDemo {
                    public static void main(String args[]){
                        Summation s1 = new Summation(5);
                            Summation s2 = new Summation(s1);
                                System.out.println("sl.sum:" + s1.sum);
                                    System.out.println("s2.surn: " + s2.sum);
                                }
                            }